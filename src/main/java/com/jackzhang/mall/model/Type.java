package com.jackzhang.mall.model;

public class Type {
    private Integer type_id;

    private String name;

    private String fid;

    private Integer state;

    public Type(Integer typeId, String name, String fid, Integer state) {
        this.type_id = typeId;
        this.name = name;
        this.fid = fid;
        this.state = state;
    }

    public Type() {
        super();
    }

    public Integer getTypeId() {
        return type_id;
    }

    public void setTypeId(Integer typeId) {
        this.type_id = typeId ;
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

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}