package mastermind;

import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {

		System.out.println("welkom bij mastermind" + "         gebruik vier kleuren");

//rood, blauw , groen , oranje , zwart , wit , paars, geel
//code kraker
		String green = "green";
		String red = "red";
		String yellow = "yellow";
		String blue = "blue";
		String black = "black";
		String white = "white";
		String purple = "purple";
		String orange = "orange";

		// make code
		String code1 = green;
		String code2 = blue;
		String code3 = blue;
		String code4 = orange;

		Scanner sc = new Scanner(System.in);


		boolean Won = false;
		for (int i = 10; i > 0; i--) {
			
			System.out.println("you can geuss " + i + " times");
			
			// code Guess
			String guess1 = sc.next();
			String guess2 = sc.next();
			String guess3 = sc.next();
			String guess4 = sc.next();

			// code check

			String check1 = "... ";
			String check2 = "... ";
			String check3 = "... ";
			String check4 = "... ";

			if (guess1.equalsIgnoreCase(code1)) {
				check1 = black;

			} else if (guess1.equalsIgnoreCase(code2) || guess1.equalsIgnoreCase(code3)
					|| guess1.equalsIgnoreCase(code4)) {
				check1 = white;
			}
			if (guess2.equalsIgnoreCase(code2)) {
				check2 = black;
			} else if (guess1.equalsIgnoreCase(code1) || guess1.equalsIgnoreCase(code3)
					|| guess1.equalsIgnoreCase(code4)) {
				check2 = white;
			}
			if (guess3.equalsIgnoreCase(code3)) {
				check3 = black;
			} else if (guess1.equalsIgnoreCase(code2) || guess1.equalsIgnoreCase(code1)
					|| guess1.equalsIgnoreCase(code4)) {
				check3 = white;
			}
			if (guess4.equalsIgnoreCase(code4)) {
				check4 = black;
			} else if (guess1.equalsIgnoreCase(code2) || guess1.equalsIgnoreCase(code3)
					|| guess1.equalsIgnoreCase(code1)) {
				check4 = white;
			}

			System.out.println("check: " + guess1 + " " + guess2 + " " + guess3 + " " + guess4 + " : " + check1 + " "
					+ check2 + " " + check3 + " " + check4);

			if (check1.equals(black) && check2.equals(black) && check3.equals(black) && check4.equals(black)) {
				System.out.println("you won the mastermind game");
				Won = true;
				i = 0;
			}

		}
		if(Won == false) {
			System.out.println("You lost");
		}

	}

}
