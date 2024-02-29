package com.tcs.oops;

public class CreateInvestors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Investor i1=new Investor();
		i1.id=101;
		i1.name="John Doe";
		i1.address="Tambaram,chennai";
		i1.amount=200000;
		System.out.println(i1);
		String str=(i1.getClass().getName()+ '@'+ Integer.toHexString(i1.hashCode()));
		System.out.println(str);
	}

}
