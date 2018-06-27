package com.ally.invoicify.models;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="billingRecords")
public abstract class BillingRecord {
	@Id
	@GeneratedValue
	int id;
	
	private Date createdOn;
	private String description;
//	
	@OneToOne(mappedBy="billingRecord")
	private LineItem lineItem;
	
	@ManyToOne
	private Company company;
	
    public BillingRecord() {}
    
    public BillingRecord(Date createdOn, Company company, String description){
        this.createdOn = createdOn;
        this.company = company;
        this.description = description;
    }
    
    public BillingRecord(Company company, String description){
        this.createdOn = Calendar.getInstance().getTime();
        this.company = company;
        this.description = description;
    }
    
    public int getId() {
		return id;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
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
