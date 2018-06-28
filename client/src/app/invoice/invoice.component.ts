import { Component, OnInit } from '@angular/core';
import { Invoice } from '../models/invoice.model';
import { InvoiceService } from '../services/invoice.service';
import { Company } from '../models/company.model';
import { CompanyService } from '../services/company.service';
import { BillingRecordService } from '../services/billing-record.service';

@Component({
  selector: 'app-invoice',
  templateUrl: './invoice.component.html',
  styleUrls: ['./invoice.component.css']
})
export class InvoiceComponent implements OnInit {

  invoices = []
  companies: Company[]
  records: any[]

  newInvoice: Invoice = {
    id: 0,
    invoiceDescription: "",
    createdOn: new Date()
  }

  companyId: number;

  constructor(private invoiceService: InvoiceService, private companyService: CompanyService, private billingrecordService: BillingRecordService) { }

  ngOnInit() {
    this.getInvoices();
    this.companyService.getAllCompanies().subscribe(
      companies => this.companies = companies 
    )
    this.billingrecordService.getAllBillingRecords().subscribe(
      records => this.records = records 
    )
  }

  getInvoices() {
    this.invoiceService.getAllInvoices().subscribe(
      invoices => this.invoices = invoices
    )
  }
  submit() {
    console.log(this.newInvoice, this.companyId)
    this.invoiceService.createInvoice(this.newInvoice, this.companyId)
  }

}
