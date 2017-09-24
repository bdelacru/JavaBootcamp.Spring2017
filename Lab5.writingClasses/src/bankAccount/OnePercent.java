package bankAccount;

import java.text.NumberFormat;

public class OnePercent {

	public static void main(String[] args) {
			// creating the accounts
		  Account acct1 = new Account ("Donald Trump",20230715, 400);
	      Account acct2 = new Account ("Bill Gates",31558040, 500);
	      Account acct3 = new Account ("Warren Buffet",44003050, 600);
	      Account acct4 = new Account ("Uncle Sam",99999999,0);
	     // Account acct5 = new Account ("Uncle Sam",99999999);
	      	// displaying the accounts
	      System.out.println("BEFORE TAXES");
	      System.out.println (acct1);
	      System.out.println (acct2);
	      System.out.println (acct3);
	      System.out.println (acct4);
	      //System.out.println (acct5); 
	      // adding all the accounts balances
	      double sum =  acct1.getBalance() + acct2.getBalance() +  acct3.getBalance()+ acct4.getBalance();
	      NumberFormat fmt1 = NumberFormat.getCurrencyInstance(); // setting up the format dollar
	      System.out.println();
	      System.out.println("Total amount of money in the bank: " + fmt1.format(sum) ); // display of the sum of the accounts
	      System.out.println();
	      
	      // The process of "taxing" the accounts
	      double tax1= acct1.getBalance() * 0.15;
	      double tax2= acct2.getBalance() * 0.15;
	      double tax3= acct3.getBalance() * 0.15;
	     /* // withdrawing with tax and fee
	      acct1.withdraw(tax1, 2.50);
	      acct2.withdraw(tax2, 2.50);
	      acct3.withdraw(tax3, 2.50);
	      acct4.deposit(acct1.getBalance() + acct2.getBalance() + acct3.getBalance());*/
	    //withdrawing with tax and without fees
	      acct1.withdraw(tax1);
	      acct2.withdraw(tax2);
	      acct3.withdraw(tax3);
	      acct4.deposit(acct1.getBalance() + acct2.getBalance() + acct3.getBalance());
	    
	    
	     /* System.out.println(" Tax of account 1 is: " + tax1);
	      System.out.println("Withdraw with fee on account 1 is: " + acct1.getBalance());
	      System.out.println(" Sam now makes: " + acct4.getBalance());*/
	      
	      //System.out.println("AFTER TAXES WITH FEES");
	      System.out.println("AFTER TAXES WITHOUT FEES");
	      System.out.println (acct1);
	      System.out.println (acct2);
	      System.out.println (acct3);
	      System.out.println(acct4);
	      
	      //adding interests
	      System.out.println();
	      System.out.println("INTERESTS");
	      acct1.addInterest(0.015);
	      acct2.addInterest(0.015);
	      acct3.addInterest(0.015);
	      acct4.addInterest(0.015);
	      System.out.println (acct1);
	      System.out.println (acct2);
	      System.out.println (acct3);
	      System.out.println(acct4);
	}

}
