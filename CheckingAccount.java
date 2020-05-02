
package src;

public class CheckingAccount extends BankAccount {
static double FEE= 0.15;
	

public CheckingAccount (String name, int initialAmount) {
	
	super (name, initialAmount);
	super.setAccountNumber(super.getAccountNumber()+"-10");
	
	
	
}


//Override method to use withdraw method from super class but also add fee
public boolean withdraw(double amount) {
	

	
	double x=amount +FEE;
	
	boolean complete=super.withdraw(x);
	

	
	return complete;
	
	
	
	
	
}
	
	
	
	
	
	
	
	
}
