import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { CompanyComponent } from './company/company.component';
import { InvoiceComponent } from './invoice/invoice.component';
import { InvoiceModalComponent } from './invoice-modal/invoice-modal.component';

import { BillingRecordComponent } from './billing-record/billing-record.component';
import { AppRoutingModule } from './/app-routing.module';
import { UserComponent } from './user/user.component';

@NgModule({
  declarations: [
    AppComponent,
    CompanyComponent,
    InvoiceComponent,
    InvoiceModalComponent,
    BillingRecordComponent,
    UserComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
