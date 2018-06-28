package com.ally.invoicify.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ally.invoicify.models.Company;
import com.ally.invoicify.repositories.CompanyRepository;

@RunWith(SpringRunner.class)
public class CompanyControllerTest {
	
	private static CompanyApiController cac;
	@MockBean
	private static CompanyRepository cr;
	private MockMvc mvc;
	
	@BeforeClass
	public static void setUp() {
		cac = new CompanyApiController(cr);
	}

	@Test
	public void test() {
		cr = Mockito.mock(CompanyRepository.class);
		Company adidas = new Company("Adidas");
		when(cr.findOne(anyInt())).thenReturn(adidas);
		
		MockHttpServletResponse response = mvc.perform(get("/1")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn().getResponse();
		
		Company ret = cr.findOne(1);
		
		verify(cr, times(1)).findOne(1);
		assertEquals(ret.getName(), adidas.getName());
		
	}

	
	
	
	
	
	
	
	
	
	
}
