package com.wsms.Repository;

import com.wsms.dto.AdministratorDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AdministratorRepository extends JpaRepository<AdministratorDto, Integer>{

    @Query(value="SELECT * FROM administrator_details WHERE admin_email=?1 and admin_password=?2", nativeQuery = true)
    AdministratorDto findByadminEmailadminPassword(String email, String password);

}