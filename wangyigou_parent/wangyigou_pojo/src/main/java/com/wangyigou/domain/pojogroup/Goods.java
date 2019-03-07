package com.wangyigou.domain.pojogroup;


import com.wangyigou.domain.pojo.TbGoods;
import com.wangyigou.domain.pojo.TbGoodsDesc;
import com.wangyigou.domain.pojo.TbItem;

import java.io.Serializable;
import java.util.List;

/**
 * 创建商品组合体
 * 包名:com.pinyougou.pojogroup
 * 作者:Fred
 * 日期:2018/11/1  16:37
 */
public class Goods implements Serializable {

    private TbGoods goods;
    private TbGoodsDesc goodsDesc;
    private List<TbItem> itemList;//商品SKU列表

    public TbGoods getGoods() {
        return goods;
    }

    public void setGoods(TbGoods goods) {
        this.goods = goods;
    }

    public TbGoodsDesc getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(TbGoodsDesc goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public List<TbItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<TbItem> itemList) {
        this.itemList = itemList;
    }
}
