package com.tcs.Collections;

public class Transaction extends InvestmentTransactions{
     int tid,investorId;
     String tranDate;
     double tranAmount;
     
     public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(int tid, int investorId, String tranDate, double tranAmount) {
		super();
		this.tid = tid;
		System.out.println(tid);
		boolean flag=check(investorId);
		System.out.println(flag);
	    if(flag) {
		   this.investorId = investorId;
	    }
	    else {
	    	this.investorId=0;
	    }
		this.tranDate = tranDate;
		this.tranAmount = tranAmount;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getInvestorId() {
		return investorId;
	}

	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public double getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(double tranAmount) {
		this.tranAmount = tranAmount;
	}

	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", investorId=" + investorId + ", tranDate=" + tranDate + ", tranAmount="
				+ tranAmount + "]";
	}
     
      
     
}
