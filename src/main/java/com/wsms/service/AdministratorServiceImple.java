package com.wsms.service;


import com.wsms.Repository.AdministratorRepository;
import com.wsms.dto.AdministratorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdministratorServiceImple implements AdministratorService{

    @Autowired
    private AdministratorRepository adminRepo;

    @Override
    public AdministratorDto registerAdmin(AdministratorDto admin) {

        return adminRepo.save(admin);
    }

    @Override
    public AdministratorDto loginAdmin(String email, String password) {

        return adminRepo.findByadminEmailadminPassword(email, password);
    }

}

