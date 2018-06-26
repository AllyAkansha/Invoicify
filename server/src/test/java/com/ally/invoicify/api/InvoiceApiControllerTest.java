package com.ally.invoicify.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;

import com.ally.invoicify.models.Invoice;
import com.ally.invoicify.repositories.InvoiceRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
//@SpringBootTest
@WebMvcTest({InvoiceApiController.class})
public class InvoiceApiControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private InvoiceRepository invoiceRepo;
	
	private Date time;
	private Invoice invoice;
	private ArrayList<Invoice> invoiceList;
	private ObjectMapper mapper;

	@Before
	public void setUp() throws Exception {
		mapper = new ObjectMapper();
		time = Calendar.getInstance().getTime();
		invoice = new Invoice("name", time, "description");
		invoiceList = new ArrayList<Invoice>();
		invoiceList.add(invoice);
		//invoiceList.add(invoice);
		
		Mockito.when(invoiceRepo.findOne(anyInt())).thenReturn(invoice);
		Mockito.when(invoiceRepo.findAll()).thenReturn(invoiceList);
	}
	
	@Test
	public void findFirst() throws Exception {
		String invoiceJSON = mapper.writeValueAsString(invoice);
		
		MockHttpServletResponse response = mvc.perform(get("/api/invoice/1")
		.contentType(MediaType.APPLICATION_JSON))
	    .andExpect(status().isOk()).andReturn().getResponse();
		
		assertEquals(response.getContentAsString(), invoiceJSON);
	}
	
	@Test
	public void findAll() throws Exception {
		String invoiceListJSON = mapper.writeValueAsString(invoiceList);
		
		MockHttpServletResponse response = mvc.perform(get("/api/invoice")
				.contentType(MediaType.APPLICATION_JSON))
			    .andExpect(status().isOk()).andReturn().getResponse();
		
		assertEquals(response.getContentAsString(), invoiceListJSON);
	}

	@Test
	public void GetAllInvoices() {
		
	}
}
