package com.jackzhang.mall.model;

public class Admin {
    private String adminId;

    private String name;

    private String password;

    private Boolean isfreeze;

    public Admin(String adminId, String name, String password, Boolean isfreeze) {
        this.adminId = adminId;
        this.name = name;
        this.password = password;
        this.isfreeze = isfreeze;
    }

    public Admin() {
        super();
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
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

    public Boolean getIsfreeze() {
        return isfreeze;
    }

    public void setIsfreeze(Boolean isfreeze) {
        this.isfreeze = isfreeze;
    }
}