package com.student.management.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.management.entity.Address;
import com.student.management.repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }
}