package javaPractice;
import java.util.Scanner;

//Write a program that displays the category in BMI a person's weight falls under.
public class BMI {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in); //Create Scanner
		
		System.out.println("This program will calculate the interpretation of your BMI. ");
		System.out.println("Enter your weight in lbs: ");
		double weight = input.nextDouble();
		
		System.out.println("Enter your height in inches (Ex: 5'6 = 66 in): ");
		double height = input.nextDouble();
		
		final double KILO_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		double weightInKilo = weight * KILO_PER_POUND;
		double heightInMeters= height * METERS_PER_INCH;
		
		double bmi = weightInKilo / (heightInMeters * heightInMeters);
		
		System.out.println("Your BMI is " + bmi);
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi < 25) {
			System.out.println("Normal");
		} else if (bmi < 30) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}
	}

}
