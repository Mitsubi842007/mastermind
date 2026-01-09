package mastermind;

import java.util.Random;
import java.util.Scanner;

public class Helper {
Scanner sc = new Scanner(System.in);
	String[] colors = { "green", "blue", "red", "orange", "purple", "yellow" };

	public String[] createCode() {
		// my random with name
		Random rand = new Random();
		// make code
		String codes[] = new String[4];

		for (int i = 0; i < 4; i++) {
			int randomNumber = rand.nextInt(6);
			String randomColor = colors[randomNumber];
			codes[i] = randomColor;
		}
		return codes;
	}

	public String[] guessCode() {
		String[] guesses = new String[4];
		for (int i = 0; i < guesses.length; i++) {
			guesses[i] = sc.next();
		}
		return guesses;

	}

}
