import { Component, OnInit } from '@angular/core';
import { BillingRecordService } from '../services/billing-record.service';

@Component({
  selector: 'app-billing-record',
  templateUrl: './billing-record.component.html',
  styleUrls: ['./billing-record.component.css']
})
export class BillingRecordComponent implements OnInit {

  billingRecords = [];

  constructor(private billingRecordService: BillingRecordService) { }

  ngOnInit() {
    this.getBillingRecords();
  }

  getBillingRecords() {
    this.billingRecordService.getAllBillingRecords().subscribe(
      billingRecords => this.billingRecords = billingRecords
    )
  }

}
