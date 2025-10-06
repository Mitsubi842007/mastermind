package mastermind;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name; // string//
		Scanner sc = new Scanner(System.in);
		// scanner openen
		System.out.println("Enter a password:");
		name = sc.next();
		// gebruikers eerste commando

		if (name.equals("Moe")) {
			System.out.println("You are the king of rock and roll!" + "(access)");
		} else {
			System.out.println("You are not the king !" + " (access denied)");
		}

		sc.close();
//scanner sluiten 
	}

}
