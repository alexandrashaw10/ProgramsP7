package programs;
import java.util.Scanner;
/*
Alex Shaw
Intro to Computer Science 
Jan 31, 2018
Guess Name
Description:
Guesses the name of a person in the room one letter at a time. 
*/
public class GuessName {

	String name = "MAHIKA", starSubFirst, starSubChar, starSubLast, starName = "******", 
			guessLetter, testName = "MAHIKA", fullNameGuess;
	int nameLength = name.length(), firstLetterIndex; 
	Scanner scan = new Scanner(System.in);
	
	public void getGuess() //gets the  guess from the user
	{
		System.out.println("Please enter your guess:");
		guessLetter = scan.nextLine();
		guessLetter = guessLetter.toUpperCase();
		replaceStarLetter();
	}
	
	public void replaceStarLetter() 
	//evaluates the guess letter in the name, replaces * in star name with letter and replaces letter in name with * 
	{
		if(!name.contains(guessLetter)) //name doesn't have the letter
		{
			System.out.println("That letter is not in the name.");
			
		}
		while(name.contains(guessLetter)) // while the letter is still in name
		{
			firstLetterIndex = name.indexOf(guessLetter);
			starSubChar = starName.substring(firstLetterIndex, firstLetterIndex+1);
			starSubChar = starSubChar.replace("*", guessLetter);
			starSubFirst = starName.substring(0, firstLetterIndex);
			if(firstLetterIndex < nameLength) // there are letters after the guessed letter
			{
				starSubLast = starName.substring(firstLetterIndex+1);
				starName = starSubFirst + starSubChar + starSubLast;
			}
			else // no letters after guessed letter
			{
				starName = starSubFirst + starSubChar;
			}
			name = name.replaceFirst(guessLetter,"*");
		}
		System.out.println(starName); 
	}
	
	public void findName() //method that brings the user through the game
	{
		
		System.out.println("I am thinking of the name of a person in this room. "
				+ "Try to guess their name one letter at a time. After three guesses, \nyou will have the opportunity "
				+ "to try to guess the name. Let's begin. The name I am thinking of is: "+ starName);
		getGuess();
		getGuess();
		getGuess();
		if(starName.contains("*")) // if the name still contains letters after 3 guesses
		{
			lastNameGuess();
		}
		else // if name is fully guessed, print good job!
		{
			System.out.println("Good job!");
		}
	}
	
	public void lastNameGuess() // has the user guess the full name and evaluates it
	{
		System.out.println("Who do you think it is? Enter your guess:");
		fullNameGuess = scan.nextLine();
		fullNameGuess = fullNameGuess.toUpperCase();
		if(fullNameGuess.contains(testName)) // if the name is the same
		{
			System.out.println("Correct!");
		}
		else // they guessed wrong
		{
			System.out.println("Sorry, the name I was thinking of was " + testName + ".");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessName prog = new GuessName();
		prog.findName();
	}

}
