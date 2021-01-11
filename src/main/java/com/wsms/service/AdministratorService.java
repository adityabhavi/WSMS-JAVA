package com.wsms.service;


import com.wsms.dto.AdministratorDto;

public interface AdministratorService {

    public AdministratorDto registerAdmin(AdministratorDto admin);

    public AdministratorDto loginAdmin(String email, String password);

}
