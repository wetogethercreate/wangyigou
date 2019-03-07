package com.wangyigou.content.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.abel533.entity.Example;
import com.wangyigou.content.service.ContentService;
import com.wangyigou.domain.pojo.TbContent;
import com.wangyigou.mapper.TbContentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

/**
 * 包名:com.wangyigou.content.service.impl
 * 作者:Fred
 * 日期:2019/1/30  15:24
 */
/**
 * 广告
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private TbContentMapper contentMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<TbContent> findAll() {
        return contentMapper.select(null);
    }

    @Override
    public List<TbContent> findByCategoryId(Long categoryId) {
        //使用redis作缓存
        List<TbContent> tbContents = (List<TbContent>) redisTemplate.boundHashOps("content").get(categoryId);
        if (tbContents==null || tbContents.size()<1) {
        //设置查询条件
        Example example = new Example(TbContent.class);
        Example.Criteria criteria = example.createCriteria();

        //相同的categoryId
        criteria.andEqualTo("categoryId", categoryId);

        //状态为1
        criteria.andEqualTo("status", "1");

        //设置排序
        example.setOrderByClause("sortOrder asc");
        tbContents = contentMapper.selectByExample(example);

        redisTemplate.boundHashOps("content").put(categoryId, tbContents);

        }else {
            System.out.println("从缓存中获取广告信息");
        }

        return tbContents;
    }

    /*@Override
    public List<TbContent> findByCategoryId(Long categoryId) {
        //使用redis作缓存
            //设置查询条件
            Example example = new Example(TbContent.class);
            Example.Criteria criteria = example.createCriteria();

            //相同的categoryId
            criteria.andEqualTo("categoryId", categoryId);

            //状态为1
            criteria.andEqualTo("status", "1");

            //设置排序
            example.setOrderByClause("sortOrder asc");
        List<TbContent> tbContents = contentMapper.selectByExample(example);

        return tbContents;
    }*/
}
