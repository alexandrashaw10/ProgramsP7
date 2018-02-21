package programs;
import java.util.*;

/*
Alex Shaw
Intro to Computer Science 
Feb 14, 2018
Description:
How to use Random
*/
public class UsingRandom {

	Random gen =  new Random();
	int testNum;
	double testDouble;
	char testLetter;
	
	public void runRandom()
	{
		gen.setSeed(1); //takes away randomness
		//generate a random number from 1,000-10,000
		testNum = 1000 + gen.nextInt(9001);
		System.out.println("My random number is: " + testNum);
		
		//generate a random test grade
		testDouble = 100*gen.nextDouble();
		System.out.println("The random grade is: " + testDouble);
		
		//generate a random letter
		testLetter = (char)(gen.nextInt(26)+97);
		System.out.println("Your random letter is: " + testLetter);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsingRandom prog = new UsingRandom();
		prog.runRandom();
		
	}

}
