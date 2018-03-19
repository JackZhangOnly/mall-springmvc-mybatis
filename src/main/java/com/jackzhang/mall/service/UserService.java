package com.jackzhang.mall.service;

import com.jackzhang.mall.common.ResponseData;
import com.jackzhang.mall.model.User;

/**
 * Created by Jack on 2016/10/22.
 */
public interface UserService {
    /**
     * 登录
     * @param uname
     * @param upwd
     * @return
     */
    public ResponseData<User> login(String uname,String upwd);

    public ResponseData<String> register(User user);

}
