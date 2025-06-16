package com.hcl.entity;

import java.util.List;

import com.hcl.enums.Role;

public class Customer {
  private Long customerId;
  private String custName;
  private String custEmail;
  private String custPassword;
  private Role role;
  private boolean active;
  private List<Order> orders;
  
  
public Customer() {
	super();
	
}



public Customer(Long customerId, String custName, String custEmail, String custPassword, Role role, boolean active,
		List<Order> orders) {
	super();
	this.customerId = customerId;
	this.custName = custName;
	this.custEmail = custEmail;
	this.custPassword = custPassword;
	this.role = role;
	this.active = active;
	this.orders = orders;
}



public Long getCustomerId() {
	return customerId;
}
public void setCustomerId(Long customerId) {
	this.customerId = customerId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getCustEmail() {
	return custEmail;
}
public void setCustEmail(String custEmail) {
	this.custEmail = custEmail;
}
public String getCustPassword() {
	return custPassword;
}
public void setCustPassword(String custPassword) {
	this.custPassword = custPassword;
}

public Role getRole() {
	return role;
}



public void setRole(Role role) {
	this.role = role;
}



public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
public List<Order> getOrders() {
	return orders;
}
public void setOrders(List<Order> orders) {
	this.orders = orders;
}
  
  
  
}
