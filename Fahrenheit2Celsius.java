package javaPractice;
import java.util.Scanner;
import java.text.DecimalFormat;

//Write a program that converts Fahrenheit to Celcius
public class Fahrenheit2Celsius {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		
		//Input degree you want to convert
		System.out.println("Enter the number you would like to convert from Fahrenheit to Celcius: ");
		double fahrenheit = input.nextDouble();
		
		//Convert degrees		
		double celsius = ((fahrenheit - 32) * 5.0) / 9.0;
		
		//Format decimals in double output
		DecimalFormat celsiusFormat = new DecimalFormat("#.00");
		System.out.println(celsiusFormat.format(celsius));
		
		System.out.println(fahrenheit + "F is equivalent to " + celsiusFormat.format(celsius) + " degrees Celsius.");
		
	}

}
