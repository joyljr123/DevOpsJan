package accounts;

public abstract class bankAccount {

	private String accountNumber;
	private String firstName;
	private String lastName;
	private short phoneNumber;
	private short ssn;
	private double balance;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}




	public short getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(short phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public short getSsn() {
		return ssn;
	}

	public void setSsn(short ssn) {
		this.ssn = ssn;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount);
	public void checkBalance() {
		System.out.println("Your balance is " + this.getBalance() );
		
	}
	public void print() {
		System.out.println("Account Number: " + this.getAccountNumber());
		System.out.println("Customer Name: " + this.getFirstName() + " " + this.getLastName());
		System.out.println("Balance: " + this.getBalance());
		System.out.println("Phone number: " + this.getPhoneNumber());
	}
}
