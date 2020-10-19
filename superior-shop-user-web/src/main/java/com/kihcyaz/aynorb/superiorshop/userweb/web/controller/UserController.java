package com.kihcyaz.aynorb.superiorshop.userweb.web.controller;

import com.kihcyaz.aynorb.superiorshop.common.serverresponse.ServerResponse;
import com.kihcyaz.aynorb.superiorshop.userweb.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public ServerResponse createUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        return userService.create(username, password);
    }

    @ApiOperation(value = "检查用户输入是否可用")
    @GetMapping("/check/{param}/{type}")
    public ServerResponse checkData(@PathVariable("param") String param, @PathVariable("type") Integer type) {
        return userService.checkData(param, type);
    }

    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public ServerResponse login(@RequestParam String username, @RequestParam String password) {
        return userService.login(username, password);
    }

    @ApiOperation("获取用户信息")
    @GetMapping("/token/{token}")
    public ServerResponse checkUser(@PathVariable("token") String token) {
        return userService.checkUser(token);
    }

}
