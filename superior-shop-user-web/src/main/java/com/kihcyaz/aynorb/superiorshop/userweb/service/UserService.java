package com.kihcyaz.aynorb.superiorshop.userweb.service;

import com.kihcyaz.aynorb.superiorshop.common.serverresponse.ServerResponse;

public interface UserService {

    ServerResponse create(String username, String password);

    ServerResponse checkData(String param, Integer type);

    ServerResponse login(String username, String password);

    ServerResponse checkUser(String token);

}
