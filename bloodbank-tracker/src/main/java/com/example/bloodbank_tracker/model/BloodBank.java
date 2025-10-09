package com.example.bloodbank_tracker.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class BloodBank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String contactNumber;

    @OneToMany(mappedBy = "bloodBank", cascade = CascadeType.ALL)
    private List<BloodType> bloodTypes;

    @OneToMany(mappedBy = "bloodBank", cascade = CascadeType.ALL)
    private List<DonationRequest> donationRequests;

    // ----------------- Getters and Setters -----------------

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public List<BloodType> getBloodTypes() { return bloodTypes; }
    public void setBloodTypes(List<BloodType> bloodTypes) { this.bloodTypes = bloodTypes; }

    public List<DonationRequest> getDonationRequests() { return donationRequests; }
    public void setDonationRequests(List<DonationRequest> donationRequests) { this.donationRequests = donationRequests; }
}

