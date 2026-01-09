package mastermind;

import java.util.*;

public class Mastermind {

	public static void main(String[] args) {

		System.out.println("welcome to mastermind" + " " + "use four colors");
		Scanner sc = new Scanner(System.in);
//red, blue , green , orange, purple, yellow
//code kraker's kleuren om te gebruiken

		ArrayList<String> color = new ArrayList<String>();
		color.add("green");
		color.add("blue");
		color.add("red");
		color.add("orange");
		color.add("purple");
		color.add("yellow");
		color.add("black");
		color.add("white");
		Helper helper = new Helper();
		// make code
		String codes[] = helper.createCode();

		// if u lost a round then it loses a round from the amount of rounds u have to
		// guess and then u have to try it again.
		boolean Won = false;
		for (int guess = 10; guess > 0; guess--) {

			System.out.println("you can guess " + guess + " times");

			// code Guess

			String[] guessCode = helper.guessCode(); // = new String[4];
//
//			for (int i = 0; i < guessCode.length; i++) {
//				guessCode[i] = sc.next();
//			}

			// code check
			String[] checks = { "...", "...", "...", "..." };
			for (int i = 0; i < checks.length; i++) {

			}
			// guess 1
			if (guessCode[0].equalsIgnoreCase(codes[0])) {	
				checks[0] = color.get(6);
			} else if (guessCode[0].equalsIgnoreCase(codes[1]) || guessCode[0].equalsIgnoreCase(codes[2])
					|| guessCode[0].equalsIgnoreCase(codes[3])) {
				checks[0] = color.get(7);
			}
			// guess 2
			if (guessCode[1].equalsIgnoreCase(codes[1])) {
				checks[1] = color.get(6);
			} else if (guessCode[1].equalsIgnoreCase(codes[0]) || guessCode[1].equalsIgnoreCase(codes[2])
					|| guessCode[1].equalsIgnoreCase(codes[3])) {
				checks[1] = color.get(7);
			}
			// guess 3
			if (guessCode[2].equalsIgnoreCase(codes[2])) {
				checks[2] = color.get(6);
			} else if (guessCode[2].equalsIgnoreCase(codes[1]) || guessCode[2].equalsIgnoreCase(codes[0])
					|| guessCode[2].equalsIgnoreCase(codes[3])) {
				checks[2] = color.get(7);
			}
			// guess 4
			if (guessCode[3].equalsIgnoreCase(codes[3])) {
				checks[3] = color.get(6);
			} else if (guessCode[3].equalsIgnoreCase(codes[1]) || guessCode[3].equalsIgnoreCase(codes[2])
					|| guessCode[3].equalsIgnoreCase(codes[0])) {
				checks[3] = color.get(7);
			}

			System.out.println("check: " + guessCode[0] + "  " + guessCode[1] + "  " + guessCode[2] + "  "
					+ guessCode[3] + " : " + checks[0] + "  " + checks[1] + "  " + checks[2] + "  " + checks[3]);

			// checks if all colors are black
			if (checks[0].equals(color.get(6)) && checks[1].equals(color.get(6)) && checks[2].equals(color.get(6))
					&& checks[3].equals(color.get(6))) {
				// if u won Mastermind then it says this and it closes the scanner automatically
				// same at lost
				System.out.println("you won the mastermind game");
				Won = true;
				guess = 0;
			}

		}
		// if u lost Mastermind then it says "you lost" and then it closes the scanner
		// if all rounds all gone (10x)
		if (Won == false) {
			System.out.println("You lost");
			// your code will be shown when u lost or win
			System.out.println(codes[0] + " " + codes[1] + " " + codes[2] + " " + codes[3]);
		}
		sc.close();

	}

}
