package com.ally.invoicify.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company {
    @Id
    @GeneratedValue
    private int id;
    
	private String name;
	//Invoices (@OneToMany(mappedBy=“company")
    @OneToMany (mappedBy="company")
    private ArrayList<Invoice> invoices;
	
    public Company() {}

    public Company(String name){
        this.name = name;
    }
    
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
