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

import com.aste.inventory.entity.Company;
import com.aste.inventory.entity.Type;
import com.aste.inventory.repository.CompanyRepository;

@RestController
@RequestMapping("/api/company")
public class CompanyController {
	
	@Autowired
	CompanyRepository companyRepository;
	
	@GetMapping
	public Iterable <Company> get() {
		return companyRepository.findAll();
		
	}
	
	@PostMapping("/add")
	public Company save(@RequestBody Company company) {
		//type.setId(0);
		return companyRepository.save(company);
	}
	
	@GetMapping("/{companyId}")
	public Optional<Company> getById(@PathVariable long companyId) {
		return companyRepository.findById(companyId);
		
	}
	
	@PutMapping("/update")
	public Company updateCompany(@RequestBody Company company)
	{
		return companyRepository.save(company);
	}
	
	@DeleteMapping("/{companyId}")
	public String deleteType(@PathVariable long companyId)
	{
		companyRepository.deleteById(companyId);
		
		return "Deleted Company is -" + companyId;
	}

}
