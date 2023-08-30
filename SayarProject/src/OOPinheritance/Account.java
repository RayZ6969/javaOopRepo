package OOPinheritance;

public class Account {
	String name;
	private double amount;
	protected double withdraw;
	
	protected Account() {
		System.out.println("Constructor without Para");
	}
	
	protected Account(String name) {
		System.out.println("Constructor wiith Para");
		this.name=name;
	}
	
	protected void setAmount(double amount) {
		if (amount>0.0) {
			this.amount=amount;
		}
	}

	protected double getAmount() {
		return this.amount;
	}
}
