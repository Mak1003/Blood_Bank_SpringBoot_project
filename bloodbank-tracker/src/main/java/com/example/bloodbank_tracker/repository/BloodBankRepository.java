package com.example.bloodbank_tracker.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bloodbank_tracker.model.BloodBank;

@Repository
public interface BloodBankRepository extends JpaRepository<BloodBank, Long> {
    // Custom query methods can go here
}

