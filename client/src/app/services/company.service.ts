import { Injectable } from '@angular/core'
import { Http, Response, RequestOptions } from '@angular/http'

import { Observable } from 'rxjs/Observable'
import 'rxjs/add/operator/map'

import apiUrl from './apiUrl';

@Injectable({
  providedIn: 'root'
})
export class CompanyService {

  private baseUrl: string = `${apiUrl}/api/company`

  options = new RequestOptions({ withCredentials: true });

  constructor(private http: Http) { }

  getAllCompanies(): Observable<any> {
    return this.http.get(this.baseUrl, this.options)
      .map(result => result.json())
  }

  getCompany(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`, this.options)
      .map(result => result.json())
  }

  createCompany(name: String): Observable<any> {
    return this.http.post(this.baseUrl, { name }, this.options)
      .map(result => result.json())
  }

  updateCompany(id: number, name: String): Observable<any> {
    return this.http.put(`${this.baseUrl}/${id}`, { name }, this.options)
      .map(result => result.json())
  }

  deleteCompany(id: number,): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, this.options)
      .map(result => result.json())
  }
}
