package com.jackzhang.mall.controller;

import com.jackzhang.mall.common.Constants;
import com.jackzhang.mall.common.ResponseData;
import com.jackzhang.mall.model.User;
import com.jackzhang.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Jack
 */
@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseData<User> login(String name, String password, HttpSession session){
        ResponseData<User> responseData=userService.login(name,password);
        if (responseData.isSuccess()){
            session.setAttribute(Constants.SESSION_USER,responseData.getData());
        }
        return responseData;
    }
    @RequestMapping(value = "loginout.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseData<String> logout(HttpSession session){
        session.removeAttribute(Constants.SESSION_USER);
        ResponseData<String> responseData=new ResponseData<>();
        responseData.isOk(1).msg("退出成功");
        return  responseData;
    }
    @RequestMapping(value = "register.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseData<String> register(User user){
        return userService.register(user);
    }

}
