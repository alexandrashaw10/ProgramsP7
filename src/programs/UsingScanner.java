package programs;
import java.util.Scanner;

/*
Alex Shaw
Intro to Computer Science 
Dec 8, 2017
Description:
*/
public class UsingScanner 
{
	String name, subject;
	double grade1, grade2, grade3;
	double average;
	Scanner scan = new Scanner(System.in);
	
	//this runs all the methods in the program
	public void runProgram()
	{
		getInfo();
		calcAverage();
		printResults();
		
	}
	
	public void calcAverage()
	{
		average = (grade1 + grade2 + grade3)/3;
	}
	
	public void printResults()
	{
		System.out.println(name + ", your average for the 3 quizzes is: " + average);
		if(average > 59.5)
		{
			System.out.println("Great job, you passed!");
		}
		else
		{
			System.out.println("You failed.");
		}
	}
	
	//gets the info from the user
	public void getInfo()
	{
		System.out.println("Please enter your name:");
		name = scan.nextLine();
		System.out.println("Hello " + name + ", please enter the class:");
		subject = scan.nextLine();
		System.out.println("Please enter the 1st quiz grade");
		grade1 = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter the 2nd quiz grade");
		grade2 = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter the 3rd quiz grade");
		grade3 = scan.nextInt();
		scan.nextLine();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingScanner prog = new UsingScanner();
		prog.runProgram();
	}

}
