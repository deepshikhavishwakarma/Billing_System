package com.hcl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Biller;
import com.hcl.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
List<Product> findAllByBiller(Biller biller);
}
