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

import com.aste.inventory.entity.User;
import com.aste.inventory.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public ResponseEntity<List<User>> getAll() {
		return ResponseEntity.ok((List<User>) userRepository.findAll());
	}
	
	@PostMapping("/add")
	public ResponseEntity<User> save(@RequestBody User user) {		
		return ResponseEntity.ok(userRepository.save(user));
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<?> getById(@PathVariable long userId) {
		return ResponseEntity.ok(userRepository.findById(userId));
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<User> update(@RequestBody User user) {			
		return ResponseEntity.ok(userRepository.save(user));
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> delete(@PathVariable long userId) {
		userRepository.deleteById(userId);
		return ResponseEntity.ok("success");
	}
}
