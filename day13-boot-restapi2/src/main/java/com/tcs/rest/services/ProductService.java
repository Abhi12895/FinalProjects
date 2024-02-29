package com.tcs.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.rest.repository.ProductRepository;
import com.tcs.rest.resource.Product;

@Service
public class ProductService {

	@Autowired
	ProductRepository repo;
	
	public List<Product> getProducts() {
		
		List<Product> list=repo.findAll();//jpa is writing as part of dao
		return list;
	}
	
	public Product getProductById(int id) {
		Optional <Product> prod=repo.findById(id);//return type is optional 
		//it doesn't throw null pointer exception
		System.out.println(prod.get());
    	return prod.get();
		
	}
	
	public Product save(Product p) {
		return repo.save(p);
		
	}
	
	public Product update(Product p) {
		
		Optional<Product> opt=repo.findById(p.getPid());
		Product temppro=opt.get();
		temppro.setDescription(p.getDescription());
		temppro.setPrice(p.getPrice());
		repo.save(temppro);
		
		return temppro;
	}
	
	public boolean delete(int id) {
		repo.deleteById(id);
		return true;
	}
}
