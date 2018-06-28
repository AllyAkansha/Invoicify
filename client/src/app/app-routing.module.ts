import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CommonModule } from '@angular/common';
import { CompanyComponent }      from './company/company.component';
import { InvoiceComponent }      from './invoice/invoice.component';
import { BillingRecordComponent }      from './billing-record/billing-record.component';
import { UserComponent }      from './user/user.component';

import { InvoiceModalComponent }      from './invoice-modal/invoice-modal.component';


const routes: Routes = [
  { path: 'companies', component: CompanyComponent },
  { path: 'billing-records', component: BillingRecordComponent },
  { path: 'invoices', component: InvoiceComponent },
  { path: 'users', component: UserComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
