public class FixedDeposit extends Account{
	private int tenureYear = 1;
	public FixedDeposit(){}
	public FixedDeposit(int accountNumber, String accountHolderName, double balance, int tenureYear){
		super(accountNumber,accountHolderName,balance);
		this.tenureYear = tenureYear;
	}
	public void showFixedDeposit(){
		System.out.println("-------Fixed Deposit Account Information---------");
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Account Name: "+getAccountHolderName());
		System.out.println("Account Balance: "+getBalance());
		System.out.println("Tenure Year: "+tenureYear);
		System.out.println("-----------------------------------\n");
	}
}