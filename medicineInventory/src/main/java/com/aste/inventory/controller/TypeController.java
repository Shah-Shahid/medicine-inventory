package com.aste.inventory.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aste.inventory.entity.Type;
import com.aste.inventory.repository.TypeRepository;

@RestController
@RequestMapping("/api/type")
public class TypeController {
	
	@Autowired
	TypeRepository typeRepository;
	
	@GetMapping
	public Iterable <Type> get() {
		return typeRepository.findAll();
		
	}
	
	@PostMapping("/add")
	public Type save(@RequestBody Type type) {
		//type.setId(0);
		return typeRepository.save(type);
	}
	
	@GetMapping("/{typeId}")
	public Optional<Type> getById(@PathVariable long typeId) {
		return typeRepository.findById(typeId);
		
	}

}
