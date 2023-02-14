package com.example.bootvueadmin.controller;


import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.example.bootvueadmin.entity.User;
import com.example.bootvueadmin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public String login(@RequestBody String userStr){ //把前台发过来的json字符串转成java对象
        System.out.println(userStr);
        JSONObject userObj = JSONUtil.parseObj(userStr);

        String username = (String) userObj.getObj("username");
        String password = (String) userObj.getObj("password");

        User user = userMapper.selectUser(username,password);
        return user != null ? "SUCCESS" : "FALL";

 //       if("admin".equals(username) && "admin".equals(password)){
 //           return "SUCCESS";
 //       }
 //       return "FALL";
    }
}
 