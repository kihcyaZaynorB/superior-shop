package com.kihcyaz.aynorb.superiorshopuserweb.service.impl;

import com.kihcyaz.aynorb.superiorshopcommon.serverresponse.ServerResponse;
import com.kihcyaz.aynorb.superiorshopcommon.user.entity.User;
import com.kihcyaz.aynorb.superiorshopuserweb.dao.UserMapper;
import com.kihcyaz.aynorb.superiorshopuserweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User create(String username, String password) {
        return null;
    }

    public ServerResponse checkData(String param, Integer type) {
        return null;
    }

    public ServerResponse login(String username, String password) {
        return null;
    }

    public User checkUser(String token) {
        return null;
    }

    @Override
    public ServerResponse listUser() {
        List<User> users = userMapper.selectAllUser();
        return ServerResponse.ok(users);
    }
}
