package com.tcs.rest.resources;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.rest.resource.Product;
import com.tcs.rest.services.ProductService;

@WebMvcTest(ProductResource.class)
class ProductResourceTest {

	@MockBean
	ProductService service;
	
	@Autowired
	MockMvc mockMvc;
	//makes dummy http calls like-post,get
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void test_addProduct()throws Exception{
		Product product=new Product(1,"Apple iphone 15",125000);
		
		when(service.save(product)).thenReturn(product);//it wont call repository
		
		mockMvc.perform(post("/addProduct").contentType(MediaType.APPLICATION_JSON).
		        content(
				new ObjectMapper().writeValueAsString(product)
				));
	}
	
	
	@Test
	public void test_allproduct() throws Exception {
	     List<Product> list = new ArrayList<>(); 
		when(service.getProducts()).
		thenReturn(list);
		mockMvc.perform(post("/allproducts").
				contentType(MediaType.APPLICATION_JSON).
				content(
						new ObjectMapper().
						writeValueAsString(list)
						));
	}
	
	
	
	
	
	

}
