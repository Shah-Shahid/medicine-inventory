package com.aste.inventory.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CartItem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	@JoinColumn(name="Medicine_ID")
	@ManyToOne(fetch=FetchType.EAGER)
	Medicine medicine;
	
		
	@Column(name="Quantity")
	Long quantity;
	
	@Column(name="Available")
	Boolean available;
	
	@JsonIgnore
	@JoinColumn(name="Order_ID")
	@ManyToOne(fetch=FetchType.EAGER)
	Orders order;

	@JsonIgnore
	@JoinColumn(name="User_ID")
	@ManyToOne(fetch=FetchType.EAGER)
	User user;
	
	
	
	public long getId() {
		return id;
	}
 
	public void setId(long id) {
		this.id = id;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	
	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
}
