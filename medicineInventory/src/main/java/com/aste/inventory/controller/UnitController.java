package com.aste.inventory.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.aste.inventory.entity.Unit;
import com.aste.inventory.repository.UnitRepository;

@RestController
@RequestMapping("/api/unit")
public class UnitController {
	@Autowired
	UnitRepository unitRepository;
	
	@GetMapping
	public Iterable <Unit> get() {
		return unitRepository.findAll();
		
	}
	
	@PostMapping("/add")
	public Unit save(@RequestBody Unit unit) {
		//type.setId(0);
		return unitRepository.save(unit);
	}
	
	@GetMapping("/{unitId}")
	public Optional<Unit> getById(@PathVariable long unitId) {
		return unitRepository.findById(unitId);
		
	}

}
