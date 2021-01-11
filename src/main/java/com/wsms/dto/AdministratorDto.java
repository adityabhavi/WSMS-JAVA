package com.wsms.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="administrator_details")
public class AdministratorDto {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="admin_id")
    private int adminId;

    @Column(name="admin_fullname", nullable=false)
    private String adminFullName;

    @Column(name="admin_email", nullable=false, unique=true)
    private String adminEmail;

    @Column(name="admin_password", nullable=false, unique=true)
    private String adminPassword;

    @Column(name="admin_mobileno", nullable=false)
    private String adminMobileNo;

    public AdministratorDto() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminFullName() {
        return adminFullName;
    }

    public void setAdminFullName(String adminFullName) {
        this.adminFullName = adminFullName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminMobileNo() {
        return adminMobileNo;
    }

    public void setAdminMobileNo(String adminMobileNo) {
        this.adminMobileNo = adminMobileNo;
    }

    @Override
    public String toString() {
        return "AdministratorDto [adminId=" + adminId + ", adminFullName=" + adminFullName + ", adminEmail="
                + adminEmail + ", adminPassword=" + adminPassword + ", adminMobileNo=" + adminMobileNo + "]";
    }
}

