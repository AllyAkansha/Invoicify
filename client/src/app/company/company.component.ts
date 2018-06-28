import { Component, OnInit } from '@angular/core';
import { Company } from '../models/company.model';
import { CompanyService } from '../services/company.service';

@Component({
  selector: 'app-company',
  templateUrl: './company.component.html',
  styleUrls: ['./company.component.css']
})
export class CompanyComponent implements OnInit {

  companies: Company[]

  newCompanyName: String

  constructor(private companyService: CompanyService) { }

  ngOnInit() {
    this.companyService.getAllCompanies().subscribe(
      companies => this.companies = companies
    )
  }

  submit() {
    this.companyService.createCompany(this.newCompanyName).subscribe(
      company => this.companies.push(company)
    )
  }

}
