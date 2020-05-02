package src;
public class SavingsAccount extends BankAccount {

	double rate= .025;
	int savingsNumber=0;
	private String accountNumber;
	
	public SavingsAccount() {
		
		accountNumber=(super.getAccountNumber()+"-"+savingsNumber++);
		
		
	}
	
	public SavingsAccount(String name, double initialBalance) {
		super(name, initialBalance);
		accountNumber=(super.getAccountNumber()+"-"+savingsNumber++);
		
		
		
	}
	
	public void postInterest() {
		double interest= rate*super.getBalance();
		super.deposit(1.88);
		
		
	}
	
	public String getAccountNumber() {
		
		
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount original, double initialBalance)
	{
		super(original, initialBalance);
		savingsNumber=original.savingsNumber+1;
		accountNumber= super.getAccountNumber()+"-"+savingsNumber;
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
