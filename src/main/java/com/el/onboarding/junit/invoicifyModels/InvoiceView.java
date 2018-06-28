package com.el.onboarding.junit.invoicifyModels;

import java.util.List;

public class InvoiceView {
	
	private String invoiceDescription;
	private List<Integer> recordIds;
	
	public InvoiceView(){}

	public String getInvoiceDescription() {
		return invoiceDescription;
	}

	public void setInvoiceDescription(String invoiceDescription) {
		this.invoiceDescription = invoiceDescription;
	}

	public List<Integer> getRecordIds() {
		return recordIds;
	}

	public void setRecordIds(List<Integer> recordIds) {
		this.recordIds = recordIds;
	}
	
	
	
	
}
