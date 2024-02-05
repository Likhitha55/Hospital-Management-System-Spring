package com.hospitalmanagementsystem.Hospital.Management.System.repository;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
@Repository

public class PatientRepository {
    HashMap<UUID,Patient> patientDB = new HashMap<>();
    public void registerPatient(Patient obj){
        UUID id = obj.getPID();
        patientDB.put(id,obj);
    }
    public Patient getPatientByID(UUID id){
        return patientDB.get(id);
    }
    public void updatePatientAdmitStatusToFalse(UUID id){
         patientDB.get(id).setIsAdmit(false);
    }
    public void removePatient(UUID pid){
        for(UUID id : patientDB.keySet()){
            if(id.equals(pid)){
                patientDB.remove(id);
                break;
            }
        }
    }

}
