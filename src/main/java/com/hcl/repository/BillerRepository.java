package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.entity.Biller;

public interface BillerRepository extends JpaRepository<Biller, Long>{
	Biller findByEmailAndPassword(String email, String password);
	Biller findByEmail(String email);
}
