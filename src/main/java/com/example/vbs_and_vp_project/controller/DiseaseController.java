package com.example.vbs_and_vp_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/disease")
public class DiseaseController {

    public DiseaseController() {
    }

    @GetMapping({"", "/home"})
    public String getHomePage() {
        return "index";
    }

    @GetMapping("/prediction")
    public String getDiseasePredictionPage() {
        return "diseasePrediction";
    }
}
