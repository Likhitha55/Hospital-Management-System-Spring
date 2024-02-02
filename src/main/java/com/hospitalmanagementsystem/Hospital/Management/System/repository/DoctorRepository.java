package com.hospitalmanagementsystem.Hospital.Management.System.repository;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Repository
public class DoctorRepository {
    HashMap<UUID, Doctor> doctorDB;

    public DoctorRepository() {
        this.doctorDB = new HashMap<>();
    }
    public List<Doctor> getAllDoctors(){
        List<Doctor> doctors = new ArrayList<>();
        for(UUID id : doctorDB.keySet()){
            doctors.add(doctorDB.get(id));
        }
        return doctors;
    }
    public void registerDoctor(Doctor d){
        UUID id = d.getDoctorID();
        doctorDB.put(id,d);
    }

}
