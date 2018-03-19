package com.jackzhang.mall.controller;

import com.jackzhang.mall.common.Constants;
import com.jackzhang.mall.common.ResponseData;
import com.jackzhang.mall.model.CartVo;
import com.jackzhang.mall.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Jack on 2017/11/13.
 */
@Controller
@RequestMapping("/cart/")
public class CardController {

    public ResponseData<CartVo> addToCart(HttpSession session,int count,String goodId){
        User user=(User) session.getAttribute(Constants.SESSION_USER);
        if (user==null){
            return new ResponseData<CartVo>().isOk(0).msg("未登录");
        }

    }
}
