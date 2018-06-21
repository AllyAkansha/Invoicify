package com.el.onboarding.junit.invoicify;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.el.onboarding.junit.invoicifyModels.BillingRecord;
import com.el.onboarding.junit.invoicifyModels.FlatFeeBillingRecord;
import com.el.onboarding.junit.invoicifyModels.Invoice;
import com.el.onboarding.junit.invoicifyModels.RateBasedBillingRecord;
import com.el.onboarding.junit.invoicifyRepositories.BillingRecordRepository;
import com.el.onboarding.junit.invoicifyRepositories.CompanyRepository;
import com.el.onboarding.junit.invoicifyRepositories.InvoiceLineItemRepository;
import com.el.onboarding.junit.invoicifyRepositories.InvoiceRepository;

@Controller
//@RequestMapping("/")
public class InvoicifyController {

	  private BillingRecordRepository BillingRecordRepo;
	  private CompanyRepository CompanyRepo;
	  private InvoiceLineItemRepository InvoiceLineItemRepo;
	  private InvoiceRepository InvoiceRepo;
	
//	list method returns all billing records
	public List<BillingRecord> BillingRecordController(){
		return BillingRecordRepo.findAll();
	}
	
//	create method creates a FlatFeeBillingRecord for a company and returns the new record
	public FlatFeeBillingRecord FlatFeeBillingRecordController(){
		FlatFeeBillingRecord record = new FlatFeeBillingRecord();
		//needs to be added to repos based on associated information of LineItem
		
		return record;
	}
//	list method returns all invoices
	public List<Invoice> InvoiceController(){
		return InvoiceRepo.findAll();
		
	}
	
//	create method creates a RateBasedBillingRecord for a company and returns the new record
	public RateBasedBillingRecord RateBasedBillingRecordController() {
		RateBasedBillingRecord record = new RateBasedBillingRecord();
		//needs to be added to repos based on associated information of LineItem
		
		return record;
	}
	
	
}
