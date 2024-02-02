package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Doctor {
    UUID doctorID;
    String doctorName;
    String degree;
    List<Patient> patient;
    UUID hospitalID;

    public UUID getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(UUID doctorID) {
        this.doctorID = doctorID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDegree() {
        return degree;
    }

    public Doctor(UUID doctorID, String doctorName, String degree, List<Patient> patient, UUID hospitalID) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.degree = degree;
        this.patient = new ArrayList<>();
        this.hospitalID = hospitalID;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public List<Patient> getPatient() {
        return patient;
    }

    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }

    public UUID getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(UUID hospitalID) {
        this.hospitalID = hospitalID;
    }


}
