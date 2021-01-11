package com.wsms.controller;


import com.wsms.dto.VendorDto;
import com.wsms.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VendorController {

    @Autowired
    VendorService vendorService;

    @PostMapping(path="registervendor", consumes= {"application/json"})
    public VendorDto registerVendor(@RequestBody VendorDto vendor)
    {
        System.out.println("Hello "+vendor);

        return vendorService.registerVendor(vendor);
    }

    @PostMapping(path="loginvendor", consumes= {"application/json"})
    public VendorDto loginVendor(@RequestBody VendorDto vendor)
    {
        if(vendor.getVendorEmail()!=null) {
            vendor = vendorService.loginVendor(vendor.getVendorEmail(), vendor.getVendorPassword());
            return vendor;
        }else{
            vendor = vendorService.loginVendor(vendor.getVendorEmail(), vendor.getVendorPassword());
            return vendor;
        }

    }

}
