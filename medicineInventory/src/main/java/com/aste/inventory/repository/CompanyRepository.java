package com.aste.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.aste.inventory.entity.Company;

public interface CompanyRepository  extends CrudRepository<Company, Long>{

}
