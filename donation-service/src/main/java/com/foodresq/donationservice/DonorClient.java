package com.foodresq.donationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "donor-service")
public interface DonorClient {

    @GetMapping("/donors/{id}")
    Object getDonor(@PathVariable String id);
}
