package com.ally.invoicify.models;

public class FlatFeeBillingRecord extends BillingRecord {

	private double amount;
	
//	Implement abstract method from parent for getTotal that returns the amount property
	public  double getTotal() {
		return this.amount;
	}
}
