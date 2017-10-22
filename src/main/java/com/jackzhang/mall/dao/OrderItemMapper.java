package com.jackzhang.mall.dao;

import com.jackzhang.mall.model.OrderItem;

public interface OrderItemMapper {
    int insert(OrderItem record);

    int insertSelective(OrderItem record);
}