package DisplayPack;

import BankApp.BankImpl;
import BankApp.CurrentAcc;
import BankApp.InvalidAmountException;
import BankApp.JointAcc;
import BankApp.SavingsAcc;

public class TestBank {
	public static void main(String[] args) throws InvalidAmountException {
		System.out.println("This Program is Written by");
		System.out.println("Pradhyumna H P, 4NI19IS061, B Section");
		System.out.println();
		BankImpl b4=new BankImpl();
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		SavingsAcc b1=new SavingsAcc(); 
		b1.setAccId(100);
		b1.setName("chitti");
		b1.setAccBal(6000);
		b4.accBal=6000;
		System.out.println(b1.accId+" "+b1.name+" "+b1.accBal);
		
		
		System.out.println(b4.balance());
		try
		{
			System.out.println(b4.withdraw(100));
		}
		catch (InvalidAmountException e)
		{
			System.out.println("Insufficient Balance");
		}
		System.out.println(b4.deposit(500));
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println();
		CurrentAcc b2=new CurrentAcc();
		b2.setAccId(101);
		b2.setName("chinni");
		b2.setAccBal(1000);
		b4.accBal=1000;
		System.out.println(b2.accId+" "+b2.name+" "+b2.accBal);
		
		System.out.println(b4.balance());
		try
		{
			System.out.println(b4.withdraw(2000));
		}
		catch (InvalidAmountException e)
		{
			System.out.println("Insufficient Balance");
		}
		System.out.println(b4.deposit(2000));
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println();
		JointAcc b3 =new JointAcc();
		b3.setAccId(102);
		b3.setName("scooby");
		b3.setAccBal(5000);
		b4.accBal=5000;
		System.out.println(b3.accId+" "+b3.name+" "+b3.accBal);
		
		System.out.println(b4.balance());
		try
		{
			System.out.println(b4.withdraw(300));
		}
		catch (InvalidAmountException e)
		{
			System.out.println("Insufficient Balance");
		}
		System.out.println(b4.deposit(500));
		

	}
}
