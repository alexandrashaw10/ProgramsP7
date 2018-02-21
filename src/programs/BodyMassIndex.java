package programs;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
Alex Shaw
Intro to Computer Science 
Feb 20, 2018
BodyMassIndex
Description:
Calculates your BMI and classifies it.
*/
public class BodyMassIndex {
	
	double height, weight, i, bmi, heightPow;
	String a = "";
	Scanner scan = new Scanner(System.in);
	DecimalFormat dec1 = new DecimalFormat("0.0");
	
	public void calcBMI() { //this gets the users height and weight and calcs their BMI
		System.out.println("Please enter your weight in pounds:"); //get weight
		weight = scan.nextDouble();
		scan.nextLine();
		System.out.println("Please enter your height in inches:");
		height = scan.nextDouble();
		scan.nextLine();
		
		heightPow = Math.pow(height, 2); //calc BMI
		bmi = weight*703/heightPow;
		System.out.println("Your BMI is "+ dec1.format(bmi));
	}
	
	public void classifyBMI() { //this classifies the user's BMI
		if(bmi < 30) { //not obese
			if(bmi < 25) { //not overweight
				if(bmi < 18.5) { //underweight
					System.out.println("You are underweight.");
				}
				else{ //normal weight
					System.out.println("You are normal weight.");
				}
			}
			else{ //overweight
				System.out.println("You are overweight.");
			}
		}
		else{ //obese
			System.out.println("You are obese.");
		}
	}
	
	public void repeatBMI() { //repeats again until you stop
		while(!a.contains("stop")) { //user didnt type stop
			a = "";
			calcBMI();
			classifyBMI();
			System.out.println("Type \'stop\' to end. Hit any other key to compute another BMI.");
			a = scan.nextLine();
			a = a.toLowerCase();
		}
	}
	
	public static void main(String[] args){
		BodyMassIndex prog = new BodyMassIndex();
		prog.repeatBMI();
	}
}
