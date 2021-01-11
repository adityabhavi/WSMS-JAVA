package com.wsms.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDto {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id")
    private int userId;

    @Column(name="user_fullname", nullable=false)
    private String userFullName;

    @Column(name="user_email", unique=true, nullable=false)
    private String userEmail;

    @Column(name="user_mobileno", nullable=false)
    private String userMobileNo;

    @Column(name="user_address", nullable=false)
    private String userAddress;

    @Column(name="user_zipcode", nullable=false)
    private String userZipCode;

    @Column(name="user_gender", nullable=false)
    private String userGender;

    @Column(name="user_password", unique=true, nullable=false)
    private String userPassword;

    public UserDto() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMobileNo() {
        return userMobileNo;
    }

    public void setUserMobileNo(String userMobileNo) {
        this.userMobileNo = userMobileNo;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserZipCode() {
        return userZipCode;
    }

    public void setUserZipCode(String userZipCode) {
        this.userZipCode = userZipCode;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "UserDto [userId=" + userId + ", userFullName=" + userFullName + ", userEmail=" + userEmail
                + ", userMobileNo=" + userMobileNo + ", userAddress=" + userAddress + ", userZipCode=" + userZipCode
                + ", userGender=" + userGender + ", userPassword=" + userPassword + "]";
    }

}

