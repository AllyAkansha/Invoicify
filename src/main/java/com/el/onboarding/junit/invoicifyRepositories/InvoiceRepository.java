package com.el.onboarding.junit.invoicifyRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.el.onboarding.junit.invoicifyModels.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
