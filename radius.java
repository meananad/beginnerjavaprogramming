package prob;
import java.util.Scanner;

public class radius {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in); //Create a Scanner 
		System.out.print("Enter a number for the radius: "); //Prompt user
		double radius = input.nextDouble(); //Get user input for a double (decimal) value
		double area = radius * radius * 3.14159; //Initialize area variable and sign it a value
		
		System.out.println("The area of the circle of radius " + radius + " is " + area); //Bring everything together
	}

}

/* NOTES:
 * 1. Forgot to import Scanner
 * Double for data type because it is usually the default for decimal numbers.
 * To go in and out of a sentence when printing a line, I must use + to connect strings together.
 */
