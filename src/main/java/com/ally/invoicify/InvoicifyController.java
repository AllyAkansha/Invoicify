package com.ally.invoicify;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.ally.invoicify.models.BillingRecord;
import com.ally.invoicify.models.FlatFeeBillingRecord;
import com.ally.invoicify.models.Invoice;
import com.ally.invoicify.models.RateBasedBillingRecord;
import com.ally.invoicify.repositories.BillingRecordRepository;
import com.ally.invoicify.repositories.CompanyRepository;
import com.ally.invoicify.repositories.InvoiceLineItemRepository;
import com.ally.invoicify.repositories.InvoiceRepository;

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
