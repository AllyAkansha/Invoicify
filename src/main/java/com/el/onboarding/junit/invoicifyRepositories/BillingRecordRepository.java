package com.el.onboarding.junit.invoicifyRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.el.onboarding.junit.invoicifyModels.BillingRecord;

public interface BillingRecordRepository  extends JpaRepository<BillingRecord, Integer> {

}
