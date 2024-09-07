import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();

		for (int i = 0; i < 9; i++) {
			list1.add("?");

		}
		list1.display();
		System.out.println();
		boolean t = true;
		while (t) {
			Scanner src = new Scanner(System.in);
			System.out.println("Enter your symbol ('X' or 'O'): ");
			String symbol = src.nextLine().toUpperCase();
			System.out.println("Enter the position you want to insert it in (1-9): ");
			int position = src.nextInt();
			list1.change(symbol, position);
			list1.display();
		}
	}

}
