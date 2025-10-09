package com.example.bloodbank_tracker.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.bloodbank_tracker.model.DonationRequest;
import com.example.bloodbank_tracker.repository.DonationRequestRepository;

@Service
public class DonationRequestService {

    private final DonationRequestRepository donationRequestRepository;

    public DonationRequestService(DonationRequestRepository donationRequestRepository) {
        this.donationRequestRepository = donationRequestRepository;
    }

    // Save request
    public DonationRequest saveRequest(DonationRequest request) {
        return donationRequestRepository.save(request);
    }

    // Get all requests
    public List<DonationRequest> getAllRequests() {
        return donationRequestRepository.findAll();
    }

    // Get single request
    public Optional<DonationRequest> getRequestById(Long id) {
        return donationRequestRepository.findById(id);
    }

    // Delete request
    public void deleteRequest(Long id) {
        donationRequestRepository.deleteById(id);
    }
}

