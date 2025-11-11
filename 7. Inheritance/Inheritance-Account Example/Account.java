import java.lang.*;
public class Account{
	private int accountNumber;
	private String accountHolderName;
	protected double balance;
	
	public Account(){		
		System.out.println("Empty Account");
		this.accountNumber= 0;
		this.accountHolderName = "No name Set";
		this.balance= 0.0;
	}
	public Account(int accountNumber, String accountHolderName, double balance){
		System.out.println("Parameterized Account");
		setAccountNumber(accountNumber);
		setAccountHolderName(accountHolderName);
		setBalance(balance);
	}

	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}
	
	public String getAccountHolderName(){
		return accountHolderName;
	}
	
	public void setBalance(double balance){
		if(balance>=0){
			this.balance = balance;
		}
	}
	public double getBalance(){
		return balance;
	}
	
	public void showDetails(){
		System.out.println("-------Account Information---------");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Name: "+accountHolderName);
		System.out.println("Account Balance: "+balance);
		System.out.println("-----------------------------------\n");
	}
	
}