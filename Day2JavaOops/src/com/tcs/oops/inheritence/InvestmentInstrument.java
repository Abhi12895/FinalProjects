package com.tcs.oops.inheritence;

public class InvestmentInstrument {
    
	private int iid;//share,bond,deposit
	private String title,type;
	private double fund;
	
	public InvestmentInstrument() {
		// TODO Auto-generated constructor stub
	}

	public InvestmentInstrument(int iid, String title, String type, double fund) {
		super();
		this.iid = iid;
		this.title = title;
		this.type = type;
		this.fund = fund;
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getFund() {
		return fund;
	}

	public void setFund(double fund) {
		this.fund = fund;
	}

	@Override
	public String toString() {
		return "InvestmentInstrument [iid=" + iid + ", title=" + title + ", type=" + type + ", fund=" + fund + "]";
	}
	
	
}
