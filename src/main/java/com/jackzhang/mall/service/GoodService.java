package com.jackzhang.mall.service;

import com.jackzhang.mall.common.ResponseData;
import com.jackzhang.mall.model.Good;

/**
 * Created by Jack
 */
public interface GoodService {
    public ResponseData<String> saveGood(Good good);
}
