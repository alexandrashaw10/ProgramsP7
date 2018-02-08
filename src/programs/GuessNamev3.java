package programs;
import java.util.Scanner;

/*
Alex Shaww
Intro to Computer Science 
Feb 1, 2018
Description:
This is version three of guess name. Will replace **** with the letters as they are guessed
*/
public class GuessNamev3 {

	int firstPlace, starIndex;
	String name = "EESHA", guessedName = "****", firstLetter;
	Scanner scan = new Scanner(System.in);
	
	public void startGame() //runs code that asks for first guess
	{
		System.out.println("I am thinking of the name of a person in this class: " + guessedName + ". Guess a letter:");
		firstLetter = scan.nextLine();
		firstLetter.toUpperCase();
		if (name.contains(firstLetter) == true)
		{
			//replace '*' char at index of letter with the char at index in name 
			while (name.contains(firstLetter) == true)
			{
				firstPlace = name.indexOf(firstLetter);
				
				guessedName = guessedName.replaceFirst('*', firstLetter);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessNamev3 prog = new GuessNamev3();
		prog.startGame();
	}

}
