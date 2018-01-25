import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String userChoice;
		userChoice = "y";

		do {

			// ask the user to enter the number of slides for a pair of dice
			System.out.println("Welcome to the Grand Circus Casino!");
			System.out.println("How many sides should each die have?");

			int dieSides = scan.nextInt();
			scan.nextLine();

			System.out.println("Roll 1: ");
			System.out.println(rollDie(dieSides));
			
			System.out.println("Roll 2: ");
			System.out.println(rollDie(dieSides));

			// prompt the user to roll the dice
			System.out.println("Roll again? (y/n): ");
			userChoice = scan.nextLine();

		} while (userChoice.equalsIgnoreCase("y"));
		
		System.out.println("Thanks for playing. Goodbye!");
		scan.close();

		// roll two n-sided dice, display the results of each,
		// and then ask the user if/she wants to roll the dice again

	}

	// 5 steps for writing methods
	// 1. visibility modifier: where the method can be seen (Ex. public or private)
	// 2. static or nothing (if not static we need to create an object to use it)
	// 3. return type: should match what you need to return -- if nothing use void
	// 4. method name: should be a verb to show action
	// 5. parameter list: things needed in the method -- can be blank

	public static int rollDie(int numDieSides) {

		int roll;

		roll = (int) (Math.random() * numDieSides + 1);

		return roll;

	}

}
