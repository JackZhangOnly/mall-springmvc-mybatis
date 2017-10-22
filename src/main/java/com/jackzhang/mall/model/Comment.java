package com.jackzhang.mall.model;

public class Comment {
    private String commentsId;

    private String comment;

    private String goodsId;

    private String createtime;

    private String userId;

    public Comment(String commentsId, String comment, String goodsId, String createtime, String userId) {
        this.commentsId = commentsId;
        this.comment = comment;
        this.goodsId = goodsId;
        this.createtime = createtime;
        this.userId = userId;
    }

    public Comment() {
        super();
    }

    public String getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(String commentsId) {
        this.commentsId = commentsId == null ? null : commentsId.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}