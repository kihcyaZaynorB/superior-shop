package com.kihcyaz.aynorb.superiorshop.userweb.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.kihcyaz.aynorb.superiorshop.common.exception.BusinessException;
import com.kihcyaz.aynorb.superiorshop.common.serverresponse.ResponseStatus;
import com.kihcyaz.aynorb.superiorshop.common.serverresponse.ServerResponse;
import com.kihcyaz.aynorb.superiorshop.common.user.entity.User;
import com.kihcyaz.aynorb.superiorshop.userweb.dao.UserMapper;
import com.kihcyaz.aynorb.superiorshop.userweb.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Transactional
    public ServerResponse create(String username, String password) {
        LambdaQueryWrapper<User> userExistsQuery = Wrappers.lambdaQuery();
        userExistsQuery.eq(User::getUsername, username);
        User user = userMapper.selectOne(userExistsQuery);
        if (user != null) {
            throw new BusinessException(ResponseStatus.SYSTEM_EXECUTION_ERROR, "Username Exists");
        }
        user = new User();
        user.setUsername(username);
        String encryptedPassword = new BCryptPasswordEncoder().encode(password);
        user.setPassword(encryptedPassword);
        userMapper.insert(user);
        return ServerResponse.ok(user);
    }

    public ServerResponse checkData(String param, Integer type) {
        LambdaQueryWrapper<User> userExistsQuery = Wrappers.lambdaQuery();
        switch (type) {
            case 1:
                userExistsQuery.eq(User::getUsername, param);
                break;
            case 2:
                userExistsQuery.eq(User::getPhone, param);
                break;
            case 3:
                userExistsQuery.eq(User::getEmail, param);
            default:
                throw new BusinessException(ResponseStatus.SYSTEM_EXECUTION_ERROR, "type is invalid");
        }
        int cnt = userMapper.selectCount(userExistsQuery);
        if (cnt > 0) {
            return ServerResponse.error("user exists");
        }
        return ServerResponse.ok();

    }

    public ServerResponse login(String username, String password) {
        LambdaQueryWrapper<User> userExistsQuery = Wrappers.lambdaQuery();
        userExistsQuery.eq(User::getUsername, username);
        User user = userMapper.selectOne(userExistsQuery);
        if (user == null) {
            throw new BusinessException(ResponseStatus.SYSTEM_EXECUTION_ERROR, "User not exists");
        }
        String md5 = DigestUtils.md5Hex(password.getBytes());
        if (!md5.equals(user.getPassword())) {
            throw new BusinessException(ResponseStatus.SYSTEM_EXECUTION_ERROR, "Username or password incorrect");
        }
        String token = UUID.randomUUID().toString();
        user.setPassword(null);
        redisTemplate.boundValueOps("SESSION_KEY:" + token).set(user);
        redisTemplate.boundValueOps("SESSION_KEY:" + token).expire(30, TimeUnit.MINUTES);
        return ServerResponse.ok(token);
    }

    public ServerResponse checkUser(String token) {
        Object o = redisTemplate.boundValueOps("SESSION_KEY:" + token).get();
        if (o == null) {
            throw new BusinessException(ResponseStatus.SYSTEM_EXECUTION_ERROR, "login expired");
        }
        User user = (User)o;
        return ServerResponse.ok(user);
    }
}
