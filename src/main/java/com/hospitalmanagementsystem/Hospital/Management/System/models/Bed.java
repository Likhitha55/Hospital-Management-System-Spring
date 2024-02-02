package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.UUID;

public class Bed {
    UUID bID;
    UUID pID;
    UUID doctorID;
    Boolean isBooked;

    public Bed(UUID bID, UUID pID, UUID doctorID, Boolean isBooked) {
        this.bID = bID;
        this.pID = pID;
        this.doctorID = doctorID;
        this.isBooked = isBooked;
    }

    public UUID getbID() {
        return bID;
    }

    public void setbID(UUID bID) {
        this.bID = bID;
    }

    public UUID getpID() {
        return pID;
    }

    public void setpID(UUID pID) {
        this.pID = pID;
    }

    public UUID getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(UUID doctorID) {
        this.doctorID = doctorID;
    }

    public Boolean getBooked() {
        return isBooked;
    }

    public void setBooked(Boolean booked) {
        isBooked = booked;
    }


}
