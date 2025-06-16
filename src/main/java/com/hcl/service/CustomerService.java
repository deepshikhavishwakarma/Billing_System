package com.hcl.service;

import java.util.List;

import com.hcl.entity.Biller;
import com.hcl.entity.Customer;

public interface CustomerService {
  public Customer registerCustomer(Customer customer);
  public Customer loginCustomer(String email,String password);
  public Customer getCustomerById(Long customerId);
  public Customer updateCustomer(Customer customer);
  public List<Biller> registeredBiller(Long customerId);
}
