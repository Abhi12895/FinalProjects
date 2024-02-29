package com.tcs.inheritence2;

//debit card credit and other cards
public abstract class Card {
     private int cardNo,cvv,pin;
     private String expiry,name;
     private double amount;//avail balance or limit
    
     
     
     public Card() {
		// TODO Auto-generated constructor stub
	 }

	public Card(int cardNo, int cvv, int pin, String expiry, String name, double amount) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.pin = pin;
		this.expiry = expiry;
		this.name = name;
		this.amount = amount;
	}

    

	public int getCardNo() {
		return cardNo;
	}



	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}



	public int getCvv() {
		return cvv;
	}



	public void setCvv(int cvv) {
		this.cvv = cvv;
	}



	public int getPin() {
		return pin;
	}



	public void setPin(int pin) {
		this.pin = pin;
	}



	public String getExpiry() {
		return expiry;
	}



	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", cvv=" + cvv + ", pin=" + pin + ", expiry=" + expiry + ", name=" + name
				+ ", amount=" + amount + "]";
	}
     
    public abstract boolean swipe(double transactionAmount) ;
     
     
}
