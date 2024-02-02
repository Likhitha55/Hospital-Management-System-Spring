package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Doctor;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    HospitalService hospitalService;
    public List<Doctor> getAllDoctors(){
        return doctorRepository.getAllDoctors();
    }
    public void registerDoctor(Doctor d){
        d.setDoctorID(UUID.randomUUID());
        Hospital hospital = hospitalService.getHospitalByID(d.getHospitalID());
        List<Doctor> doctors = hospital.getDoctor();
        doctors.add(d);
        doctorRepository.registerDoctor(d);
    }
}
