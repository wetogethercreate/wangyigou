package com.wangyigou.domain.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 通用实体类
 * 包名:com.pinyougou.entity
 * 作者:Fred
 * 日期:2018/10/27  11:00
 */
public class PageResult<T> implements Serializable {

    private Long total;//总记录数
    private List<T> rows;//查询的结果

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
