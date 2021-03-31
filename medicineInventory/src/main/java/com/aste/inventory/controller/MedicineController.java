package com.aste.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aste.inventory.entity.Medicine;
import com.aste.inventory.repository.MedicineRepository;

@RestController
@RequestMapping("/api/medicine")
public class MedicineController {
	
	@Autowired
	MedicineRepository medicineRepository;
	
	@GetMapping
	public ResponseEntity<List<Medicine>> getAll() {
		return ResponseEntity.ok((List<Medicine>) medicineRepository.findAll());
	}
	
	@PostMapping("/add")
	public ResponseEntity<Medicine> save(@RequestBody Medicine medicine) {		
		return ResponseEntity.ok(medicineRepository.save(medicine));
	}
	
	@GetMapping("/{medicineId}")
	public ResponseEntity<?> getById(@PathVariable long medicineId) {
		return ResponseEntity.ok(medicineRepository.findById(medicineId));
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Medicine> update(@RequestBody Medicine medicine) {			
		return ResponseEntity.ok(medicineRepository.save(medicine));
	}
	
	@DeleteMapping("/{medicineId}")
	public ResponseEntity<?> delete(@PathVariable long medicineId) {
		medicineRepository.deleteById(medicineId);
		return ResponseEntity.ok("success");
	}

}
