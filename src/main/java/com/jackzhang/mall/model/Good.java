package com.jackzhang.mall.model;

public class Good {
    private String goodsId;

    private String name;

    private Double price;

    private String img;

    private String desc;

    private String typeId;

    private Boolean state;

    private String createtime;

    public Good(String goodsId, String name, Double price, String img, String desc, String typeId, Boolean state, String createtime) {
        this.goodsId = goodsId;
        this.name = name;
        this.price = price;
        this.img = img;
        this.desc = desc;
        this.typeId = typeId;
        this.state = state;
        this.createtime = createtime;
    }

    public Good() {
        super();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }
}