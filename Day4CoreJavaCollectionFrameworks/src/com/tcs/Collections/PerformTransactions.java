package com.tcs.Collections;

public class PerformTransactions {

	public static void main(String[] args) {
		InvestmentTransactions it=new InvestmentTransactions();
		
		Investor i1=new Investor(1, "abc", "shares", "chennai", 50000);
		Investor i2=new Investor(2, "xyz", "bonds", "hyd", 75000);
		Investor i3=new Investor(3, "pqr", "deposits", "pune", 80000);
		Investor i4=new Investor(4, "mnp", "shares", "delhi", 4000);
		Investor i5=new Investor(5, "ijk", "bonds", "mumbai", 345678);
		
		it.addid(i1);
		it.addid(i2);
		it.addid(i3);
		it.addid(i4);
		it.addid(i5);
		

		Transaction t1=new Transaction(101, 9, "01-jan-24", 5000);
		Transaction t2=new Transaction(102, 2, "01-jan-24", 5300);
		Transaction t3=new Transaction(103, 3, "01-jan-24", 4000);
		Transaction t4=new Transaction(104, 4, "01-jan-24", 5040);
		Transaction t5=new Transaction(105, 6, "05-jan-24", 5400);
		

		it.addTransaction(t1);
		it.addTransaction(t2);
		it.addTransaction(t3);
		it.addTransaction(t4);
		it.addTransaction(t5);
		
		
		it.showTransactions();
//		System.out.println(it.showGivenTransaction(101));
//		System.out.println(it.showGivenTransaction(105));
		//System.out.println(it.ChangeTransaction(102));

	}

}
