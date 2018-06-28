import { Injectable } from '@angular/core'
import { Http, Response } from '@angular/http'

import { Observable } from 'rxjs/Observable'
import 'rxjs/add/operator/map'

@Injectable({
  providedIn: 'root'
})
export class CompanyService {

  private baseUrl: string = 'http://localhost:8080/api/company'

  constructor(private http: Http) { }

  getAllCompanies(): Observable<any> {
    return this.http.get(this.baseUrl)
      .map(result => result.json())
  }

  getCompany(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`)
      .map(result => result.json())
  }

  createCompany(name: String): Observable<any> {
    return this.http.post(this.baseUrl, { name })
      .map(result => result.json())
  }

  updateCompany(id: number, name: String): Observable<any> {
    return this.http.put(`${this.baseUrl}/${id}`, { name })
      .map(result => result.json())
  }

  deleteCompany(id: number,): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`)
      .map(result => result.json())
  }
}
