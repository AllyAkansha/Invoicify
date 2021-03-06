import { Injectable } from '@angular/core'
import { Http, Response, RequestOptions } from '@angular/http'

import { Observable } from 'rxjs/Observable'
import 'rxjs/add/operator/map'
import { Invoice } from '../models/invoice.model'

import apiUrl from './apiUrl';

@Injectable({
  providedIn: 'root'
})
export class InvoiceService {

  private baseUrl: string = `${apiUrl}/api/invoice`

  options = new RequestOptions({ withCredentials: true });

  constructor(private http: Http) { }

  getAllInvoices(): Observable<any> {
    return this.http.get(this.baseUrl, this.options)
      .map(result => result.json())
  }

  getInvoice(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`, this.options)
      .map(result => result.json())
  }

  createInvoice(invoice: object, companyId: number): Observable<any> {
    console.log(`${this.baseUrl}/${companyId}`)
    return this.http.post(`${this.baseUrl}/${companyId}`, { invoice }, this.options)
      .map(result => result.json())
  }

  updateInvoice(id: number, invoice: Invoice): Observable<any> {
    return this.http.put(`${this.baseUrl}/${id}`, { invoice }, this.options)
      .map(result => result.json())
  }

  deleteInvoice(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, this.options)
      .map(result => result.json())
  }
}
