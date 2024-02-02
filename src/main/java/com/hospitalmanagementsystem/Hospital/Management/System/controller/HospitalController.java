package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
//    @PostMapping("/sum/twoNumbers")
//    public int  sumTwoNumbers(@RequestBody Numbers obj){
//        return obj.addNumbers();
//    }
    @Autowired
    HospitalService hospitalService;
    @GetMapping("/getAllHospitals")
    public List<Hospital> getAllHospitals(){
        return hospitalService.getAllHospitals();
    }

    @PostMapping("/register")
    public String registerHospital(@RequestBody Hospital obj){
        hospitalService.registerHospital(obj);
        return "Hospital registered successfully";
    }
    //If we not use request-param then it is optional the code will execute inside it which is not related to that UUID
    //If I use @RequestParam we have to always pass hospitalid
    @GetMapping("/getHospitalByID")
//    System.out.println("Here");
    public Hospital getHospitalByID(@RequestParam UUID id){
        return hospitalService.getHospitalByID(id);
    }

}
