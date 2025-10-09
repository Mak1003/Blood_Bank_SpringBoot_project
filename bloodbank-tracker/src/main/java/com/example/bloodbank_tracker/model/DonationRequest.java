package com.example.bloodbank_tracker.model;


import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DonationRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String requesterName;
    private String requesterContact;

    private String bloodTypeNeeded;
    private int unitsRequired;

    private LocalDateTime requestDate = LocalDateTime.now();

    private String status = "PENDING";

    @ManyToOne
    @JoinColumn(name = "bloodbank_id")
    private BloodBank bloodBank;

    // ----------------- Getters and Setters -----------------
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRequesterName() { return requesterName; }
    public void setRequesterName(String requesterName) { this.requesterName = requesterName; }

    public String getRequesterContact() { return requesterContact; }
    public void setRequesterContact(String requesterContact) { this.requesterContact = requesterContact; }

    public String getBloodTypeNeeded() { return bloodTypeNeeded; }
    public void setBloodTypeNeeded(String bloodTypeNeeded) { this.bloodTypeNeeded = bloodTypeNeeded; }

    public int getUnitsRequired() { return unitsRequired; }
    public void setUnitsRequired(int unitsRequired) { this.unitsRequired = unitsRequired; }

    public LocalDateTime getRequestDate() { return requestDate; }
    public void setRequestDate(LocalDateTime requestDate) { this.requestDate = requestDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public BloodBank getBloodBank() { return bloodBank; }
    public void setBloodBank(BloodBank bloodBank) { this.bloodBank = bloodBank; }
}
