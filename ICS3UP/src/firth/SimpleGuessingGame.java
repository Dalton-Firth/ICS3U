package firth;

/*Dalton Firth
 * Guessing Game
 * Created: 2016/04/28
 * Guesses a letter randomly until the user inputs "y"
 */
import java.util.Scanner;

public class SimpleGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] guesses = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
				'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', };
		String start = null;
		String answer = null;
		boolean correctAnswer = false;
		int randomOutcome = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Hi, Let's play a guessing game, think of the first letter of your last name. Are you ready? (y/n)");

		start = scan.nextLine();

		if (start.equalsIgnoreCase("y")) {
			while (correctAnswer == false) {
				randomOutcome = (int) (Math.random() * 26);
				System.out.println("Does it start with " + guesses[randomOutcome] + " (y/n)");
				answer = scan.nextLine();

				if (answer.equalsIgnoreCase("y")) {
					System.out.println("I win!");
					correctAnswer = true;
				}

			}

		}

	}

}
