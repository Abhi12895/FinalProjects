package com.tcs.exceptions;

public class TestFinally {

	public static void main(String[] args) {
		System.out.println("before excepton try/catch/finally");
		try {
		System.out.println(10/2);
		}catch(ArithmeticException e) {
			e.printStackTrace();		
		}
		finally {
			System.out.println("frpm finaly block");
		}
		System.out.println("after excepton try/catch/finally");

	}

}
