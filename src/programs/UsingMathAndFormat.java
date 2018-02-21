package programs;
import java.text.DecimalFormat;

/*
Alex Shaw
Intro to Computer Science 
Feb 16, 2018
Description:
How to use Math and format.
*/
public class UsingMathAndFormat {

	double num;
	DecimalFormat dec4 = new DecimalFormat("0.00##"); //always get two zeros, sometimes get for
	DecimalFormat currency = new DecimalFormat("$0.00");
	DecimalFormat percent = new DecimalFormat("0.0%");
	
	public void usingMath()
	{
		num = 10 + Math.random()*40;
		System.out.println("Your number is: " + num);
		System.out.println("The square of your number is: " + Math.pow(num, 2));
		System.out.println("The square root of your number is: " + Math.sqrt(num));
	}
	
	public void usingFormat()
	{
		num = Math.random();
		System.out.println("Your number is: " + num);
		System.out.println("Your number with 4 decimals: " + dec4.format(num));
		System.out.println("Your number as currency:" + currency.format(num));
		System.out.println("Your number as a percent: " + percent.format(num));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingMathAndFormat prog = new UsingMathAndFormat();
		prog.usingFormat(); 
	}

}
