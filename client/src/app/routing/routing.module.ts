import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes, CanActivate } from '@angular/router';

import { AuthGuard } from '../auth-guard.service';

import { DashboardComponent }   from '../dashboard/dashboard.component';
import { CompanyComponent }   from '../company/company.component';
import { BillingRecordComponent } from '../billing-record/billing-record.component';
import { InvoiceComponent } from '../invoice/invoice.component';

const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
  { path: 'dashboard',  component: DashboardComponent },
  { path: 'company',  component: CompanyComponent, canActivate: [AuthGuard] },
  { path: 'billing-record',  component: BillingRecordComponent, canActivate: [AuthGuard] },
  { path: 'invoice', component: InvoiceComponent, canActivate: [AuthGuard] }
];

@NgModule({
  imports: [
    CommonModule, 
    RouterModule.forRoot(routes) 
  ],
  // declarations: [],
  exports: [ RouterModule ]
})
export class RoutingModule {}