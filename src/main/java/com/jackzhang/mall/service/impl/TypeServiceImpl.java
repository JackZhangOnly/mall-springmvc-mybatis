package com.jackzhang.mall.service.impl;

import com.jackzhang.mall.common.ResponseData;
import com.jackzhang.mall.dao.TypeMapper;
import com.jackzhang.mall.model.Type;
import com.jackzhang.mall.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jack on 2017/11/1.
 */
@Service("TypeService")
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeMapper typeMapper;

    public ResponseData<String> add(Type type) {
        //实际需判断是否管理员
        if (type==null){
            return new ResponseData<String>().isOk(0).msg("商品类别参数出错");
        }
        int count=typeMapper.insert(type);
        if (count==0){
            return new ResponseData<String>().isOk(0).msg("类别入库失败");
        }
        return new ResponseData<String>().isOk(1).msg("类别添加成功");
    }
    public ResponseData<String> update(Type type){
        if (type==null){
            return new ResponseData<String>().isOk(0).msg("商品类别参数出错");
        }
        int count=typeMapper.updateByPrimaryKeySelective(type);
        if (count==0){
            return new ResponseData<String>().isOk(0).msg("类别修改失败");
        }
        return new ResponseData<String>().isOk(1).msg("类别修改成功");
    }
    public ResponseData<List<Type>> getSubType(String fid){
        List<Type> types=typeMapper.getSubType(fid);
        if (types==null){
            return new ResponseData<List<Type>>().isOk(0).msg("查询类别失败");
        }
        return new ResponseData<List<Type>>().isOk(1).data(types).msg("查询成功");
    }

}
