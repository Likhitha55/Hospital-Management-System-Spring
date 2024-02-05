package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Bed;
import com.hospitalmanagementsystem.Hospital.Management.System.repository.BedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BedService {
    @Autowired
    BedRepository bedRepository;
    public Bed getUnOccupiedBedInHospital(UUID hospitalID){
        List<Bed> beds = bedRepository.getAllBeds();
        for(Bed bed:beds){
            if(!bed.getIsBooked() && bed.getHospitalID().toString().equals(hospitalID.toString())){
                System.out.println("Found bed");
                return bed;
            }
        }
        return null;
    }
    public Bed addBed(UUID hospitalID){
        Bed obj = new Bed();
        obj.setBID(UUID.randomUUID());
        obj.setHospitalID(hospitalID);
        bedRepository.addBed(obj);
        return obj;
    }
    public Bed getBedByID(UUID id){
        return bedRepository.getBedByID(id);
    }
}
