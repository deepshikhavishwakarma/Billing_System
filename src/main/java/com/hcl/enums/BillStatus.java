package com.hcl.enums;

public enum BillStatus {
PAID("Paid"),
PENDING("Pending"),
OVERDUE("Overdue");
	private final String value;

	private BillStatus(String value) {
		this.value = value;
	}
	
}
