package com.student.management.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.student.management.entity.Address;
import com.student.management.service.AddressService;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping
    public Address saveAddress(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }
}