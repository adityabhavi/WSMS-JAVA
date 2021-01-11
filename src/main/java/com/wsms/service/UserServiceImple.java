package com.wsms.service;


import com.wsms.Repository.UserRepository;
import com.wsms.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImple implements UserService{

    @Autowired
    private UserRepository userrepo;

    @Override
    public UserDto registeruser(UserDto user) {

        return userrepo.save(user);

    }

    @Override
    public UserDto loginuser(String email, String password) {

        return userrepo.findByuserEmailuserPassword(email, password);
    }



}

