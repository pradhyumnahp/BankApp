package BankApp;

public class JointAcc extends Bank implements BankInt{
	public double deposit(double amount) throws InvalidAmountException {
		return accBal=accBal+amount;
	}
	public double withdraw(double amount) throws InvalidAmountException {
		return accBal=accBal-amount;
	}
	public double balance() {
		return accBal;
	}
}
