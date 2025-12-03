package mastermind;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Mastermind {

	public static void main(String[] args) {

		System.out.println("welcome to mastermind" + "use four colors");
		Scanner sc = new Scanner(System.in);
//rood, blauw , groen , oranje , zwart , wit , paars, geel
//code kraker
		ArrayList<String> color = new ArrayList<String>();
		color.add("green");
		color.add("blue");
		color.add("red");
		color.add("orange");
		color.add("purple");
		color.add("yellow");
		color.add("black");
		color.add("white");

		// make code

		Random rand = new Random();

		String code1 = color.get(rand.nextInt(6));
		String code2 = color.get(rand.nextInt(6));
		String code3 = color.get(rand.nextInt(6));
		String code4 = color.get(rand.nextInt(6));

		boolean Won = false;
		for (int guess = 10; guess > 0; guess--) {

			System.out.println("you can guess " + guess + " times");
			System.out.println("- green -blue -red -orange -purple -yellow");
			// code Guess

			String[] guesses = new String[4];

			for (int i = 0; i < guesses.length; i++) {
				guesses[i] = sc.next();
			}

			// code check
			String[] checks = { "..", "..", "..", ".." };
			for (int i = 0; i < checks.length; i++) {

			}
			// guess 1
			if (guesses[0].equalsIgnoreCase(code1)) {
				checks[0] = color.get(6);
			} else if (guesses[0].equalsIgnoreCase(code2) || guesses[0].equalsIgnoreCase(code3)
					|| guesses[0].equalsIgnoreCase(code4)) {
				checks[0] = color.get(7);
			}
			// guess 2
			if (guesses[1].equalsIgnoreCase(code2)) {
				checks[1] = color.get(6);
			} else if (guesses[1].equalsIgnoreCase(code1) || guesses[1].equalsIgnoreCase(code3)
					|| guesses[1].equalsIgnoreCase(code4)) {
				checks[1] = color.get(7);
			}
			// guess 3
			if (guesses[2].equalsIgnoreCase(code3)) {
				checks[2] = color.get(6);
			} else if (guesses[2].equalsIgnoreCase(code2) || guesses[2].equalsIgnoreCase(code1)
					|| guesses[2].equalsIgnoreCase(code4)) {
				checks[2] = color.get(7);
			}
			// guess 4
			if (guesses[3].equalsIgnoreCase(code4)) {
				checks[3] = color.get(6);
			} else if (guesses[3].equalsIgnoreCase(code2) || guesses[3].equalsIgnoreCase(code3)
					|| guesses[3].equalsIgnoreCase(code1)) {
				checks[3] = color.get(7);
			}

			System.out.println("check: " + guesses[0] + " " + guesses[1] + " " + guesses[2] + " " + guesses[3] + " : "
					+ checks[0] + " " + checks[1] + " " + checks[2] + " " + checks[3]);

			if (checks[0].equals(color.get(6)) && checks[1].equals(color.get(6)) && checks[2].equals(color.get(6))
					&& checks[3].equals(color.get(6))) {
				System.out.println("you won the mastermind game");
				Won = true;
				guess = 0;
			}

		}
		if (Won == false) {
			System.out.println("You lost");
			sc.close();
		}

	}

}
