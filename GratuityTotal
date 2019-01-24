package javaPractice;
import java.util.Scanner;
import java.text.DecimalFormat;

//Write a program that reads the subtotal and the gratuity rate , then computes the gratuity and total
public class GratuityTotal {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in); //Create Scanner
		
		System.out.println("Enter the subtotal and gratuity rate: "); //Recieve subtotal and gratuity rate from Scanner
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		double gratuityTotal = (gratuityRate * subtotal) / 100; //Calculate gratuity total and total bill
		double total = gratuityTotal + subtotal;

		DecimalFormat totalBill = new DecimalFormat("##.##"); //Format display of money
		
		System.out.println("Your total, including gratuity, is $" + totalBill.format(total) + ".");
		
		
	}

}
