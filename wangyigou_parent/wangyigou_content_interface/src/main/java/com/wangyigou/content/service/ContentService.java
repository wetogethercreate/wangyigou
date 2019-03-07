package com.wangyigou.content.service;

import com.wangyigou.domain.pojo.TbContent;

import java.util.List;

/**
 * 包名:com.wangyigou.content.service
 * 作者:Fred
 * 日期:2019/1/30  15:22
 */
public interface ContentService {
    List<TbContent> findAll();

    List<TbContent> findByCategoryId(Long categoryId);
}
