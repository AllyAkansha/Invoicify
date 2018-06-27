package com.ally.invoicify.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ally.invoicify.models.BillingRecord;
import com.ally.invoicify.models.FlatFeeBillingRecord;
import com.ally.invoicify.repositories.BillingRecordRepository;
import com.ally.invoicify.repositories.CompanyRepository;

@RestController
@RequestMapping("/api/billing-record")
public class BillingRecordApiController {

  private BillingRecordRepository billingRecordRepo;
  private CompanyRepository companyRepo;

  public BillingRecordApiController(BillingRecordRepository billingRecordRepo, CompanyRepository companyRepo) {
    this.billingRecordRepo = billingRecordRepo;
    this.companyRepo = companyRepo;
  }

  @GetMapping("")
  public List<BillingRecord> getAll() {
    return billingRecordRepo.findAll();
  }
  /***
   * Associate a flat billing record (POST) with the provided client id.
   * @param billingRecord
   * @param clientId
   * @return
   */
  @PostMapping("flat-fee/{clientId}")
  public BillingRecord createFlatFeeBillingRecord(@RequestBody FlatFeeBillingRecord billingRecord, @PathVariable int clientId) {
	  billingRecord.setCompany(companyRepo.findOne(clientId));
	  return billingRecordRepo.save(billingRecord);
  }
  /***
   * Associate a rate billing record (POST) with provided client id.
   * @param billingRecord
   * @param clientId
   * @return
   */
  @PostMapping("rate-based/{clientId}")
  public BillingRecord createRateBasedBillingRecord(@RequestBody FlatFeeBillingRecord billingRecord, @PathVariable int clientId) {
	  billingRecord.setCompany(companyRepo.findOne(clientId));
	  return billingRecordRepo.save(billingRecord);
  }
}