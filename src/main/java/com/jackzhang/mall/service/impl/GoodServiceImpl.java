package com.jackzhang.mall.service.impl;

import com.jackzhang.mall.common.ResponseData;
import com.jackzhang.mall.dao.GoodMapper;
import com.jackzhang.mall.model.Good;
import com.jackzhang.mall.service.GoodService;
import com.jackzhang.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jack on 2017/11/8.
 */
@Service("GoodService")
public class GoodServiceImpl implements GoodService{

    @Autowired
    private GoodMapper goodMapper;

    public ResponseData<String> saveGood(Good good){
        if (good==null){
            return new ResponseData<String>().isOk(0).msg("商品参数出错");
        }
        int count=goodMapper.insert(good);
        if (count==0){
            return new ResponseData<String>().isOk(0).msg("商品添加出错");
        }
        return new ResponseData<String>().isOk(1).msg("商品添加成功");
    }
}

