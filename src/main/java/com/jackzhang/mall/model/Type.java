package com.jackzhang.mall.model;

public class Type {
    private String typeId;

    private String name;

    private String fid;

    private Boolean state;

    public Type(String typeId, String name, String fid, Boolean state) {
        this.typeId = typeId;
        this.name = name;
        this.fid = fid;
        this.state = state;
    }

    public Type() {
        super();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}