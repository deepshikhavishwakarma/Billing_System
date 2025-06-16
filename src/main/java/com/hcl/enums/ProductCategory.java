package com.hcl.enums;

public enum ProductCategory {
	SKINCARE("skin-care"), MAKUP_BEAUTY("Makeup-beauty"), PHARMACY("Pharmacy"), HAIRCARE("Hair-care"),
	JEWELLERY_ACCESSORIES("Jewellery-accessories"), BABYCARE("Baby-care"), PETCARE("pet-care"),
	ICECREAM_MORE("Icecream-more"), TEA_COFFEE_MORE("Tea-coffee"), DAIRY_BREAD_MORE("Dairy-bread"),
	FRUIT_VEGETABLES("Fruits-vegetables"), COLD_DRINKS_JUICES("Cold-drinks"), MUNCHIES("Munchies"),
	BISCUITS_COOKIES("Biscuits-cookies"), TOYS_SPORTS("Toys-sports"), OTHER("Others");

	private final String value;

	private ProductCategory(String value) {
		this.value = value;
	}
	

}
