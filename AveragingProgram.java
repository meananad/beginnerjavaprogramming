/* 11/25/2018
This program will allow the user to input 10 grades and get the average of all 10 assignment grades. 
*/

package tameana;
import java.util.Scanner;

class AveragingProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your grades for all 10 assignments:");
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		while (counter < 10) {
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		average = total/10;
		System.out.println("Your average is "+ average);
	}

}
