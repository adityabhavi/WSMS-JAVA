package com.wsms.controller;


import com.wsms.dto.UserDto;
import com.wsms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path="registeruser", consumes= {"application/json"})
    public UserDto registerUser(@RequestBody UserDto user)
    {
        return userService.registeruser(user);
    }

    @PostMapping(path="loginuser", consumes= {"application/json"})
    public UserDto loginUser(@RequestBody UserDto user)
    {
        if(user.getUserEmail()!=null) {
            user = userService.loginuser(user.getUserEmail(), user.getUserPassword());
            return user;
        }else{
            user = userService.loginuser(user.getUserMobileNo(), user.getUserPassword());
            return user;
        }
    }

}
