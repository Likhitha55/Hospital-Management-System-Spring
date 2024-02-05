package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Bed;
import com.hospitalmanagementsystem.Hospital.Management.System.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/bed")
public class BedController {
    @Autowired
    BedService bedService;
    @PostMapping("/add")
    public Bed add(@RequestParam UUID hospitalID){
        Bed bed = bedService.addBed(hospitalID);
        return bed;
    }
    @GetMapping("/getBedByID")
    public Bed getBedByID(UUID id){
        return bedService.getBedByID(id);
    }
}
