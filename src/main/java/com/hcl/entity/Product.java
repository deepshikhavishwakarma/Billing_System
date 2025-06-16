package com.hcl.entity;

import java.util.List;

public class Product {
private Long productId;
private String prodName;
private String description;
private double price;
private String category;
private boolean active;
private Biller biller;
private List<Order> orders;
}
