package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Bed;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Doctor;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;
import com.hospitalmanagementsystem.Hospital.Management.System.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PatientService {
    @Autowired
    HospitalService hospitalService;
    @Autowired
    BedService bedService;
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    DoctorService doctorService;
    public String registerPatient(Patient obj){
        //1. Generate UUID for Patient
        obj.setPID(UUID.randomUUID());
        //2. Get the doctor who is handling min patients in that particular hospital
        Doctor doctor = hospitalService.getMinPatientDoctor(obj.getHospitalID());
        obj.setDoctorID(doctor.getDoctorID());
        doctor.getPatient().add(obj);
        //3. Get unoccupied bed
        Bed bed = bedService.getUnOccupiedBedInHospital(obj.getHospitalID());
            obj.setBedID(bed.getBID());
            bed.setIsBooked(true);
            //4. update status,doctorID,bedID in "Bed"
            bed.setIsBooked(true);
            bed.setPID(obj.getPID());
            bed.setDoctorID(obj.getDoctorID());
            obj.setBedID(bed.getBID());
            obj.setIsAdmit(true);
            //5. Add patient obj to that hospital
        Hospital h = hospitalService.getHospitalByID(obj.getHospitalID());
        h.getPatient().add(obj);
            //6. Save Patient to PatientDatabase
            patientRepository.registerPatient(obj);
            return "Patient added successfully";
    }
    public Patient getPatientById(UUID pid){
        return patientRepository.getPatientByID(pid);
    }
    public void deletePatient(UUID pid){
        //Free the bed
        Patient p = patientRepository.getPatientByID(pid);
        Bed b = bedService.getBedByID(p.getBedID());
        b.setIsBooked(false);
        b.setDoctorID(null);
        b.setPID(null);

        //Removing the patient from Doctor's list
        Doctor d = doctorService.getDoctorByID(p.getDoctorID());
        doctorService.removePatient(pid,d.getPatient());

        //Removing the patient from Hospital's list
        Hospital h = hospitalService.getHospitalByID(p.getHospitalID());
        hospitalService.removePatient(pid,h.getPatient());

        //Removing Patient from PatientRepository
        patientRepository.removePatient(pid);
    }
}
