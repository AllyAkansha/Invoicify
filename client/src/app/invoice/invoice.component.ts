import { Component, OnInit } from '@angular/core';
import { Invoice } from '../models/invoice.model';
import { InvoiceService } from '../services/invoice.service';

@Component({
  selector: 'app-invoice',
  templateUrl: './invoice.component.html',
  styleUrls: ['./invoice.component.css']
})
export class InvoiceComponent implements OnInit {

  invoices = []

  constructor(private invoiceService: InvoiceService) { }

  ngOnInit() {
    this.getInvoices();
  }

  getInvoices() {
    this.invoiceService.getAllInvoices().subscribe(
      invoices => this.invoices = invoices
    )
  }
}
