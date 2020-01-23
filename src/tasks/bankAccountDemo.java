package tasks;
import accounts.bankAccount;
import accounts.checkingAccount;
import accounts.investmentAccount;
import accounts.savingAccount;

import java.util.Scanner;

public class bankAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankAccount ca = new checkingAccount();
		bankAccount sa = new savingAccount();
		bankAccount ia = new investmentAccount();
		
		typeOfAcc(ca, sa, ia);
	}
	private static void typeOfAcc(bankAccount ca, bankAccount sa, bankAccount ia) {
		boolean l = true;
		while(l) {
		System.out.println("\nwhich type of account ");
		System.out.println("1. Checking");
		System.out.println("2. Savings");
		System.out.println("3. Investment");
		System.out.println("4. Exit");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			userOptions(ca);
		case 2:
			userOptions(sa);
		case 3:
			userOptions(ia);
		
		case 4:
			l = false;			
			sc.close();
			System.out.println("Thank you");
			break;
		default:
			System.out.println("Pleas input 1 - 4");
			
		}
	}
	}
	private static void userOptions(bankAccount ba) {
		boolean l = true;
		while(l) {
		System.out.println("\nwhich option you want to choose");
		System.out.println("1. Show Account Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Account Balance is: " + ba.getBalance());
			break;
			
		case 2:
			System.out.println("How much do you wanna deposit");
			sc = new Scanner(System.in);
			double amount = sc.nextDouble();
			ba.deposit(amount);
			System.out.println("Below is the updated information about the bank account");
			ba.print();
			break;
		
		case 3:
			System.out.println("How much do you wanna withdraw");
			sc = new Scanner(System.in);
			ba.withdraw(sc.nextDouble());
			System.out.println("Below is the updated information about the bank account");

			ba.print();
			break;
			
		case 4:
			l=false;
			sc.close();
			System.out.println("Thank you");
			break;
		default:
			System.out.println("Pleas input 1 - 4");
		}
		}
	}

}
