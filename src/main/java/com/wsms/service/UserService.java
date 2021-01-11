package com.wsms.service;


import com.wsms.dto.UserDto;

public interface UserService {

    public UserDto registeruser(UserDto user);

    public UserDto loginuser(String email, String password);
}

