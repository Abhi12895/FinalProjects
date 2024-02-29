package com.tcs.oops.encapsulation.constructor.statictest;

public class CreateInvestors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Investor i1=new Investor();
	    //System.out.println(i1);
		System.out.println(Investor.getCount());
	    Investor i1=new Investor(101,"John Doe","Anna Salai,Chennai",200000);
	    System.out.println(i1.getCount());

	    Investor i2=new Investor(102,"Jone Doe","Anna Salai,Chennai",764356);
	    System.out.println(i2.getCount());
	    
	    Investor i3=new Investor(103,"Jason Doe","Tnagar Chennai",2500);
	    System.out.println(i3.getCount());
	    
	    boolean res=i1.equals(i2);
	    System.out.println(res);
	    System.out.println(i1.equals(i2));
	    i1.setCount(345);
	    System.out.println(i3.getCount());
	}

}
