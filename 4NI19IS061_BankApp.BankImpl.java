package BankApp;

public class BankImpl{
	public double accBal;
	public double deposit(double amount)throws InvalidAmountException
	{
		 if(amount<=0)
		 {
			 throw new  InvalidAmountException("Invalid amount<=0");
			 
		 }
		 accBal=accBal+amount;
		 return accBal;
	} 
	public double withdraw(double amount)throws InvalidAmountException
	{
		if(amount<=0)
		 {
			 throw new  InvalidAmountException("Invalid amount<=0");
			 
		 }
		if(accBal< amount) {
			 throw new  InvalidAmountException(amount+"not available");
		}
		accBal=accBal-amount;
		return accBal;
	}
	public double balance()
	{
		return accBal;
	}

}
