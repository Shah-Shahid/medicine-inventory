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

import com.aste.inventory.entity.Role;

import com.aste.inventory.repository.RoleRepository;

@RestController
@RequestMapping("/api/role")
public class RoleController {
	

	
		
		@Autowired
		RoleRepository roleRepository;
		
		@GetMapping
		public Iterable <Role> get() {
			return roleRepository.findAll();
			
		}
		
		@PostMapping("/add")
		public Role save(@RequestBody Role role) {
			//type.setId(0);
			return roleRepository.save(role);
		}
		
		@GetMapping("/{roleId}")
		public Optional<Role> getById(@PathVariable long roleId) {
			return roleRepository.findById(roleId);
			
		}
		@PutMapping("/update")
		public Role updateRole(@RequestBody Role role)
		{
			return roleRepository.save(role);
		}
		
		@DeleteMapping("/{roleId}")
		public String deleteRole(@PathVariable long roleId)
		{
			roleRepository.deleteById(roleId);
			
			return "Deleted Role is -" + roleId;
		}


}
