package com.tcs.Collections;

import java.util.*;

public class InvestmentTransactions {

	ArrayList<Transaction> transactions =new ArrayList<>();
	ArrayList<Investor> inv =new ArrayList<>();
	public boolean  addTransaction(Transaction t) {
		boolean flag=transactions.add(t);
		return flag;
	}
	public boolean addid(Investor o) {
		boolean flag=inv.add(o);
		return flag;
	}
	public void showTransactions() {
		//System.out.println(transactions);
		
	    for(Transaction t:transactions) {
	    	
	    	      System.out.println(t);
	    }
		
	/*	Iterator<Investor> iter =inv.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}*/
		
	}
	public boolean check(int id) {
		System.out.println(id);
		for(Investor t:inv) {
			if(t.getId() == id) {
	    	    return true;
			}
	    }
		return false;
	}
	
	public Transaction showGivenTransaction(int transactionId) {
		for(Transaction t:transactions) {
			if(t.getTid()==transactionId)
	    	   return t;
	    }
		return null;
	}
	
	public Transaction ChangeTransaction(int transactionId) {
		
		for(Transaction t:transactions) {
			if(t.getTid()==transactionId) {
	    	   t.setTranAmount(10000);
	    	   System.out.println("Succesfully updated");
	    	   return t;
			}
	    }
		return null;
	}
}
