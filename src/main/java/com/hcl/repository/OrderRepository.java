package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Customer;
import com.hcl.entity.Order;
import com.hcl.entity.Product;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
 Order findByCustomerAndProduct(Customer customer,Product product);
}
