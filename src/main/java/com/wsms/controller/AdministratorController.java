package com.wsms.controller;


import com.wsms.dto.AdministratorDto;
import com.wsms.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdministratorController {

    @Autowired
    private AdministratorService adminService;

    @PostMapping(path="registeradmin", consumes= {"application/json"})
    public AdministratorDto registerAdmin(@RequestBody AdministratorDto admin)
    {
        return adminService.registerAdmin(admin);
    }

    @PostMapping(path="loginadmin", consumes= {"application/json"})
    public boolean loginAdmin(@RequestBody AdministratorDto admin)
    {
        if(adminService.loginAdmin(admin.getAdminEmail(), admin.getAdminPassword()) != null)
            return true;
        else
            return false;
    }

}
