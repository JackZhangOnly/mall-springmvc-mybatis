package com.jackzhang.mall.model;

import java.util.Date;

public class User {
    private String userId;

    private String name;

    private String password;

    private Boolean sex;

    private String address;

    private String phone;

    private String email;

    private Boolean isfreeze;

    private String time;

    private Double balance;

    private Boolean state;

    private String zip;

    private Date createTime;

    public User(String userId, String name, String password, Boolean sex, String address, String phone, String email, Boolean isfreeze, String time, Double balance, Boolean state, String zip, Date createTime) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.isfreeze = isfreeze;
        this.time = time;
        this.balance = balance;
        this.state = state;
        this.zip = zip;
        this.createTime = createTime;
    }

    public User() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getIsfreeze() {
        return isfreeze;
    }

    public void setIsfreeze(Boolean isfreeze) {
        this.isfreeze = isfreeze;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}