import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { RoutingModule } from './routing/routing.module';
import { DashboardComponent } from './dashboard/dashboard.component';
import { NavigationComponent } from './navigation/navigation.component';
import { CompanyComponent } from './company/company.component';
import { InvoiceComponent } from './invoice/invoice.component';
import { InvoiceModalComponent } from './invoice-modal/invoice-modal.component';

import { BillingRecordComponent } from './billing-record/billing-record.component';
import { BillingRecordService } from './services/billing-record.service';
import { CompanyService } from './services/company.service';
import { InvoiceService } from './services/invoice.service';
import { DataService } from './data.service';

import { AuthGuard } from './auth-guard.service';
import { AuthService } from './auth.service';

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    CompanyComponent,
    InvoiceComponent,
    InvoiceModalComponent,
    BillingRecordComponent,
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    RoutingModule,
    FormsModule
  ],
  providers: [BillingRecordService, CompanyService, InvoiceService, DataService, AuthGuard, AuthService],
  bootstrap: [AppComponent]
})
export class AppModule { }
