package com.tcs.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.rest.exceptions.InvalidValueException;

@RestController
public class ProductResource {

	@GetMapping
	/*public String message(String str) {
		return "Hello" + str;
	}//http://localhost:9889/?str=Abhi to run in browser.*/
	
	
	/*public String message(String str) {
		
		if(str==null)throw new NullPointerException();
		//int n=Integer.parseInt(str);
		return "Hello" +" "+str;
	}*/
	
	
	//for run-time or unchecked exceptions no need throws
	public String message(String str) throws InvalidValueException,Exception{

		if (str == null)
			throw new NullPointerException("value not provided");
		
		
		boolean isNumeric=str.chars().anyMatch(x->Character.isDigit(x));
		
		if(isNumeric)throw new InvalidValueException("Expected String found int");
		
		if(str.length()==1)throw new Exception("value must be provided with length >1");
		
		
		return "Hello" + " " + str;
	}
	
}
