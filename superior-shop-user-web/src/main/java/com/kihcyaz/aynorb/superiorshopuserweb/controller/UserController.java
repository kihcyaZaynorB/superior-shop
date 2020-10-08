package com.kihcyaz.aynorb.superiorshopuserweb.controller;

import com.kihcyaz.aynorb.superiorshopcommon.serverresponse.ServerResponse;
import com.kihcyaz.aynorb.superiorshopcommon.user.entity.User;
import com.kihcyaz.aynorb.superiorshopuserweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User createUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        return userService.create(username, password);
    }


    @GetMapping
    public ServerResponse listAllUser() {
        return userService.listUser();
    }
}
