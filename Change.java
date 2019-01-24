package javaPractice;
import java.util.Scanner;

public class Change {
	public static void main (String args[]) {
		//Create Scanner for input
		Scanner input = new Scanner(System.in);
		
		//Recieve input for amount
		System.out.print("Enter an amount in the 0.00 format: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		//Convert to dollars
		int numberOfOneDollars = remainingAmount / 100; 
		remainingAmount = remainingAmount % 100;
		
		//Convert to quarters
		int numberOfQuarters = remainingAmount / 25; 
		remainingAmount = remainingAmount % 25;
		
		//Convert to dimes
		int numberOfDimes = remainingAmount / 10; 
		remainingAmount = remainingAmount % 10;
		
		//Convert to nickels
		int numberOfNickels = remainingAmount / 5; 
		remainingAmount = remainingAmount % 5;
		
		int numberOfPennies = remainingAmount;
		
		//Display results
		System.out.println("Your amount " + amount + " consists of :");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");


		
	}

}
