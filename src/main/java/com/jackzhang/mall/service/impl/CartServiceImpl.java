package com.jackzhang.mall.service.impl;

import com.jackzhang.mall.common.ResponseData;
import com.jackzhang.mall.dao.CartMapper;
import com.jackzhang.mall.model.Cart;
import com.jackzhang.mall.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jack on 2017/11/13.
 */
@Service
public class CartServiceImpl implements CartService{
    @Autowired
    private CartMapper cartMapper;

    public ResponseData add(int userId,int goodId,int count){
        //1、先查询当前商品是否已在购物车
        Cart cart=cartMapper.selectCartByUserIdGoodId(userId,goodId);
        //2、购物车为空，创建一个购物车
        if (cart==null){
            Cart cartNew=new Cart();
            cartNew.setUserId(userId);
            cartNew.setChecked(1);
            cartNew.setGoodId(goodId);
        }else {
            //3、购物车不为空，更新对应商品数量（+1）
            cart.setQuantity(cart.getQuantity()+1);
            cartMapper.updateByPrimaryKeySelective(cart);

        }

    }

}
