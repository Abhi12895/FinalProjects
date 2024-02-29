package com.tcs.oops.inheritence;

public class Bond extends InvestmentInstrument{
    
	private String startDate,repayDate;
	
	public Bond() {
		// TODO Auto-generated constructor stub
	}

	public Bond(int iid, String title, String type, double fund,String startDate,String repayDate) {
		super(iid, title, type, fund);
		// TODO Auto-generated constructor stub
		this.startDate=startDate;
		this.repayDate=repayDate;
	}

	@Override
	public String toString() {
		return "Bond [startDate=" + startDate + ", repayDate=" + repayDate + ", getIid()=" + getIid() + ", getTitle()="
				+ getTitle() + ", getType()=" + getType() + ", getFund()=" + getFund() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
}
