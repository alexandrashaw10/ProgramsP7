package programs;
import java.util.*;
/*
Alex Shaw
Intro to Computer Science 
Feb 16, 2018
Description:
Random output based on user input of range
*/
public class RandomRange {

	int lowNum, topNum, randNum, i = 0;
	String a = "";
	Scanner scan = new Scanner(System.in);
	Random gen = new Random();
	
	public void getBounds()	{ //this method gets the bounds from the user and checks if they are valid
		System.out.println("Please enter a number for the bottom of the range:");
		lowNum = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter a number for the top of the range:");
		topNum = scan.nextInt();
		scan.nextLine();
		while (topNum <= lowNum) { //checks if valid
			System.out.println("Error. Please enter an integer higher than the low bound you entered.");
			topNum = scan.nextInt();
			scan.nextLine();
		}
	}
	
	public void genRandom() { //generates a random int in the range
		randNum = lowNum + gen.nextInt((topNum - lowNum)+1);
		System.out.println("A random number in that range is: " + randNum);
	}
	
	public void repeatRandom() { //runs again unitl user ends it
		while(!a.contains("stop")){ //user didnt type stop
			a = "";
			getBounds();
			genRandom();
			System.out.println("Type \'stop\' to end. Hit any other key to generate another number.");
			a = scan.nextLine();
			a = a.toLowerCase();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomRange prog = new RandomRange();
		prog.repeatRandom();
	}

}
