package LabNumber6;
import java.util.Scanner;
import java.util.Random;

public class LabNumber6 {	
	public static void main(String[] args) {  // main method
		String contin = "yes";
		
		while(contin.equalsIgnoreCase("yes")) { // run the program while the condition yes is true
		System.out.println("Welcome to the Grand Circus Casino!"); // Greeting to user
		System.out.println();  // blank line
		System.out.println("Please enter the number of sides of your pair of dice: "); // Prompt for user input of number of sides of die
		
		Scanner sc = new Scanner(System.in); // scanner for user input
		int numSides = sc.nextInt(); // declared and initialized variable for the number of sides the user chooses for his/her die
		int die1 = diceRoll(numSides); // result of roll of die 1
		int die2 = diceRoll(numSides); // result of roll of die 2
				
		System.out.println(); // blank line
		System.out.println("The die are rolling."); // letting the user know that the calculations for the "rolling" of their "virtual" die is in process
				
		System.out.println(); // blank line
		System.out.printf("%5s", "The results of your roll are:"); // formatting for the table showing results of the roll of the die
		
		System.out.println(); // blank line
		System.out.println(diceRoll(die1)); // Function for calculating the result of the roll of die1
		System.out.println(diceRoll(die2)); // Function for calculating the result of the roll of die2
		
		System.out.println(); // blank line
		System.out.println("Would you like to roll again? (yes/no)"); // prompt to get user to enter yes or no to either continue or discontinue entering data
		
		contin = sc.next(); // continue if user inputs yes
		System.out.println();
		
	}
		
	}

	private static int diceRoll(int numSides) { // method
		Random randGen = new Random();  // new random number generator
		numSides = randGen.nextInt(numSides) +1; // function to produce random numbers based on the number of sides user input for their die 
				
		return numSides; 
			
	}
	

}
