package programs;
import java.util.Scanner;
/*
Alex Shaw
Intro to Computer Science 
Jan 23, 2018
Description:
*/
public class usingStrings {

	String phrase = "Change is inevitable";
	String mutation1, mutation2, mutation3, mutation4;
	Scanner scan = new Scanner(System.in);
	char oldChar, newChar;
	
	public void runMutations()
	{
		System.out.println("The original string is **" + phrase + "**");
		
		
		mutation1 = phrase.concat(", except from vending machines.");
		System.out.println(mutation1);
		
		mutation2 = mutation1.toUpperCase();
		System.out.println(mutation2);
		
		System.out.println("Please enter a character to replace:");
		oldChar = scan.nextLine().charAt(0);
		System.out.println("Please enter a new charater:");
		newChar = scan.nextLine().charAt(0);
		
		mutation3 = mutation2.replace(oldChar, newChar); //case sensitive
		System.out.println(mutation3);
		
		mutation4 = mutation3.substring(10,20); //inclusive to start, exclusive to end (have to add one)
		System.out.println(mutation4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingStrings prog = new usingStrings();
		prog.runMutations();
	}

}
