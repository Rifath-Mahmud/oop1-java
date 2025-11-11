public class Savings extends Account{
	private float interestRate;
	public Savings(){
		super();
		System.out.println("E-Constructor of Savings");
	}
	public Savings(int accountNumber, String accountHolderName, double balance, float interestRate){
		super(accountNumber,accountHolderName,balance);//constructor call of parent/super class
		System.out.println("P-Constructor of Savings");
		this.interestRate = interestRate;
	}
	
	public void setInterestRate(float interestRate){
		if(interestRate>=0){
			this.interestRate = interestRate;
		}
		else{
			System.out.println("Invalid interestRate");
		}
	}
	
	public float getInterestRate(){
		return interestRate;
	}
	
		public void deposit(double amount){
		if(amount>0){
			balance += amount;
		}
	}
	
	public void withdraw(double amount){
		if(balance-500>=amount){
			balance -= amount;
			System.out.println("Successfully WithDrawn : "+amount);
		}
		else{
			System.out.println("Not Enough Balance or Invalid Amount");
		}
	}
	
	public void showSavings(){
		//showDetails();
		System.out.println("-------Account Information---------");
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Account Name: "+getAccountHolderName());
		System.out.println("Account Balance: "+getBalance());
		System.out.println("Interest Rate: "+interestRate);
		System.out.println("-----------------------------------\n");
	}
	
}