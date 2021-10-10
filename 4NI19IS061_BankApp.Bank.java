package BankApp;

public class Bank {
	public int accId;
	public String name;
	public double accBal;
	public Bank()
	{
		name=null;
		accId=0;
		accBal=0;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId() {
		accId=0;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getName() {
		return name;
	} 
	public void setName(String name) { 
		this.name = name;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	public String toString() {
		return "Bank [accId=" + accId + ", name=" + name + ", accBal=" + accBal + "]";
	}
}