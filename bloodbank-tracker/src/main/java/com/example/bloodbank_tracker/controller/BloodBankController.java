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

import com.example.bloodbank_tracker.model.BloodBank;
import com.example.bloodbank_tracker.service.BloodBankService;

@RestController
@RequestMapping("/api/bloodbanks")
public class BloodBankController {

    private final BloodBankService bloodBankService;

    public BloodBankController(BloodBankService bloodBankService) {
        this.bloodBankService = bloodBankService;
    }

    // Get all blood banks
    @GetMapping
    public List<BloodBank> getAll() {
        return bloodBankService.getAllBloodBanks();
    }

    // Get single blood bank
    @GetMapping("/{id}")
    public ResponseEntity<BloodBank> getById(@PathVariable Long id) {
        return bloodBankService.getBloodBankById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Add new blood bank
    @PostMapping
    public BloodBank create(@RequestBody BloodBank bloodBank) {
        return bloodBankService.saveBloodBank(bloodBank);
    }

    // Update blood bank
    @PutMapping("/{id}")
    public ResponseEntity<BloodBank> update(@PathVariable Long id, @RequestBody BloodBank bloodBank) {
        return bloodBankService.getBloodBankById(id).map(existing -> {
            existing.setName(bloodBank.getName());
            existing.setAddress(bloodBank.getAddress());
            existing.setContactNumber(bloodBank.getContactNumber());
            return ResponseEntity.ok(bloodBankService.saveBloodBank(existing));
        }).orElse(ResponseEntity.notFound().build());
    }

    // Delete blood bank
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        bloodBankService.deleteBloodBank(id);
        return ResponseEntity.ok().build();
    }
}

