package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.service.HospitalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
//    @PostMapping("/sum/twoNumbers")
//    public int  sumTwoNumbers(@RequestBody Numbers obj){
//        return obj.addNumbers();
//    }
    @GetMapping("/getAllHospitals")
    public List<Hospital> getAllHospitals(){
        return hospitalService.getAllHospitals();
    }
    HospitalService hospitalService = new HospitalService();
    @PostMapping("/register")
    public String registerHospital(@RequestBody Hospital obj){
        hospitalService.registerHospital(obj);
        return "Hospital registered successfully";
    }


}
