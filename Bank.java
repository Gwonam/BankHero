import java.util.ArrayList;

public class Bank {
	private ArrayList<BankAccount> accounts;

	public Bank() {
		accounts = new ArrayList<BankAccount>();
	}

	public int addAccount(String holderName, long idNr) {
		BankAccount addThisAccount;
		if (findHolder(idNr) == null) {
			addThisAccount = new BankAccount(new Customer(holderName, idNr));
		} else {
			addThisAccount = new BankAccount(findHolder(idNr));
		}
		accounts.add(addThisAccount);
		
		for (int i = 0; i < accounts.size() - 1; i++) {
			if (accounts.get(i).getHolder().getName().compareTo(accounts.get(i+1).getHolder().getName()) > 0) {
				accounts.set(i+1, accounts.set(i, accounts.get(i+1)));
				i = 0;
			}
		}
		
		return addThisAccount.getAccountNumber();
	}

	private Customer findHolder(long idNr) {
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
		ArrayList<BankAccount> foundAccounts = new ArrayList<BankAccount>();
		for (BankAccount a : accounts) {
			if (a.getHolder().getIdNr() == idNr) {
				foundAccounts.add(a);
			}
		}
		return foundAccounts;
	}

	public ArrayList<Customer> findByPartOfName(String namePart) {
		ArrayList<Customer> foundCustomers = new ArrayList<Customer>();
		for (BankAccount a : accounts) {
			if (a.getHolder().getName().toLowerCase().contains(namePart.toLowerCase())) {
				foundCustomers.add(a.getHolder());
			}
		}
		return foundCustomers;
	}

}
