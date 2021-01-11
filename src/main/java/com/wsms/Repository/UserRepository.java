package com.wsms.Repository;


import com.wsms.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserDto, Integer>{

    @Query(value="SELECT * FROM user_details WHERE user_email=?1 and user_password=?2", nativeQuery = true)
    UserDto findByuserEmailuserPassword(String email, String password);

}
