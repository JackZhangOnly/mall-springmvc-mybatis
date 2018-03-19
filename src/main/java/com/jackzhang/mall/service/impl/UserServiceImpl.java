package com.jackzhang.mall.service.impl;

import com.jackzhang.mall.common.ResponseData;
import com.jackzhang.mall.dao.UserMapper;
import com.jackzhang.mall.model.User;
import com.jackzhang.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jack on 2017/10/23.
 */
@Service("UserService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public ResponseData<User> login(String name, String password) {
        //实际密码需要加密
        User user=userMapper.login(name,password);
        ResponseData<User> responseData=new ResponseData<>();
        if (user==null){
            responseData.isOk(0).msg("用户名或密码错误！");
        }else {
            responseData.isOk(1).msg("成功").data(user);
        }
        return responseData;
    }
    public ResponseData<String> register(User user){
        ResponseData<String> responseData=new ResponseData();
        if (user==null){
            responseData.isOk(0).msg("参数出错");
        }
        int count=userMapper.insert(user);
        if (count==1){
            responseData.isOk(1).msg("注册成功");
        }else{
            responseData.isOk(1).msg("注册失败");
        }
        return responseData;
    }
}
