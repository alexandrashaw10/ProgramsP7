package programs;
import java.util.Scanner;

/*
Alex Shaw
Intro to Computer Science 
Dec 11, 2017
Description:
*/
public class MadLib {
	
	String pluralNoun1, pluralNoun2, pluralNoun3, pluralNoun4, pluralNoun5, bodyPart1, 
		bodyPart2, liquid, bodyPartPlural1, bodyPart3, adjective1, adjective2, adjective3, verbIng, noun1, noun2;
	int number1, number2;
	double number3;
	char charMister;
	Scanner scan = new Scanner(System.in);
	
	//this method runs the program and prints the story with the filled in words
	public void runProgram()
	{
		fillBlanks();
		printStory();
	}
	
	//this method asks for input from the user to fill in the blanks in the story.
	public void fillBlanks()
	{
		System.out.println("Welcome to Mad Libs. Please enter a plural noun:");
		pluralNoun1 = scan.nextLine();
		System.out.println("Please enter a plural noun:");
		pluralNoun2 = scan.nextLine();
		System.out.println("Please enter an uppercase letter:");
		charMister = scan.nextLine().charAt(0);
		System.out.println("Please enter a part of the body:");
		bodyPart1 = scan.nextLine();
		System.out.println("Please enter an integer:");
		number1 = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter a plural noun:");
		pluralNoun3 = scan.nextLine();
		System.out.println("Please enter a part of the body:");
		bodyPart2 = scan.nextLine();
		System.out.println("Please enter a type of liquid:");
		liquid = scan.nextLine();
		System.out.println("Please enter an integer:");
		number2 = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter a body part (plural):");
		bodyPartPlural1 = scan.nextLine();
		System.out.println("Please enter a part of the body:");
		bodyPart3 = scan.nextLine();
		System.out.println("Please enter an adjective:");
		adjective1 = scan.nextLine();
		System.out.println("Please enter a plural noun:");
		pluralNoun4 = scan.nextLine();
		System.out.println("Please enter an adjective:");
		adjective2 = scan.nextLine();
		System.out.println("Please enter an adjective:");
		adjective3 = scan.nextLine();
		System.out.println("Please enter a verb ending in \"ing\":");
		verbIng = scan.nextLine();
		System.out.println("Please enter a noun:");
		noun1 = scan.nextLine();
		System.out.println("Please enter a number:");
		number3 = scan.nextDouble();
		scan.nextLine();
		System.out.println("Please enter a plural noun:");
		pluralNoun5 = scan.nextLine();
		System.out.println("Please enter a noun:");
		noun2 = scan.nextLine();
	}
	
	//this method prints the story to the console 
	public void printStory()
	{
		System.out.print("\tGiraffes have aroused the curiosity of " + pluralNoun1 + " since earliest times. \n The giraffe is "
				+ "the tallest of all living " + pluralNoun2 + ", but scientists, like Mr." + charMister +
				", are unable to explain how it got its long " + bodyPart1 + ".\n\n The giraffe's tremendous height, "
				+ "which might reach " + number1 + " " + pluralNoun3 + ", comes from its legs and " + bodyPart2
				+ ".\n If a giraffe wants to take a drink of " + liquid + " from the ground, it has spread its " + number2
				+ " " + bodyPartPlural1);  
		System.out.print(" far apart in order to reach down and lap up the water with its huge " + bodyPart3 
				+ ".\n\n The giraffe has " + adjective1 + " ears that are sensitive to the faintest " + pluralNoun4 +
				",\n and it has a/an " + adjective2 + " sense of smell and sight. When attacked, a giraffe can\n put up a/an "
				+ adjective3 + " fight by " + verbIng + " out with its hind legs and using its head like a sledge "
				+ noun1 + ".\n Finally, a giraffe can gallop at more than " + number3 + " "+ pluralNoun5 + " an hour "
				+ "when pursued and can outrun the fastest " + noun2 + ".");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MadLib prog = new MadLib();
		prog.runProgram();
	}
}

/*
Giraffes have aroused the curiosity of **[plural noun 1] since earliest times. The giraffe is the tallest of all 
living **[plural noun 2], but scientists, like Mr. **[char], are unable to explain how it got its long **[part of the body 1]. The giraffe's
 tremendous height, which might reach **[number1] **[plural noun 3], comes from its legs and **[part of the body 2]. If a giraffe wants
  to take a drink of [type of liquid] from the ground, it has spread its [number2] [part of the body (plural)1] far apart in 
  order to reach down and lap up the water with its huge [part of the body3]. The giraffe has [adj1] ears that are sensitive 
  to the faintest [plural noun 4], and it has a/an [adj2] sense of smell and sight. When attacked, 
  a giraffe can put up a/an [adj3] fight by [verb ending in "ing"1] out with its hind legs and using its head like a sledge [noun1]. 
   Finally, a giraffe can gallop at more than [double (number3)][plural noun5] an hour when pursued and can outrun the fastest 
   [noun2].
*/