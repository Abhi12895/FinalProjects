package com.tcs.service.resource;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//we are making a service request registry in registry
@RestController
@RequestMapping("/service")
public class HelloService {
	
	private static final Logger logger=LoggerFactory.getLogger(HelloService.class);
	
	@GetMapping("/")
	public String sendResponse() {
		logger.info("In service :");
		return "from service";
	}
    
    
    @GetMapping
    public String welcome() {
    	String port=environment.getProperty("server.port");
         return "Programming Microservice @ "+port +" Appname : "+str;
    }
    
    @GetMapping("/status")
    public String status() {
    	return "Up and Running-->";
    }
    
    
}
