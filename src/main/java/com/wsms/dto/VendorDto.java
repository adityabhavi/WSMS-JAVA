package com.wsms.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vendor_details")
public class VendorDto {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="vendor_id")
    private int vendorId;

    @Column(name="vendor_fullname", nullable=false)
    private String vendorFullName;

    @Column(name="vendor_password", nullable=false, unique=true)
    private String vendorPassword;

    @Column(name="vendor_email", nullable=false, unique=true)
    private String vendorEmail;

    @Column(name="vendor_mobileno", nullable=false)
    private String vendorMobileNo;

    @Column(name="vendor_category", nullable=true)
    private String vendorCategory;

    public String getVendorGender() {
        return vendorGender;
    }

    public void setVendorGender(String vendorGender) {
        this.vendorGender = vendorGender;
    }

    @Column(name = "vendor_gender", nullable = false)
    private String vendorGender;

    @Column(name="vendor_address", nullable=false)
    private String vendorAddress;

    @Column(name="vendor_zipcode", nullable=false)
    private String vendorZipCode;

    public VendorDto() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorFullName() {
        return vendorFullName;
    }

    public void setVendorFullName(String vendorFullName) {
        this.vendorFullName = vendorFullName;
    }

    public String getVendorPassword() {
        return vendorPassword;
    }

    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorMobileNo() {
        return vendorMobileNo;
    }

    public void setVendorMobileNo(String vendorMobileNo) {
        this.vendorMobileNo = vendorMobileNo;
    }

    public String getVendorCategory() {
        return vendorCategory;
    }

    public void setVendorCategory(String vendorCategory) {
        this.vendorCategory = vendorCategory;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorZipCode() {
        return vendorZipCode;
    }

    public void setVendorZipCode(String vendorZipCode) {
        this.vendorZipCode = vendorZipCode;
    }

    @Override
    public String toString() {
        return "VendorDto{" +
                "vendorId=" + vendorId +
                ", vendorFullName='" + vendorFullName + '\'' +
                ", vendorPassword='" + vendorPassword + '\'' +
                ", vendorEmail='" + vendorEmail + '\'' +
                ", vendorMobileNo='" + vendorMobileNo + '\'' +
                ", vendorCategory='" + vendorCategory + '\'' +
                ", vendorGender='" + vendorGender + '\'' +
                ", vendorAddress='" + vendorAddress + '\'' +
                ", vendorZipCode='" + vendorZipCode + '\'' +
                '}';
    }
}

