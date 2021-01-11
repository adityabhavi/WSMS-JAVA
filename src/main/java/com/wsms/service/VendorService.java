package com.wsms.service;

import com.wsms.dto.VendorDto;

public interface VendorService {

    public VendorDto registerVendor(VendorDto vendor);

    public VendorDto loginVendor(String email, String password);

}