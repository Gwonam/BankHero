
public class BankAccount {

	private double balance;
	private Customer holder;
	private static int accountNrCount = 1000;
	private int accountNr;

	public BankAccount(String holderName, long holderId) {
		holder = new Customer(holderName, holderId);
		balance = 0;
		accountNrCount++;
		accountNr = accountNrCount;

	}

	public BankAccount(Customer holder) {
		this.holder = holder;
		balance = 0;
		accountNrCount++;
		accountNr = accountNrCount;

	}

	public Customer getHolder() {
		return holder;
	}

	public int getAccountNumber() {
		return accountNr;
	}

	public double getAmount() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public String toString() {
		return ("konto " + accountNr + " (" + holder + ") : " + balance);
	}

}