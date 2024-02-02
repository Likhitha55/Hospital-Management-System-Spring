package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Doctor;
import com.hospitalmanagementsystem.Hospital.Management.System.service.DoctorService;
import com.hospitalmanagementsystem.Hospital.Management.System.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @PostMapping("/register")
    public String registerDoctor(@RequestBody Doctor obj){
        doctorService.registerDoctor(obj);
        return "Doctor added successfully";
    }
    @GetMapping("/getAllDoctors")
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }
}
