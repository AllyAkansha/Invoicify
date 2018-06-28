import { Injectable } from '@angular/core'
import { Http, Response } from '@angular/http'

import { Observable } from 'rxjs/Observable'
import 'rxjs/add/operator/map'

import { Company } from '../models/company.model'

@Injectable({
  providedIn: 'root'
})
export class BillingRecordService {

  private baseUrl: string = 'http://localhost:8080/api/billing-record'

  constructor(private http: Http) { }

  getAllBillingRecords(): Observable<any> {
    return this.http.get(this.baseUrl)
      .map(result => result.json())
  }

  createRateBasedBillingRecord(rate: number, quantity: number, company: Company, description: String): Observable<any> {
    return this.http.post(`${this.baseUrl}/rate-based/`, { rate, quantity, company, description })
      .map(result => result.json())
  }

  createFlatFeeBillingRecord(amount: number, company: Company, description: String): Observable<any> {
    return this.http.post(`${this.baseUrl}/flat-fee/`, { amount, company, description })
      .map(result => result.json())
  }
}
