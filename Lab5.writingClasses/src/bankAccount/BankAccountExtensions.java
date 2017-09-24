package bankAccount;

import java.text.NumberFormat;

public class BankAccountExtensions {

	public static void main(String[] args) {
			// creating the accounts
		  Account acct1 = new Account ("Donald Trump",20230715, 400);
	      Account acct2 = new Account ("Bill Gates",31558040, 500);
	      Account acct3 = new Account ("Warren Buffet",44003050, 600);
	      Account acct4 = new Account ("Uncle Sam",99999999, 0);
	      
	      	// displaying the accounts
	      System.out.println("BEFORE TAXES");
	      System.out.println (acct1);
	      System.out.println (acct2);
	      System.out.println (acct3);
	      System.out.println (acct4);
	      
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
	
	      
	      //withdrawing with tax and without fees
	      acct1.withdraw(tax1);
	      acct2.withdraw(tax2);
	      acct3.withdraw(tax3);
	      acct4.deposit(acct1.getBalance() + acct2.getBalance() + acct3.getBalance());
	      
	      System.out.println();
	      System.out.println("AFTER TAXES WITHOUT FEES");
	      System.out.println (acct1);
	      System.out.println (acct2);
	      System.out.println (acct3);
	      System.out.println(acct4);
	}

}
