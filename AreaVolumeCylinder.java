package javaPractice;
import java.util.Scanner;

//Write a program that displays the area and volume of a cylinder
public class AreaVolumeCylinder {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in); //Create Scanner
		
		System.out.println("Enter the radius of the cylinder: "); //Receive input for radius
		double radius = input.nextDouble();
		
		System.out.println("Enter the length of the cylidner: "); //Receive input for length
		double length = input.nextDouble();
		
		double area = radius * radius * 3.14; //Calculate 
		double volume = area * length;
		
		//Display
		System.out.println("The area of your cylinder is " + area + " and the volume of your cylinder is " + volume );
		
	}

}
