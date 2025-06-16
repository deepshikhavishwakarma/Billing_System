package com.hcl.entity;

import java.time.LocalDateTime;



public class Order {
	private Long orderId;
	  private Customer customer;
	  private Product product;
	  private LocalDateTime orderDate;
	  private String orderStatus;
	  private String payStatus;
	  private String billId;
	  
	public Order(Long orderId, Customer customer, Product product, LocalDateTime orderDate, String orderStatus,
			String payStatus, String billId) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.product = product;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.payStatus = payStatus;
		this.billId = billId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}
	  
	  
	  
	 
}
