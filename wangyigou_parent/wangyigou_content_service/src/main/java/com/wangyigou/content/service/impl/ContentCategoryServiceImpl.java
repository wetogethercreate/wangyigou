package com.wangyigou.content.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.abel533.entity.Example;
import com.wangyigou.content.service.ContentCategoryService;
import com.wangyigou.domain.pojo.TbContentCategory;
import com.wangyigou.mapper.TbContentCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 包名:com.wangyigou.content.service.impl
 * 作者:Fred
 * 日期:2019/1/30  15:23
 */

/**
 * 广告分类
 */
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

    @Autowired
    private TbContentCategoryMapper contentCategoryMapper;
    @Override
    public List<TbContentCategory> findAll() {

        return contentCategoryMapper.select(null);

    }
}
