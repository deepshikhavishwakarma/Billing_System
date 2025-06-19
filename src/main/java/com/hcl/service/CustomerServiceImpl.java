package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.entity.Biller;
import com.hcl.entity.Customer;
import com.hcl.enums.Role;
import com.hcl.repository.BillerRepository;
import com.hcl.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private BillerRepository billerRepository;

	@Override
	public Customer registerCustomer(Customer customer) {
		String email = customer.getCustEmail();
		if (customerRepository.findByEmail(email) != null || billerRepository.findByEmail(email) != null) {
			return null;
		}
		customer.setActive(true);
		customer.setRole(Role.CUSTOMER);
		return customerRepository.save(customer);
	}

	@Override
	public Customer loginCustomer(String email, String password) {
		
		return customerRepository.findByEmailAndPassword(email ,password);
	}

	@Override
	public Customer getCustomerById(Long customerId) {
		
		return customerRepository.findById(customerId).orElse(null);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Biller> registeredBiller(Long customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
