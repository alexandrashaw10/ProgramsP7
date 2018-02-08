package programs;
import java.util.Scanner;
/*
Alex Shaw
Intro to Computer Science 
Jan 5, 2018
Description:
The program will calculate the number of hours, minutes, and seconds based on a given number of seconds.
*/
public class Seconds {

	int hour, minute, sec, second;
	Scanner scan = new Scanner(System.in);
	
	public void runProg() //this program runs all the methods
	{
		askSeconds();
		calcTime();
		printResult();
	}
	
	public void askSeconds() //this method asks the user to input a number of seconds
	{
		System.out.println("Please enter a number of seconds:");
		sec = scan.nextInt();
		scan.nextLine();
	}
	
	public void calcTime() //this method calculates the time values
	{
		hour = (sec/3600);
		minute = (sec%3600)/60;
		second = sec%60;
	}
	
	public void printResult() //this tells the user the output
	{
		System.out.println("That is "+ hour+" hours, "+minute+" minutes, and "+second+ " seconds.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seconds prog = new Seconds();
		prog.runProg();
	}

}
