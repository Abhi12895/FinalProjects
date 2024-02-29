package com.tcs.inheritence2;

public class CardTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card=null;
		card =new HDFCVisaDebitCard(12345678,919,4536,"03/25","John Doe",500000);
		card.swipe(15000);
		card =new ICICIMasterCreditCard(32323232, 999, 4545, "02/27", "Jane Doe", 200000);
		card.swipe(1234);
		
		
		/*HDFCVisaDebitCard hdfc =new HDFCVisaDebitCard(12345678,919,4536,"03/25","John Doe",500000);//static binding
		
		System.out.println(hdfc);
		
		
		ICICIMasterCreditCard icici = new ICICIMasterCreditCard(32323232, 999, 4545, "02/27", "Jane Doe", 200000);
		
		hdfc.swipe(10000);
		icici.swipe(2300);
		
		Card card =new HDFCVisaDebitCard(12345678,919,4536,"03/25","John Doe",500000);//dynamic binding
		card.swipe(764456);
		
		card =new ICICIMasterCreditCard(32323232, 999, 4545, "02/27", "Jane Doe", 200000);
		card.swipe(98766);*/
		

	}

}
