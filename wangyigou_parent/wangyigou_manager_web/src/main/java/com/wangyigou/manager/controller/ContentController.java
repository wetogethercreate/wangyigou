package com.wangyigou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wangyigou.content.service.ContentService;
import com.wangyigou.domain.pojo.TbContent;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 包名:com.wangyigou.manager.controller
 * 作者:Fred
 * 日期:2019/1/30  15:28
 */
@RestController
@RequestMapping("/content")
public class ContentController {

    @Reference
    private ContentService contentService;

    @RequestMapping("/findAll")
    public List<TbContent> findAll(){
        return contentService.findAll();
    }
}
