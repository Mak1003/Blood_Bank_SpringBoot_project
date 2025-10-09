package com.example.bloodbank_tracker.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bloodbank_tracker.model.BloodType;
import com.example.bloodbank_tracker.service.BloodTypeService;

@RestController
@RequestMapping("/api/bloodtypes")
public class BloodTypeController {

    private final BloodTypeService bloodTypeService;

    public BloodTypeController(BloodTypeService bloodTypeService) {
        this.bloodTypeService = bloodTypeService;
    }

    @GetMapping
    public List<BloodType> getAll() {
        return bloodTypeService.getAllBloodTypes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BloodType> getById(@PathVariable Long id) {
        return bloodTypeService.getBloodTypeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public BloodType create(@RequestBody BloodType bloodType) {
        return bloodTypeService.saveBloodType(bloodType);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BloodType> update(@PathVariable Long id, @RequestBody BloodType bloodType) {
        return bloodTypeService.getBloodTypeById(id).map(existing -> {
            existing.setType(bloodType.getType());
            existing.setQuantity(bloodType.getQuantity());
            return ResponseEntity.ok(bloodTypeService.saveBloodType(existing));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        bloodTypeService.deleteBloodType(id);
        return ResponseEntity.ok().build();
    }
}

