package com.el.onboarding.junit.invoicifyRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.el.onboarding.junit.invoicifyModels.Company;

public interface CompanyRepository  extends JpaRepository<Company, Integer> {

}
