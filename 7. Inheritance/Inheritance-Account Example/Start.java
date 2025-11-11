import java.lang.*;
public class Start{
	public static void main(String args[]){
		Account a1 = new Account(1111,"Karim",25000);
		a1.showDetails();
		
		Savings s1 = new Savings();
		s1.showSavings();
		
		Savings s2 = new Savings(2222,"Rahim",30000,7.5f);
		s2.showSavings();
		
		s2.deposit(10000);
		s2.withdraw(39000);
		s2.showSavings();
		
		FixedDeposit fd1 = new FixedDeposit(3333,"Kamal",200000,5);
		fd1.showFixedDeposit();
		
		
	}
}