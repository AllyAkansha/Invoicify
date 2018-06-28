import { Component, OnInit } from '@angular/core';
import { BillingRecordService } from '../services/billing-record.service';

import { Company } from '../models/company.model';
import { CompanyService } from '../services/company.service';

@Component({
  selector: 'app-billing-record',
  templateUrl: './billing-record.component.html',
  styleUrls: ['./billing-record.component.css']
})
export class BillingRecordComponent implements OnInit {

  billingRecords = [];
  
  companies: Company[]

  constructor(private billingRecordService: BillingRecordService,  private companyService: CompanyService) { }

  ngOnInit() {
    this.getBillingRecords();
    this.companyService.getAllCompanies().subscribe(
      companies => this.companies = companies 
    )
  }

  getBillingRecords() {
    this.billingRecordService.getAllBillingRecords().subscribe(
      billingRecords => this.billingRecords = billingRecords
    )
  }

}
