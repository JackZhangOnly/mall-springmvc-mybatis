package com.jackzhang.mall.controller;

import com.jackzhang.mall.common.Constants;
import com.jackzhang.mall.common.ResponseData;
import com.jackzhang.mall.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Jack
 */
@Controller
@RequestMapping("/order/")
public class OrderController {

    private static  final Logger logger = LoggerFactory.getLogger(OrderController.class);


    @RequestMapping(value = "orderCreate.do",method = RequestMethod.POST)
    public ResponseData<String> orderCreate(HttpSession session){
        User user=(User) session.getAttribute(Constants.SESSION_USER);
        if (user==null){
            return new ResponseData<String>().isOk(0).msg("未登录");
        }

        return null;
    }

}
