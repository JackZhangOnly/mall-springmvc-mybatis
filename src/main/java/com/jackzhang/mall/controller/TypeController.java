package com.jackzhang.mall.controller;

import com.jackzhang.mall.common.Constants;
import com.jackzhang.mall.common.ResponseData;
import com.jackzhang.mall.model.Type;
import com.jackzhang.mall.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by Jack
 */
@Controller
@RequestMapping("/type/")
public class TypeController {
    @Autowired
    private TypeService typeService;

    @RequestMapping(value = "addType.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseData<String> addType(HttpSession session,String name,@RequestParam(value = "fid",defaultValue = "0") String fid){
            Object userObj=session.getAttribute(Constants.SESSION_USER);
            if (userObj==null){
                return new ResponseData<String>().isOk(0).msg("未登录");
            }
            Type type=new Type();
            type.setFid(fid);
            type.setName(name);
            type.setState(1);

            return typeService.add(type);
    }
    @RequestMapping(value = "updateType.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseData<String> updateType(HttpSession session,Type type){
        Object userObj=session.getAttribute(Constants.SESSION_USER);
        if (userObj==null){
            return new ResponseData<String>().isOk(0).msg("未登录");
        }
        return typeService.update(type);
    }
    @RequestMapping(value = "getParentType.do",method = RequestMethod.GET)
    @ResponseBody
    public ResponseData getSubType(HttpSession session,@RequestParam(value = "fid",defaultValue = "0") String fid){
        Object userObj=session.getAttribute(Constants.SESSION_USER);
        if (userObj==null){
            return new ResponseData<String>().isOk(0).msg("未登录");
        }
        return typeService.getSubType(fid);
    }

}
