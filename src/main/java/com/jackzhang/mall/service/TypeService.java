package com.jackzhang.mall.service;

import com.jackzhang.mall.common.ResponseData;
import com.jackzhang.mall.model.Type;

import java.util.List;

/**
 * Created by Jack on 2017/11/1.
 */
public interface TypeService {

    public ResponseData<String> add(Type type);

    public ResponseData<String> update(Type type);

    public ResponseData<List<Type>> getSubType(String fid);


}
