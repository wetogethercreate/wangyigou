package com.wangyigou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wangyigou.domain.entity.Result;
import com.wangyigou.domain.pojo.TbBrand;
import com.wangyigou.sellgoods.service.BrandService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 包名:com.wangyigou.controller
 * 作者:Fred
 * 日期:2019/1/25  14:56
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    /**
     * 查询所有品牌
     */
    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }

    /**
     * 保存品牌
     */
    @RequestMapping("/save")
    public Result findAll(@RequestBody TbBrand brand){
        return brandService.save(brand);
    }
}
