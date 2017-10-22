package com.jackzhang.mall.model;

public class OrderItem {
    private String orderId;

    private String goodsId;

    public OrderItem(String orderId, String goodsId) {
        this.orderId = orderId;
        this.goodsId = goodsId;
    }

    public OrderItem() {
        super();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }
}