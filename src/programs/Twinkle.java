package programs;
import java.util.Scanner;
/*
Alex Shaw
Intro to Computer Science 
Jan 26, 2018
Description: This program runs a few applications and usages of strings 
*/
public class Twinkle {

	String littleStar, firstName, lastName, password, firstPart, lastPart, sentence1, consonant, newWord;
	char letter, firstLetter;
	int firstLength, lastLength, senLength, charNum, conLength;
	Scanner scan = new Scanner(System.in);
	

	public void twinklePart1() // creates a string 'twinkle, twinkle...' and changes some of the characters
	{
		littleStar = "twinkle, twinkle little star";
		System.out.println(littleStar);
		littleStar = littleStar.replace('t','c'); 
		littleStar = littleStar.replace('w', 'r');
		System.out.println("All of the t's are now c's and the w's are now r's: " + littleStar);
	}

	public void name() //this program creates a password using your first and last name

	{
		System.out.println("Please enter your first name:"); //gets input from user
		firstName = scan.nextLine();
		System.out.println("Please enter your last name:");
		lastName = scan.nextLine();
		firstLength = firstName.length(); //finds length of name
		lastLength = lastName.length();

		if(firstLength > 3) // first name longer than three
		{
			if (lastLength > 3) //both names longer than three
			{
				firstPart = firstName.substring(0, 3); //gets first and last 3 chars
				lastPart = lastName.substring(lastLength - 3, lastLength);
			}
			else // only first name is longer than three
			{
				firstPart = firstName.substring(0, 3); 
				lastPart = lastName.substring(0, lastLength);
			}
		}
		else //first name is not longer than three
		{
			if(lastLength > 3) //only last name is longer than three
			{
				firstPart = firstName.substring(0, firstLength); 
				lastPart = lastName.substring(lastLength - 3, lastLength);
			}
			else //both names are shorter
			{
				firstPart = firstName.substring(0, firstLength); 
				lastPart = lastName.substring(0, lastLength);
			}
		}
		password = firstPart + lastPart; // creates the password
		password = password.toUpperCase();
		System.out.println("Your password is: " + password);
	}

	public void sentence() //this method gets a sentence from the user and tells the length and a char
	{
		System.out.println("Please enter a full sentence:"); //gets input sentence
		sentence1 = scan.nextLine();
		senLength = sentence1.length();
		
		System.out.println("Your sentence is " + senLength + " characters long."); //prints the length
		System.out.println("Please enter a number less than the length:");
		charNum = scan.nextInt();
		scan.nextLine();

		if(charNum > 0) // if the input number is greater than 1
		{
			letter = sentence1.charAt(charNum - 1);
		}
		else //if the input number is zero
		{
			letter = sentence1.charAt(charNum);
		}
		System.out.println("The character at "+ charNum + " is " + letter + ".");
	}

	public void pigLatin() //this method turns words into pig Latin
	{
		System.out.println("Please input a word that starts with a consonant:");
		consonant = scan.nextLine();

		conLength = consonant.length(); 
		firstLetter = consonant.charAt(0);
		newWord = consonant.substring(1, conLength);
		
		newWord = newWord + firstLetter + "ay";
		newWord = newWord.toLowerCase();
		System.out.println("Your word is \'"+ newWord + "\' in Pig Latin.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twinkle prog = new Twinkle();
		prog.twinklePart1();
		prog.name();
		prog.sentence();
		prog.pigLatin();
	}
}
