package com.wsms.service;


import com.wsms.Repository.VendorRepository;
import com.wsms.dto.VendorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VendorServiceImple implements VendorService{

    @Autowired
    private VendorRepository vendorRepo;

    @Override
    public VendorDto registerVendor(VendorDto vendor) {

        return vendorRepo.save(vendor);
    }

    @Override
    public VendorDto loginVendor(String email, String password) {

        return vendorRepo.findByvendorEmailvendorPassword(email, password);
    }

}