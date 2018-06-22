# Invoicify

Updated: should get them through today. Will add more tasks for tomorrow related to swagger and security. Also, when creating and invoice there is some extra steps. I will cover that a bit later. Let me know if this looks ok or you have any questions

Create 1 Trello Account per team
https://trello.com/

Create a team in Trello and add your team mates

Create backlog for Invoicify in Trello

Setup base spring app with dependencies needed

Create repo for collaboration on GitHub and add team members as collaborators

Create models (entities) and relationships
..* Company
    ..* id
    ..* name
    ..* Invoices (@OneToMany(mappedBy=“company")
..* Invoice
    ..* id
    ..* company (@ManyToOne)
    ..* createdOn
    ..* invoiceDescription
    ..* lineItems (@OneToMany(mappedBy="invoice", cascade=CascadeType.ALL)
..* BillingRecord (abstract class)
    ..* id
    ..* createdOn
    ..* description
    ..* lineItem (@OneToOne(mappedBy=“billingRecord”)
    ..* company (@ManyToOne)
    ..* Create abstract method getTotal. Should return a double
..* FlatFeeBillingRecord (extends BillingRecord)
    ..* amount
    ..* Implement abstract method from parent for getTotal that returns the amount property
..* RateBasedBillingRecord (extends BillingRecord)
    ..* rate
    ..* quantity
   ..* Implement abstract method from parent for getTotal that returns the (rate * quantity)
..* InvoiceLineItem
    ..* id
    ..* billingRecord (@OneToOne) 
    ..* createdOn
    ..* invoice (@ManyToOne)

Create JPA Repositories
..* BillingRecordRepository
..* CompanyRepository
..* InvoiceLineItemRepository
..* InvoiceRepository

Create Controller Tests
BillingRecordController
list method returns all billing records
FlatFeeBillingRecordController
create method creates a FlatFeeBillingRecord for a company and returns the new record
InvoiceController
list method returns all invoices
RateBasedBillingRecordController
create method creates a RateBasedBillingRecord for a company and returns the new record

Create Controllers and satisfy tests
	




