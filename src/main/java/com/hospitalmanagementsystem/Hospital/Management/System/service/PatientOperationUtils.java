package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;

import java.util.List;
import java.util.UUID;

public abstract class PatientOperationUtils {
    public void removePatient(UUID id, List<Patient> patients){
        for(Patient p : patients){
            if(p.getPID().equals(id)){
                patients.remove(p);
                break;
            }
        }
    }
}
