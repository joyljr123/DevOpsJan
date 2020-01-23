package accounts;

public class checkingAccount extends bankAccount{

	public checkingAccount() {
		this.setBalance(100);
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		try {
		if(amount > 50) {
			System.out.println("Maximum of $50 one time withdrawal from checking account");
		} else {
			this.setBalance(this.getBalance()-amount);
		}
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		try {
		double newTotal = amount + this.getBalance();
		if(newTotal > 100000) {
			System.out.println("Checking account maximum account balance is $100000");
		} else {
			this.setBalance(newTotal);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
