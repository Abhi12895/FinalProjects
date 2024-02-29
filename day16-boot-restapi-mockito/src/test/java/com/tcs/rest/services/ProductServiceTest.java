package com.tcs.rest.services;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tcs.rest.repository.ProductRepository;
import com.tcs.rest.resource.Product;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

	@InjectMocks
	private ProductService service;
	
	@Mock
	private ProductRepository reposiotry;
	
	@BeforeEach
	void setUp() {
		Optional<Product>opt=Optional.of(new Product(9,"smart washing MAchine",125000.00));
		System.out.println(opt.get());
		Mockito.when(reposiotry.findById(9)).thenReturn(opt);
	}
	
	@Test
	public void testGetProductById() {
		double expected_price=125000.0;
		Product prod=service.getProductById(9);
		assertEquals(expected_price,prod.getPrice());
	}
	
	
	
}
