package programs;
import java.util.Scanner;

/*
Alex Shaw
Intro to Computer Science 
Jan 5, 2018
Description: this program calculates the amount of paint needed to cover the walls of a room
*/
public class Painting
{
		final int  COVERAGE =350;	//paint covers 350sq. feet
		//declare integers length, width, height
		int length, width, height;
		//declare doubles totalSqFt, paintNeeded
		double totalSqFt, paintNeeded;
		Scanner scan = new Scanner(System.in);

		public void input()
		{
			//Prompt for and read in the length of the room
			System.out.println("Please enter the length of the room:");
			length = scan.nextInt();
			scan.nextLine();
			//Prompt for and read in the height of the room
			System.out.println("Please enter the height of the room:");
			height = scan.nextInt();
			scan.nextLine();
			//Prompt for and read in the width of the room
			System.out.println("Please enter the width of the room:");
			width = scan.nextInt();
			scan.nextLine();
		}
		public void calculations()
		{
			//Compute the total square feet of the walls to be painted
			totalSqFt = width*height*2 + length*height*2;
			//Compute the amount of paint needed
			if (totalSqFt%COVERAGE > 0)
			{
				paintNeeded = (int)totalSqFt/COVERAGE+1;
			}
			else 
			{
				paintNeeded = (int)totalSqFt/COVERAGE;
			}
		}
		public void output()
		{
			//Print the length, width, and height of the room and the gallons 
//	       of paint needed.
			System.out.println("You need "+(int)paintNeeded+" gallons to paint your "+length+" by "+width+" by "+height+" room.");
		}
		
		public static void main (String[] args)
		{
			Painting prog = new Painting();
			prog.input();
			prog.calculations();
			prog.output();
		}
}


