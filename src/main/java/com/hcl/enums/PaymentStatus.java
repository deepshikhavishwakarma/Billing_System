package com.hcl.enums;

public enum PaymentStatus {
	
	PENDING("Pending"), SUCCESS("Succes"), FAILED("Failed");

	private final String value;

	private PaymentStatus(String value) {
		this.value = value;
	}

}
