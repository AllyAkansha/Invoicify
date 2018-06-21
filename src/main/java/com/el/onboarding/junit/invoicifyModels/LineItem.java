package com.el.onboarding.junit.invoicifyModels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="lineitems")
public class LineItem {
	@Id
    @GeneratedValue
    private int id;
	
	private String createdOn;
	
//	billingRecord (@OneToOne)
	@OneToOne
	private BillingRecord billingRecord;
	
//	invoice (@ManyToOne)
	@ManyToOne
	private Invoice invoice;
	
	
    public LineItem() {}

    public LineItem(String createdOn){
        this.createdOn = createdOn;
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
	public BillingRecord getBillingRecord() {
		return billingRecord;
	}
	public void setBillingRecord(BillingRecord billingRecord) {
		this.billingRecord = billingRecord;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
    
	
	

}
