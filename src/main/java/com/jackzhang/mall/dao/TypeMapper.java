package com.jackzhang.mall.dao;

import com.jackzhang.mall.model.Type;

import java.util.List;

public interface TypeMapper {
    int deleteByPrimaryKey(String typeId);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(String typeId);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    List<Type> getSubType(String fid);
}