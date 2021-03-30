package com.aste.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.aste.inventory.entity.CartItem;

public interface CartItemRepository  extends CrudRepository<CartItem, Long>{

}
