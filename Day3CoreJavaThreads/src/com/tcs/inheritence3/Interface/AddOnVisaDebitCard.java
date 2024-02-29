package com.tcs.inheritence3.Interface;

public class AddOnVisaDebitCard extends Card{
         
	    @Override
        public boolean swipe(double transactionAmount) {
        	System.out.println("transaction complete");
        	return true;
        }

		public AddOnVisaDebitCard() {
			super();
			// TODO Auto-generated constructor stub
		}

		public AddOnVisaDebitCard(int cardNo, int cvv, int pin, String expiry, String name, double amount) {
			super(cardNo, cvv, pin, expiry, name, amount);
			// TODO Auto-generated constructor stub
		}
}
