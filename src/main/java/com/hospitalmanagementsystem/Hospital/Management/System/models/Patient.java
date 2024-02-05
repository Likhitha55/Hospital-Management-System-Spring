package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.UUID;

public class Patient {
    UUID pID;
    String name;
    String address;
    String disease;
    Long contactNumber;
    UUID doctorID;
    String email;
    int age;
    UUID hospitalID;
    Boolean isAdmit;
    UUID bedID;

    public Patient(UUID pID, String name, String address, String disease, Long contactNumber, UUID doctorID, String email, int age, UUID hospitalID,UUID bedID) {
        this.pID = pID;
        this.name = name;
        this.address = address;
        this.disease = disease;
        this.contactNumber = contactNumber;
        this.doctorID = doctorID;
        this.email = email;
        this.age = age;
        this.hospitalID = hospitalID;
        this.bedID=bedID;
    }

    public UUID getPID() {
        return pID;
    }

    public void setPID(UUID pID) {
        this.pID = pID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public UUID getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(UUID doctorID) {
        this.doctorID = doctorID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UUID getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(UUID hospitalID) {
        this.hospitalID = hospitalID;
    }
    public Boolean getIsAdmit() {
        return isAdmit;
    }

    public void setIsAdmit(Boolean isAdmit) {
        this.isAdmit = isAdmit;
    }
    public UUID getBedID() {
        return bedID;
    }

    public void setBedID(UUID bedID) {
        this.bedID = bedID;
    }
}
