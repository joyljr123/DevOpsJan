package accounts;

public class savingAccount extends bankAccount {

	public savingAccount() {
		this.setBalance(500);
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		try {
			if(amount > 5000) {
				System.out.println("Maximum of $5000 one time withdrawal from checking account");
			} else {
				this.setBalance(this.getBalance()-amount);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deposit(double amount) {
		try {
			// TODO Auto-generated method stub
			double newTotal = amount + this.getBalance();
			if(newTotal > 1000000) {
				System.out.println("Checking account maximum account balance is $1000000");
			} else {
				this.setBalance(newTotal);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
