package com.wangyigou.domain.pojogroup;


import com.wangyigou.domain.pojo.TbOrderItem;

import java.io.Serializable;
import java.util.List;

/**
 * 加入购物车的商品订单,每一个cart代表一个商家的集合
 */
public class Cart implements Serializable {
    private String sellerId;//商家ID
    private String sellerName;//商家名称
    private List<TbOrderItem> orderItemList;//购物车明细

    public String getSellerId() {
        return sellerId;
    }

    public Cart setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    public String getSellerName() {
        return sellerName;
    }

    public Cart setSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }

    public List<TbOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public Cart setOrderItemList(List<TbOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
        return this;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "sellerId='" + sellerId + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", orderItemList=" + orderItemList +
                '}';
    }
}