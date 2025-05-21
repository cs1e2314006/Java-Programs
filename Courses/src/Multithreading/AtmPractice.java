package Multithreading;

class ATM{
	int balance=10000;
	  void checkBalanc(String name) {
		System.out.println("The balance of "+name+" = "+balance);
	}
	 void Withdraw(int amount , String name) {
		balance-=amount;
		System.out.println(name + " is withdrawing "+ amount);
		System.out.println("Remaining balance = "+balance);
	}
}

class Customer extends Thread{
	ATM atm; // it is because there can be only one atm 
	// thats why we need to know the reference of the atm
	int amount;
	String name;
	Customer(int amount ,ATM atm,String name){
		this.amount=amount;
		this.atm=atm;
		this.name =name;
		
	}
	void UseAtm() {
		atm.checkBalanc(name);
		atm.Withdraw(amount, name);
	}
	
	public void run() {
		UseAtm();
	}
	
	
}
public class AtmPractice {

	public static void main(String[] args) {
		ATM atm=new ATM();
		Customer c1=new Customer(1000, atm,"faizan");
		Customer c2=new Customer(10000, atm,"Alice");
		c1.start();
		c2.start();
		

	}
}
