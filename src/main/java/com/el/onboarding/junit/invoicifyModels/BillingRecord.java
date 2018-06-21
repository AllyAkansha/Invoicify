package com.el.onboarding.junit.invoicifyModels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="billingRecords")
public abstract class BillingRecord {
	@Id
	@GeneratedValue
	int id;
	
	private String createdOn;
	private String description;
//	
	@OneToOne(mappedBy="billingRecord")
	private LineItem lineItem;
	
	@ManyToOne
	private Company company;
	
    public BillingRecord() {}

    public BillingRecord(String createdOn, String description){
        this.createdOn = createdOn;
        this.description = description;
    }
    
    public int getId() {
		return id;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LineItem getLineItem() {
		return lineItem;
	}
	public void setLineItem(LineItem lineItem) {
		this.lineItem = lineItem;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	//	Create abstract method getTotal. Should return a double
	public abstract double getTotal();
}
