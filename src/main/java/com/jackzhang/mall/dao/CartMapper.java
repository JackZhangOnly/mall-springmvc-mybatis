package com.jackzhang.mall.dao;

import com.jackzhang.mall.model.Cart;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Jack on 2017/11/13.
 */
public interface CartMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectCartByUserIdGoodId(@Param(value = "userId") int userId,@Param(value = "goodId") int goodId);
}
