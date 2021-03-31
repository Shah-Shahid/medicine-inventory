package com.aste.inventory.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aste.inventory.entity.Address;
import com.aste.inventory.entity.Role;
import com.aste.inventory.repository.AddressRepository;

@RestController
@RequestMapping("/api/address")
public class AddressController {

	@Autowired
	AddressRepository addressRepository;
	

	@GetMapping
	public Iterable <Address> get() {
		return addressRepository.findAll();
		
	}
	
	@PostMapping("/add")
	public Address save(@RequestBody Address address) {
		//type.setId(0);
		return addressRepository.save(address);
	}
	
	@GetMapping("/{addressId}")
	public Optional<Address> getById(@PathVariable long addressId) {
		return addressRepository.findById(addressId);
		
	}
	@PutMapping("/update")
	public Address updateAddress(@RequestBody Address address)
	{
		return addressRepository.save(address);
	}
	
	@DeleteMapping("/{addressId}")
	public String deleteAddress(@PathVariable long addressId)
	{
		addressRepository.deleteById(addressId);
		
		return "Deleted Address is -" + addressId;
	}

}
