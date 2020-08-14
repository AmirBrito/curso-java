package entities;

public class Account {
	
	private int accountNumber;
	private String accountOwner;
	private double accountValue;
	
	public Account(int accountNumber, String accountOwner) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
	}

	public Account(int accountNumber, String accountOwner, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		deposit(initialDeposit);
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getAccountValue() {
		return accountValue;
	}
	
	public void withdraw(double withdrawValue) {
		accountValue -= withdrawValue + 5.0;
	}
	
	public void deposit(double depositValue) {
		accountValue += depositValue;
	}

	public String toString() {
		return "Account number: " + accountNumber + " Account Owner: " + accountOwner + " Account Value: " + accountValue;
	}
	
	

}
