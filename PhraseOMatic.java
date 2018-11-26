/* 11/26/2018
Inspired from Head First Java, this program will read three strings and piece together three random words into one phrase.
Outline by SoloCode
*/

package tameana;
import java.util.Random;

public class PhraseOMatic {
	
	    public static void main(String[] args) {
	     //first Word List
	     String[] wordList1 = {"Entry-Level", "Intermediate",  "Advanced", "Senior"};
	     
	     //second Word List.
	     String[] wordList2 = {"Java", "JavaScript", "HTML", "SWIFT", "CSS", "Python", "Ruby", "SQL", "C#", "C++", "PHP"};
	     
	     //third Word List.
	     String[] wordList3 = {"Developer", "Programmer", "Influencer", "Challenger", "Instructor", "Learner", "Coder", "Specialist"};
	     
	     //knowing the length of each wordList.
	     int a1 = wordList1.length;
	     int a2 = wordList2.length;
	     int a3 = wordList3.length;
	     
	     //generate the random numbers.
	     int r1 = (int) (Math.random() * a1);
	     int r2 = (int) (Math.random() * a2);
	     int r3 = (int) (Math.random() * a3);
	     
	     //build your catchy.
	     String catchy = wordList1[r1]+" "+wordList2[r2]+" "+wordList3[r3];
	     
	     //print out your catchy.
	     System.out.println("\nYou are a "+catchy+"!");
	     
	     //postscript...
	     System.out.println();
	     System.out.println();
	     System.out.println("by Tameana Naderi");
	    }
	}
