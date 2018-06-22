package com.ally.invoicify.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ally.invoicify.models.Company;
import com.ally.invoicify.repositories.CompanyRepository;

@RestController
@RequestMapping("/api/company")
public class CompanyApiController {

  private CompanyRepository companyRepo;

  public CompanyApiController(CompanyRepository companyRepo) {
    this.companyRepo = companyRepo;
  }

  @GetMapping("")
  public List<Company> getAll() {
    return companyRepo.findAll();
  }

  @GetMapping("{id}")
  public Company getOne(@PathVariable int id) {
    return companyRepo.findOne(id);
  }

  @PostMapping("")
  public Company create(@RequestBody Company actor) {
    return companyRepo.save(actor);
  }

  @PutMapping("{id}")
  public Company update(@RequestBody Company company, @PathVariable int id) {
    company.setId(id);
    return companyRepo.save(company);
  }

  @DeleteMapping("{id}")
  public Company delete(@PathVariable int id) {
    Company actor = companyRepo.findOne(id);
    companyRepo.delete(id);
    return actor;
  }

}