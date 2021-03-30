package com.aste.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.aste.inventory.entity.Orders;

public interface OrderRepository  extends CrudRepository<Orders, Long>{

}
