package com.aste.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.aste.inventory.entity.User;

public interface UserRepository  extends CrudRepository<User, Long>{

}
