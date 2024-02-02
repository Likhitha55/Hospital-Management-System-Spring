package com.hospitalmanagementsystem.Hospital.Management.System.repository;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Repository
public class HospitalRepository {
    //ID vs Hospital Object
    //All the database related operations will be performed here
    HashMap<UUID, Hospital> hospitalDB;
    public HospitalRepository() {

        this.hospitalDB = new HashMap<>();
    }



    public List<Hospital> getAllHospitals(){
        List<Hospital> hospitals = new ArrayList<>();
        for(UUID id : hospitalDB.keySet()){
            hospitals.add(hospitalDB.get(id));
        }
        return hospitals;
    }
    public void registerHospital(Hospital obj){
        UUID id = obj.getHospitalID();
        hospitalDB.put(id,obj);
    }
    public Hospital getHospitalByID(UUID id){
        return hospitalDB.get(id);
    }
}
