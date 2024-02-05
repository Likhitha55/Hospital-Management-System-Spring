package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;
import com.hospitalmanagementsystem.Hospital.Management.System.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping("/register")
    public String registerPatient(@RequestBody Patient obj) {
        patientService.registerPatient(obj);
        return "Patient added Successfully";
    }

    @GetMapping("/{pid}/details")
    public Patient getPatientByID(@PathVariable UUID pid) {
        return patientService.getPatientById(pid);
    }

    @DeleteMapping("/{pid}/deletePatient")
    public String deletePatient(@PathVariable UUID pid) {
        patientService.deletePatient(pid);
        return "Patient removed Successfully";

    }
}