package com.example.bloodbank_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bloodbank_tracker.model.DonationRequest;

@Repository
public interface DonationRequestRepository extends JpaRepository<DonationRequest, Long> {
}
