package programs;
import java.util.Scanner;

/*
Alex Shaw
Intro to Computer Science 
Jan 10, 2018
Description: This program generates the check digit for a credit card number using the LUHN algorithm.
*/
public class LuhnCheckDigit {

	long origCardNum, digit, cardNum2;
	int i = 1, numDigits, nRemain, digitSum, checkDigit;
	String cardNum1;
	Scanner scan = new Scanner(System.in);
	
	public void runProg()
	{
		getCardNum();
		findNumLength();
		calcCheckDigit();
		printResult();
	}
	
	public void getCardNum() //this method gets the card number from the user
	{
		System.out.println("Please enter the credit card number:");
		origCardNum = scan.nextLong();
		scan.nextLine();
	}
	
	public void findNumLength() //this method calculates the length of the card number entered
	{
		cardNum1 = "" + origCardNum;
		numDigits = cardNum1.length();
	}
	
	public void calcCheckDigit() //this method calculates the check digit
	{
		cardNum2 = origCardNum;
		nRemain = numDigits % 2;
		while(i <= numDigits) //while the digit number is less than or equal to the total number of digits, add the digits
		{
			digit = cardNum2 % 10;
			cardNum2 /= 10;
			System.out.println(digit);
			if (i % 2 == nRemain) //if it is on an odd value of i (every other), perform algorithm 
			{
			digit *=2;
				if (digit > 9) //if the digit is greater than 9, subtract 9
				{
					digit -= 9;
				}
			}
			digitSum += digit;	
			i ++;
		}
		checkDigit = 10 - digitSum%10;
	}
	
	public void printResult() //this method prints the output
	{
		System.out.println("The check digit for your card is " + checkDigit + ".");
	}
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		LuhnCheckDigit prog = new LuhnCheckDigit();
		prog.runProg();
	}

}
