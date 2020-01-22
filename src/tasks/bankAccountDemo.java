package tasks;

import java.util.Scanner;

public class bankAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankAccount ba = new bankAccount();
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
			System.out.println("Account Balance is: " + ba.balance);
			break;
			
		case 2:
			System.out.println("How much do you wanna deposit");
			sc = new Scanner(System.in);
			ba.setBalance(ba.balance+sc.nextDouble());
			System.out.println("Below is the updated information about the bank account");
			ba.print();
			break;
		
		case 3:
			System.out.println("How much do you wanna withdraw");
			sc = new Scanner(System.in);
			double newBalance = ba.balance - sc.nextDouble();
			if(newBalance < 0) {
				System.out.println("You don't have that much of money to withdraw");
			} else {
			ba.setBalance(newBalance);
			System.out.println("Below is the updated information about the bank account");
			ba.print();
			}
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
