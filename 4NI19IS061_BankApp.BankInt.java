package BankApp;

public interface BankInt {
	public double deposit(double amount)throws InvalidAmountException;
	public double withdraw(double amount)throws InvalidAmountException;
	public double balance();

}
