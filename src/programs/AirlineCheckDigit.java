package programs;
import java.util.Scanner;
/*
Alex Shaw
Intro to Computer Science 
Jan 9, 2018
Description: This program generates the check digit of an airline ticket.
*/
public class AirlineCheckDigit {
	
	Scanner scan = new Scanner(System.in);
	int ticketNum, checkDigit;
	
	public void getNumber() //this method gets the input from the user
	{
		System.out.println("Please enter your ticket number:");
		ticketNum = scan.nextInt();
		scan.nextLine();
	}
	
	public void calcCheckDigit() //this method calculates the check digit
	{
		checkDigit = ticketNum%7;
	}
	
	public void outputDigit() //this method prints the digit
	{
		System.out.println("The check digit is "+checkDigit+".");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirlineCheckDigit prog = new AirlineCheckDigit();
		prog.getNumber();
		prog.calcCheckDigit();
		prog.outputDigit();
	}

}
