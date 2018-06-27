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

import com.ally.invoicify.models.Invoice;
import com.ally.invoicify.repositories.InvoiceRepository;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceApiController {

  private InvoiceRepository invoiceRepo;

  public InvoiceApiController(InvoiceRepository companyRepo) {
    this.invoiceRepo = companyRepo;
  }

  /***
   * Mapping to return all invoices.
   * @return
   */
  @GetMapping("")
  public List<Invoice> getAll() {
    return invoiceRepo.findAll();
  }

  /***
   * Mapping to return an invoice with given id.
   * @param id
   * @return
   */
  @GetMapping("{id}")
  public Invoice getOne(@PathVariable int id) {
    return invoiceRepo.findOne(id);
  }

  /***
   * Mapping (POST) to create an invoice in the system.
   * @param invoice
   * @return
   */
  @PostMapping("")
  public Invoice create(@RequestBody Invoice invoice) {
    return invoiceRepo.save(invoice);
  }

  /***
   * Mapping (PUT) to update an invoice's id.
   * @param invoice
   * @param id
   * @return
   */
  @PutMapping("{id}")
  public Invoice update(@RequestBody Invoice invoice, @PathVariable int id) {
    invoice.setId(id);
    return invoiceRepo.save(invoice);
  }

  /***
   * Mapping (DELETE) to remove an invoice with id from the system.
   * @param id
   * @return
   */
  @DeleteMapping("{id}")
  public Invoice delete(@PathVariable int id) {
    Invoice actor = invoiceRepo.findOne(id);
    invoiceRepo.delete(id);
    return actor;
  }

}