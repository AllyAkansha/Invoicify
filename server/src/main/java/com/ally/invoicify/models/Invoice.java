package com.ally.invoicify.models;

import java.util.Date;
import java.util.List;

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
		private Date createdOn;
		private String description;
		
		//company (@ManyToOne)
		@ManyToOne
		private Company company;
		
		//lineItems (@OneToMany(mappedBy="invoice", cascade=CascadeType.ALL)
		@OneToMany(mappedBy="invoice", cascade=CascadeType.ALL)
		private List<LineItem> lineItems;
		
	    public Invoice() {}

	    public Invoice(String name, Date createdOn, String description){
	        this.name = name;
	        this.createdOn = createdOn;
	        this.description = description;
	    }
	    
	    public void setId(int id) {
	    	this.id = id;
	    }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getCreatedOn() {
			return createdOn;
		}
		public void setCreatedOn(Date createdOn) {
			this.createdOn = createdOn;
		}
		public String getInvoiceDescription() {
			return description;
		}
		public void setInvoiceDescription(String invoiceDescription) {
			this.description = invoiceDescription;
		}
}
