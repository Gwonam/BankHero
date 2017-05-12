import java.util.ArrayList;

public class Bank {
	private ArrayList<BankAccount> accounts;

	public Bank() {

	}

	public int addAccount(String holderName, long idNr) {
		BankAccount addThisAccount;
		if (findHolder(idNr) == null) {
			addThisAccount = new BankAccount(new Customer(holderName, idNr));
		} else {
			addThisAccount = new BankAccount(findHolder(idNr));
		}
		accounts.add(addThisAccount);
		return addThisAccount.getAccountNumber();
	}

	public Customer findHolder(long idNr) {
		for (BankAccount a : accounts) {
			if (a.getHolder().getIdNr() == idNr) {
				return a.getHolder();
			}
		}
		return null;
	}

	public boolean removeAccount(int number) {
		boolean existed;
		BankAccount removeThisAccount = findByNumber(number);

		if (removeThisAccount == null) {
			existed = false;
		} else {
			accounts.remove(removeThisAccount);
			existed = true;
		}
		return existed;
	}

	public ArrayList<BankAccount> getAllAccounts() {
		return accounts;
	}

	public BankAccount findByNumber(int accountNumber) {
		for (BankAccount a : accounts) {
			if (a.getAccountNumber() == accountNumber) {
				return a;
			}
		}
		return null;
	}

	public ArrayList<BankAccount> findAccountsForHolder(long idNr) {

	}

	public ArrayList<Customer> findByPartofName(String namePart) {

	}

}
