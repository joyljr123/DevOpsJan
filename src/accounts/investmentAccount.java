package accounts;

public class investmentAccount extends bankAccount {

	public investmentAccount() {
		this.setBalance(5000);
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		try {
			if(amount > 1000) {
				System.out.println("Maximum of $1000 one time withdrawal from checking account");
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
