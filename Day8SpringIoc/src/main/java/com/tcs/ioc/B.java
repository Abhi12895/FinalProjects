package com.tcs.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	
     A a;//dependencies in spring not instances
     @Qualifier("a1") //whenever using outwiring we can set which instance need to prefer when byType 
     //has same  .
	 public void setA(A a) {
		 
		 this.a=a;
	 }
     public void other() {
    	 a.method();
     }
     @PostConstruct
     public void start() {
    	 System.out.println(getClass()+"init() method called...");
    	 
     }
     @PreDestroy
     public void terminate() {
    	 System.out.println(getClass()+"destroy() method called...");
     }
}
