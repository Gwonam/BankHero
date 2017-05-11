import java.util.Scanner;

public class BankApplication {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
		boolean condition = true;
		while (condition) {
			int n = scan.nextInt();
			switch (n) {
			case 1: // hitta konto
				break;

			case 2: // sök kontoinnehavare
				break;

			case 3: // sätt in
				break;

			case 4: // ta ut
				break;

			case 5: // överföring
				break;

			case 6: // skapa konto
				break;

			case 7: // ta bort konto
				break;

			case 8: // skriv ut konton
				break;

			case 9:
				condition = false;
				break;

			}
		}

	}

	static void menu() {
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

}
