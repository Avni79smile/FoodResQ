package com.foodresq.donationservice.controller;

import com.foodresq.donationservice.Donation;
import com.foodresq.donationservice.DonorClient;
import com.foodresq.donationservice.repository.DonationRepository;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("donations")
@CrossOrigin
public class DonationController {

    private final DonationRepository repo;
    private final DonorClient donorClient;

    public DonationController(DonationRepository r, DonorClient donorClient) {
        this.repo = r;
        this.donorClient = donorClient;
    }

    @GetMapping
    public List<Donation> all() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Donation one(@PathVariable String id) {
        return repo.findById(id).orElseThrow();
    }

    @PostMapping
    public Donation create(@RequestBody Donation x) {
        return repo.save(x);
    }

    @PutMapping("/{id}")
    public Donation update(@PathVariable String id, @RequestBody Donation x) {
        x.setId(id);
        return repo.save(x);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }

    // Test communication with Donor Service
    @GetMapping("/donor/{id}")
    public Object getDonor(@PathVariable String id) {
        return donorClient.getDonor(id);
    }
}