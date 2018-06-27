package com.ally.invoicify.models;

import javax.persistence.Entity;

@Entity
public class RateBasedBillingRecord extends BillingRecord{
	private double rate;
	private int quantity;
	
	public RateBasedBillingRecord() {}
	
	public RateBasedBillingRecord(double rate, int quantity, Company company, String description) {
		super(company, description);
		this.rate = rate;
		this.quantity = quantity;
	}
	
	@Override
	public double getTotal() {
		return rate * quantity;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
}
	
}
