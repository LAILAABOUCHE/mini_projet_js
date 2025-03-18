package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.Patient;
import com.example.demo.repository.PatientRepository;

// import ch.qos.logback.core.model.Model; // Removed as it collides with org.springframework.ui.Model
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



@Controller



public class PatientConroller {

   @Autowired
   private PatientRepository patientRepository;




@GetMapping("/index")
public String index( Model model) {
    List<Patient> patientList =patientRepository.findAll();
    model.addAttribute("listePatients", patientList);
    return "patients" ;
}
}