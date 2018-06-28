import { Injectable } from '@angular/core'
import { Http, Response, RequestOptions } from '@angular/http'

import { Observable } from 'rxjs/Observable'
import 'rxjs/add/operator/map'

import { Company } from '../models/company.model'

@Injectable({
  providedIn: 'root'
})
export class BillingRecordService {

  private baseUrl: string = 'https://api-invoicify-phase2.herokuapp.com/api/billing-record'

  options = new RequestOptions({ withCredentials: true });

  constructor(private http: Http) { }

  getAllBillingRecords(): Observable<any> {
    return this.http.get(this.baseUrl, this.options)
      .map(result => result.json())
  }

  createRateBasedBillingRecord(rate: number, quantity: number, company: Company, description: String): Observable<any> {
    return this.http.post(`${this.baseUrl}/rate-based/`, { rate, quantity, company, description }, this.options)
      .map(result => result.json())
  }

  createFlatFeeBillingRecord(amount: number, company: Company, description: String): Observable<any> {
    return this.http.post(`${this.baseUrl}/flat-fee/`, { amount, company, description }, this.options)
      .map(result => result.json())
  }
}
