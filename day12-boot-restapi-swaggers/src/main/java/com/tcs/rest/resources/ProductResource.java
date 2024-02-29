package com.tcs.rest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.rest.resource.Product;
import com.tcs.rest.services.ProductService;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;

//this class going to be the rest controller
//in mvc or rest the classes wont have any state(instance variables)
//in mvc we use controller in rest it is resource different terminology
//because for every state they create child threads 

@RestController
@RequestMapping("/product/api.1.0")
//@Api(value="Product Service API 2.0",description="Rest endpoints for Product API")
//remove @API for swaggers
public class ProductResource {
    //GET POST PUT DELETE are standard methods
	//rest is combining web and distributed programming 
	
	@Autowired
	ProductService service;
	
	
	@GetMapping
	public String check() {
		return "/product/api.1.0";
	}
	
	@GetMapping
	@RequestMapping("/allproducts")
	public List<Product> showAllProducts(){
		return service.getProducts();
	}
	
	@GetMapping
	@RequestMapping("/productid/{id}")
//	@ApiOperation(value="Returns the Product Entity")
	//productid/{id} ->address or uri
	public Product fetchProduct(@PathVariable int id) {
		System.out.println(id);
		return service.getProductById(id);
	}
	
	@PostMapping
	@RequestMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
	                 produces=MediaType.APPLICATION_JSON_VALUE,
	                 value="/addproduct")
	public Product createProduct(@RequestBody Product product) {
		
		return service.save(product);
		
	}
	
	@PutMapping
	@RequestMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
	                 produces=MediaType.APPLICATION_JSON_VALUE,
	                 value="/modifyproduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.update(product);
	}
	
	
	
	@DeleteMapping
	@RequestMapping("/remove/{id}")
	public boolean deleteProduct(@PathVariable int id) {
		return service.delete(id);
	}
	
}




//ANOTHER WAY OF WRITING

///* @RestController
//@RequestMapping("/product/api.1.0")
//public class ProductResource {
//	@Autowired
//	ProductService service;
//	@GetMapping
//	public String check() {
//		return "Successfull";
//	}
//	@GetMapping("/allproducts")
//	public List<Product> showAllProducts(){
//		return service.getProducts();
//	}
//	@GetMapping("/productid/{id}")
//	public Optional<Product> fetchproduct(@PathVariable int id) {
//		return service.getProductById(id);
//	}
//	@PostMapping(path="/addproduct",consumes="application/json",produces="application/json")
//	public Product createProduct(@RequestBody Product product) {
//		return service.save(product);
//	}
//	@PutMapping(path="/updateproduct",consumes="application/json",produces="application/json")
//	public Product updateProduct(@RequestBody Product product) {
//		return service.update(product);
//	}
//	@DeleteMapping("/remove/{id}")
//	public boolean deleteProduct(@PathVariable int id) {
//		return service.delete(id);
//	}* /
