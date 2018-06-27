package com.ally.invoicify.models;

import javax.persistence.Entity;

@Entity
public class FlatFeeBillingRecord extends BillingRecord {

	private double amount;
	
	public FlatFeeBillingRecord() {}
	
	public FlatFeeBillingRecord(double amount, Company company, String description) {
		super(company, description);
		this.amount = amount;
	}
	
	@Override
	public double getTotal() {
		return amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
}
}
