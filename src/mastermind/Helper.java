package mastermind;

import java.util.Random;
import java.util.Scanner;

public class Helper {
	Scanner sc = new Scanner(System.in);
	String[] colors = { "green", "blue", "red", "orange", "purple", "yellow", "black", "white" };

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

	{

	}

	public boolean wonCode(String[] checks, String[] guessCode) {
		
		
		System.out.println("check: " + guessCode[0] + "  " + guessCode[1] + "  " + guessCode[2] + "  "
				+ guessCode[3] + " : " + checks[0] + "  " + checks[1] + "  " + checks[2] + "  " + checks[3]);

		// checks if all colors are black
		if (checks[0].equals(colors[6]) && checks[1].equals(colors[6]) && checks[2].equals(colors[6])
				&& checks[3].equals(colors[6])) {
			return true;
		}
		return false;
	}

}