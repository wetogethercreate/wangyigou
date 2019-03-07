package com.wangyigou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wangyigou.content.service.ContentCategoryService;
import com.wangyigou.domain.pojo.TbContentCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 包名:com.wangyigou.manager.controller
 * 作者:Fred
 * 日期:2019/1/30  15:26
 */
@RestController
@RequestMapping("/contentCategory")
public class ContentCategoryController {

    @Reference
    private ContentCategoryService contentCategoryService;

    @RequestMapping("/findAll")
    public List<TbContentCategory> findAll(){
        return contentCategoryService.findAll();
    }

}
