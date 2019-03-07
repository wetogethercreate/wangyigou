package com.wangyigou.sellgoods.service;

import com.wangyigou.domain.entity.Result;
import com.wangyigou.domain.pojo.TbBrand;

import java.util.List;

/**
 * 包名:com.wangyigou.service
 * 作者:Fred
 * 日期:2019/1/25  14:57
 */
public interface BrandService {

    public List<TbBrand> findAll();

    public Result save(TbBrand brand);
}
