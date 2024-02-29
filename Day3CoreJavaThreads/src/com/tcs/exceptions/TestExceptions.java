package com.tcs.exceptions;

import java.io.*;

public class TestExceptions {
	
	//if we use throws keyword then that method should be in try- catch to handle exception
	//throws is like caution for exception
	public static Exception method(RuntimeException r)throws Exception{
		if(r==null)throw new Exception("Exception thrown..");
	    return new RuntimeException("returning without exception");
	}

	public static void main(String[] args) {
		//an exception is an object
		//objects are created at runtime
		//an exception occurs only at runtime
		//when it occurs the program stops abruptly if it is not handled
		try {
			Exception e=method(null);
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Exception e=method(new RuntimeException());
			System.out.println(e.getMessage());
		} 
		catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(RuntimeException e) {
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Throwable t) {
			t.getMessage();
		}
		finally {
			
		}
		
		/*try {
			FileInputStream fis=new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println(e.toString());
		}
        System.out.println("after division");*/
	}

}
