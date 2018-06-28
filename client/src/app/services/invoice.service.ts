import { Injectable } from '@angular/core'
import { Http, Response } from '@angular/http'

import { Observable } from 'rxjs/Observable'
import 'rxjs/add/operator/map'
import { Invoice } from '../models/invoice.model'

@Injectable({
  providedIn: 'root'
})
export class InvoiceService {

  private baseUrl: string = 'http://localhost:8080/api/invoice'

  constructor(private http: Http) { }

  getAllInvoices(): Observable<any> {
    return this.http.get(this.baseUrl)
      .map(result => result.json())
  }

  getInvoice(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`)
      .map(result => result.json())
  }

  createInvoice(invoice: Invoice): Observable<any> {
    return this.http.post(this.baseUrl, { invoice })
      .map(result => result.json())
  }

  updateInvoice(id: number, invoice: Invoice): Observable<any> {
    return this.http.put(`${this.baseUrl}/${id}`, { invoice })
      .map(result => result.json())
  }

  deleteInvoice(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`)
      .map(result => result.json())
  }
}
