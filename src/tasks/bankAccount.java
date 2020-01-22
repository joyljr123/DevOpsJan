package tasks;

public class bankAccount {
	int accountNumber = 123456789;
	double balance = 50.0;
	String customerName = "John";
	String email = "zslrljr0523@gmai.com";
	String phone = "5102895398";
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void deposit(double num) {
		this.balance += num;
	}
	public void withdraw(double num) {
		this.balance -= num;
	}
	public void print() {
		System.out.println("Customer name: " + this.customerName);
		System.out.println("Balance: " + this.balance);
		System.out.println("Email: " + this.email);
		System.out.println("Phone number: " + this.phone);
	}
}
