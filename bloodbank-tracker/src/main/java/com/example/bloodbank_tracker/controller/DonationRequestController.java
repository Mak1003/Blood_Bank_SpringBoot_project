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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bloodbank_tracker.model.DonationRequest;
import com.example.bloodbank_tracker.service.DonationRequestService;

@RestController
@RequestMapping("/api/requests")
public class DonationRequestController {

    private final DonationRequestService donationRequestService;

    public DonationRequestController(DonationRequestService donationRequestService) {
        this.donationRequestService = donationRequestService;
    }

    @GetMapping
    public List<DonationRequest> getAll() {
        return donationRequestService.getAllRequests();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DonationRequest> getById(@PathVariable Long id) {
        return donationRequestService.getRequestById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public DonationRequest create(@RequestBody DonationRequest request) {
        return donationRequestService.saveRequest(request);
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<DonationRequest> updateStatus(@PathVariable Long id, @RequestParam String status) {
        return donationRequestService.getRequestById(id).map(existing -> {
            existing.setStatus(status.toUpperCase());
            return ResponseEntity.ok(donationRequestService.saveRequest(existing));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        donationRequestService.deleteRequest(id);
        return ResponseEntity.ok().build();
    }
}

