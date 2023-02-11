package com.example.bootvueadmin.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public String login(@RequestBody String userStr){ //把前台发过来的json字符串转成java对象
        return "SUCCESS";
    }
}
