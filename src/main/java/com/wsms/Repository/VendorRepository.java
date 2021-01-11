package com.wsms.Repository;

import com.wsms.dto.VendorDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface VendorRepository extends JpaRepository<VendorDto, Integer>{

    @Query(value="SELECT * FROM vendor_details WHERE vendor_email=?1 and vendor_password=?2", nativeQuery = true)
    VendorDto findByvendorEmailvendorPassword(String email, String password);

}
