package com.el.onboarding.junit.invoicifyModels;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="invoices")
public class Invoice {

	    @Id
	    @GeneratedValue
	    private int id;
	    
		private String name;
		private String createdOn;
		private String invoiceDescription;
		
		//company (@ManyToOne)
		@ManyToOne
		private Company company;
		
		//lineItems (@OneToMany(mappedBy="invoice", cascade=CascadeType.ALL)
		@OneToMany(mappedBy="invoice", cascade=CascadeType.ALL)
		private ArrayList<LineItem> lineItems;
		
	    public Invoice() {}

	    public Invoice(String name, String createdOn, String invoiceDescription){
	        this.name = name;
	        this.createdOn = createdOn;
	        this.invoiceDescription = invoiceDescription;
	    }
	    
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCreatedOn() {
			return createdOn;
		}
		public void setCreatedOn(String createdOn) {
			this.createdOn = createdOn;
		}
		public String getInvoiceDescription() {
			return invoiceDescription;
		}
		public void setInvoiceDescription(String invoiceDescription) {
			this.invoiceDescription = invoiceDescription;
		}
	    
	    
	
}
