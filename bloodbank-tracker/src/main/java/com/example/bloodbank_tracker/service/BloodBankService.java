package com.example.bloodbank_tracker.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.bloodbank_tracker.model.BloodBank;
import com.example.bloodbank_tracker.repository.BloodBankRepository;

@Service
public class BloodBankService {

    private final BloodBankRepository bloodBankRepository;

    public BloodBankService(BloodBankRepository bloodBankRepository) {
        this.bloodBankRepository = bloodBankRepository;
    }

    // Create or Update BloodBank
    public BloodBank saveBloodBank(BloodBank bloodBank) {
        return bloodBankRepository.save(bloodBank);
    }

    // Get all blood banks
    public List<BloodBank> getAllBloodBanks() {
        return bloodBankRepository.findAll();
    }

    // Get single blood bank
    public Optional<BloodBank> getBloodBankById(Long id) {
        return bloodBankRepository.findById(id);
    }

    // Delete blood bank
    public void deleteBloodBank(Long id) {
        bloodBankRepository.deleteById(id);
    }
}

