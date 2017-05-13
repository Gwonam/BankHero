import java.util.Scanner;

public class BankApplication { 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bank bank = new Bank();
		createSomeUsers(bank);
		boolean condition = true;
		while (condition) {
			menu();
			int n = scan.nextInt();
			switch (n) {
			case 1: // hitta konto
				System.out.println("val: 1");
				long l1 = scan.nextLong();
				System.out.println(bank.findAccountsForHolder(l1));
				break;

			case 2: // sök kontoinnehavare
				System.out.println("val: 2");
				scan.nextLine();
				String s2 = scan.nextLine();
				System.out.println(bank.findByPartOfName(s2));
				break;

			case 3: // sätt in
				System.out.println("val: 3");
				int i3 = scan.nextInt();
				BankAccount a3 = bank.findByNumber(i3);
				if (a3 == null) {
					System.out.println("Kontot existerar inte.");
					break;
				}
				double in = scan.nextDouble();
				a3.deposit(in);
				break;

			case 4: // ta ut
				System.out.println("val: 4");
				int i4 = scan.nextInt();
				BankAccount a4 = bank.findByNumber(i4);
				if (a4 == null) {
					System.out.println("Kontot existerar inte.");
					break;
				}
				double out = scan.nextDouble();
				if (a4.getAmount() >= out) {
					a4.withdraw(out);
				}
				else {
					System.out.println("Det finns inte tillräckligt mycket pengar på kontot. Inga pengar har tagits ut.");
				}
				break;

			case 5: // överföring
				System.out.println("val: 5");
				int i5 = scan.nextInt();
				BankAccount a5 = bank.findByNumber(i5);
				if (a5 == null) {
					System.out.println("Kontot existerar inte.");
					break;
				}
				i5 = scan.nextInt();
				BankAccount A5 = bank.findByNumber(i5);
				if (A5 == null) {
					System.out.println("Kontot existerar inte.");
					break;
				}
				double trade = scan.nextDouble();
				if (a5.getAmount() >= trade) {
					a5.withdraw(trade);
					A5.deposit(trade);
				}
				else {
					System.out.println("Det finns inte tillräckligt mycket pengar på kontot. Inga pengar har tagits ut.");
				}
				break;

			case 6: // skapa konto
				System.out.println("val: 6");
				scan.nextLine();
				String c6 = scan.nextLine();
				//scan.nextLine();
				long l6 = scan.nextLong();
				bank.addAccount(c6, l6);
				break;

			case 7: // ta bort konto
				System.out.println("val: 7");
				int l7 = scan.nextInt();
				bank.removeAccount(l7);
				break;

			case 8: // skriv ut konton
				System.out.println("val: 8");
				for (BankAccount a : bank.getAllAccounts()) {
					System.out.println(a);
				}
				break;

			case 9: // avsluta
				System.out.println("val: 9");
				condition = false;
				break;

			}
		}

	}

	private static void menu() {
		System.out.println("1. Hitta konto utifrån innehavare");
		System.out.println("2. Sök kontoinnehavare utifrån (del av) namn");
		System.out.println("3. Sätt in");
		System.out.println("4. Ta ut");
		System.out.println("5. Överföring");
		System.out.println("6. Skapa konto");
		System.out.println("7. Ta bort konto");
		System.out.println("8. Skriv ut konton");
		System.out.println("9. Avsluta");

	}
	
	private static void createSomeUsers(Bank bank) {
		bank.addAccount("Person Ett", 123456);
		bank.addAccount("Arvid Åkerblom", 911111111);
		bank.addAccount("Douglas Algotsson", 1111111111);
		
	}

}