package com.jackzhang.mall.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Jack on 2017/11/13.
 */
public class CartVo {
    private List<CartGoodsVo> cartGoodsVoList;
    private BigDecimal cartTotalPrice;
    private Boolean allChecked;//是否已经都勾选

    public List<CartGoodsVo> getCartGoodsVoList() {
        return cartGoodsVoList;
    }

    public void setCartGoodsVoList(List<CartGoodsVo> cartGoodsVoList) {
        this.cartGoodsVoList = cartGoodsVoList;
    }

    public BigDecimal getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(BigDecimal cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public Boolean getAllChecked() {
        return allChecked;
    }

    public void setAllChecked(Boolean allChecked) {
        this.allChecked = allChecked;
    }
}
