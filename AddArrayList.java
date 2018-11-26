/* 11/25/2018
This program will take all array values listed and output the sum.
*/

package tameana;
import java.util.Random;

class RandomNumGen {
	public static void main (String[] args) {
		//array values
		int cabbage[] = {31, 34, 12, 14, 23};
		//start sum at 0
		int sum = 0;
		
		//int counter = 0 to start at 0, counter less than cabbage array, then increment by 1
		for(int counter=0; counter<cabbage.length; counter++) {
			sum+=cabbage[counter];
		}
		
		System.out.println("The sum of these numbers is " + sum);
	}
}
