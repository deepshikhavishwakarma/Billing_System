package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
	Customer findByEmailAndPassword(String email, String password);
    Customer findByEmail(String email);
}
