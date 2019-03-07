package com.wangyigou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wangyigou.domain.entity.Result;
import com.wangyigou.domain.pojo.TbBrand;
import com.wangyigou.mapper.TbBrandMapper;
import com.wangyigou.sellgoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 包名:com.wangyigou.service.impl
 * 作者:Fred
 * 日期:2019/1/25  14:58
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper brandMapper;

    /**
     * 查询所有品牌
     * @return
     */
    @Override
    public List<TbBrand> findAll() {
        return brandMapper.select(null);
    }

    /**
     * 保存品牌
     * @param brand
     * @return
     */
    @Override
    public Result save(TbBrand brand) {
        int i = brandMapper.insertSelective(brand);
        if (i < 0) {
            return new Result(false, "保存失败");
        }
        return new Result(true, "保存成功");
    }
}
