package com.el.onboarding.junit.invoicifyModels;

public class RateBasedBillingRecord extends BillingRecord{
	private double rate;
	private int quantity;
	
//	Implement abstract method from parent for getTotal that returns the (rate * quantity)
	public  double getTotal() {
		return (this.rate * this.quantity);
	}
	
}
