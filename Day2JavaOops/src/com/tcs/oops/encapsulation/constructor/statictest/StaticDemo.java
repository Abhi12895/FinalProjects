package com.tcs.oops.encapsulation.constructor.statictest;

public class StaticDemo {
	
	{
		System.out.println("non-static anonymus block");
	}
	static {
		System.out.println("static anonymus block");
	}
	
     int data;//instance variable
     static int item;
     
     void method() {
    	 data=10;
    	 item=30;
     }
     static void operation() {
    	 //data=10;
    	 item=30;
    	 
     }
}
