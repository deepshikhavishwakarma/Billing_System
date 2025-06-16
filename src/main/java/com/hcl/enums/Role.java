package com.hcl.enums;

public enum Role {
 CUSTOMER("Customer"),
 BILLER("Biller");


	private final String value;

	private Role(String value) {
		this.value = value;
	}
	
	
}
