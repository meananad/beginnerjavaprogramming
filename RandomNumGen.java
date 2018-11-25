/* 11/25/2018
This program will roll dice and output 10 random results ranging from numbers 1 through 6.
*/

package tameana;
import java.util.Random; //import necessary extension

class RandomNumGen {
	public static void main (String[] args) {
		Random dice = new Random();
		int number;
		
		//Utilizing for loop to roll dice ten times then stop.
		for(int counter = 1; counter <=10; counter++) {
			number = 1+dice.nextInt(6);
			
			System.out.println(number + "  ");
		}
	}
}
