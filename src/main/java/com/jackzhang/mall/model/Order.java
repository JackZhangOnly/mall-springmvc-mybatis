package com.jackzhang.mall.model;

import java.util.Date;

public class Order {
    private String orderId;

    private String consignee;

    private Double total;

    private String payment;

    private Boolean state;

    private String time;

    private String userId;

    private String address;

    private String phone;

    private String postcard;

    private String delivery;

    private String freight;

    private Boolean ispay;

    private Date createTime;

    public Order(String orderId, String consignee, Double total, String payment, Boolean state, String time, String userId, String address, String phone, String postcard, String delivery, String freight, Boolean ispay, Date createTime) {
        this.orderId = orderId;
        this.consignee = consignee;
        this.total = total;
        this.payment = payment;
        this.state = state;
        this.time = time;
        this.userId = userId;
        this.address = address;
        this.phone = phone;
        this.postcard = postcard;
        this.delivery = delivery;
        this.freight = freight;
        this.ispay = ispay;
        this.createTime = createTime;
    }

    public Order() {
        super();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPostcard() {
        return postcard;
    }

    public void setPostcard(String postcard) {
        this.postcard = postcard == null ? null : postcard.trim();
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery == null ? null : delivery.trim();
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight == null ? null : freight.trim();
    }

    public Boolean getIspay() {
        return ispay;
    }

    public void setIspay(Boolean ispay) {
        this.ispay = ispay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}