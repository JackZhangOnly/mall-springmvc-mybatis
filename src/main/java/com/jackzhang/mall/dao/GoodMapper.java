package com.jackzhang.mall.dao;

import com.jackzhang.mall.model.Good;

public interface GoodMapper {
    int deleteByPrimaryKey(String goodsId);

    int insert(Good record);

    int insertSelective(Good record);

    Good selectByPrimaryKey(String goodsId);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);
}