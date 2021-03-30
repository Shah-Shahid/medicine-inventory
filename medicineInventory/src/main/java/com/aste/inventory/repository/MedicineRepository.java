package com.aste.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.aste.inventory.entity.Medicine;

public interface MedicineRepository  extends CrudRepository<Medicine, Long>{

}
