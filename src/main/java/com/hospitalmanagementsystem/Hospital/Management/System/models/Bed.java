package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.UUID;

public class Bed {
    UUID bID;
    UUID pID;

    UUID doctorID;
    Boolean isBooked=false;
    UUID hospitalID;
    public Bed() {
    }

    public Bed(UUID bID, UUID pID, UUID doctorID, Boolean isBooked,UUID hospitalID) {
        this.bID = bID;
        this.pID = pID;
        this.doctorID = doctorID;
        this.isBooked = false;
        this.hospitalID = hospitalID;
    }

    public UUID getBID() {
        return bID;
    }

    public void setBID(UUID bID) {
        this.bID = bID;
    }

    public UUID getPID() {
        return pID;
    }

    public void setPID(UUID pID) {
        this.pID = pID;
    }

    public UUID getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(UUID doctorID) {
        this.doctorID = doctorID;
    }

    public Boolean getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(Boolean booked) {
        isBooked = booked;
    }
    public UUID getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(UUID hospitalID) {
        this.hospitalID = hospitalID;
    }
}
