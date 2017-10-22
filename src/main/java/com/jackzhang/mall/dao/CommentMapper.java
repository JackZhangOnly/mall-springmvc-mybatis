package com.jackzhang.mall.dao;

import com.jackzhang.mall.model.Comment;

public interface CommentMapper {
    int deleteByPrimaryKey(String commentsId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(String commentsId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}