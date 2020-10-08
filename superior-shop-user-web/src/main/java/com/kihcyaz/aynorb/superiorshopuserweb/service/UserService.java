package com.kihcyaz.aynorb.superiorshopuserweb.service;

import com.kihcyaz.aynorb.superiorshopcommon.serverresponse.ServerResponse;
import com.kihcyaz.aynorb.superiorshopcommon.user.entity.User;

public interface UserService {

    User create(String username, String password);

    ServerResponse checkData(String param, Integer type);

    ServerResponse login(String username, String password);

    User checkUser(String token);

    ServerResponse listUser();
}
