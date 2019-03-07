package com.wangyigou.portal.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wangyigou.content.service.ContentService;
import com.wangyigou.domain.pojo.TbContent;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 包名:com.wangyigou.portal.controller
 * 作者:Fred
 * 日期:2019/2/13  14:22
 */
@RestController
@RequestMapping("/content")
public class ContentController {
    @Reference
    private ContentService contentService;

    /**
     * 根据广告类型id来查询广告列表
     * @param categoryId
     * @return
     */
    @RequestMapping("/findByCategoryId")
    public List<TbContent> findByCategoryId(Long categoryId){
        return contentService.findByCategoryId(categoryId);
    }
}
