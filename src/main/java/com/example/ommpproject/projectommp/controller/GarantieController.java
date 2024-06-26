package com.example.ommpproject.projectommp.controller;

import com.example.ommpproject.projectommp.models.*;
import com.example.ommpproject.projectommp.services.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/garanties")
@CrossOrigin(origins = "http://localhost:4200")
public class GarantieController {

    @Autowired
    private GarantieService garantieService;

    @GetMapping
    public List<Garantie> getAllGaranties() {
        return garantieService.getAllGaranties();
    }

    @GetMapping("/{id}")
    public Garantie getGarantieById(@PathVariable Long id) {
        return garantieService.getGarantieById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteGarantieById(@PathVariable Long id) {
        garantieService.deleteGarantieById(id);
    }

    @PostMapping
    public Garantie addGarantie(@RequestBody Garantie garantie) {
        return garantieService.addLigneGarantie(garantie);
    }

    @PutMapping("/{id}")
    public Garantie editGarantie(@PathVariable Long id, @RequestBody Garantie garantie) {
        return garantieService.editLigneGarantie(garantie);
    }
}
