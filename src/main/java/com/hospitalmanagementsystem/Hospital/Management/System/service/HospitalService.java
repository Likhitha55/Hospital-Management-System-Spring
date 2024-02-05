package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Doctor;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HospitalService extends PatientOperationUtils{
    @Autowired
    HospitalRepository hospitalRepository;
    public List<Hospital> getAllHospitals(){
        return hospitalRepository.getAllHospitals();
    }
    public void registerHospital(Hospital h){
        h.setHospitalID(UUID.randomUUID());
        hospitalRepository.registerHospital(h);
    }
    public Hospital getHospitalByID(UUID id){
        return hospitalRepository.getHospitalByID(id);
    }
    public Doctor getMinPatientDoctor(UUID hospitalID){
        List<Doctor> doctors = hospitalRepository.getAllDoctorsByHID(hospitalID);
        Doctor obj=null;
        int min = Integer.MAX_VALUE;
        for(Doctor d : doctors){
            int patientCount = d.getPatient().size();
            if(patientCount<min){
                min=patientCount;
                obj=d;
            }
        }
        return obj;
    }
}
