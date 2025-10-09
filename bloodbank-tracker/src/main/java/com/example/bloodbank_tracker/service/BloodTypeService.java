package com.example.bloodbank_tracker.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.bloodbank_tracker.model.BloodType;
import com.example.bloodbank_tracker.repository.BloodTypeRepository;

@Service
public class BloodTypeService {

    private final BloodTypeRepository bloodTypeRepository;

    public BloodTypeService(BloodTypeRepository bloodTypeRepository) {
        this.bloodTypeRepository = bloodTypeRepository;
    }

    // Add or update blood type
    public BloodType saveBloodType(BloodType bloodType) {
        return bloodTypeRepository.save(bloodType);
    }

    // Get all types
    public List<BloodType> getAllBloodTypes() {
        return bloodTypeRepository.findAll();
    }

    // Get one type
    public Optional<BloodType> getBloodTypeById(Long id) {
        return bloodTypeRepository.findById(id);
    }

    // Delete type
    public void deleteBloodType(Long id) {
        bloodTypeRepository.deleteById(id);
    }
}

