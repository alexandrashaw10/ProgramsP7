package programs;
import java.util.*;

/*
Alex Shaw
Intro to Computer Science 
Feb 21, 2018
CashRegister
Description:
Compute the sales price, tax, and amount of change for an item
*/
public class CashRegister {
	
	int cents100, discPercent;
	double ogPrice, randPercent, tax, discAmount, salePrice, totPrice;
	String name, a;
	Scanner scan = new Scanner(System.in);
	Random gen = new Random();
	
	public void computePercent() { //gets input and generates percent
		System.out.println("Please enter the name of the item you would like to price out:");
		name = scan.nextLine();
		System.out.println("Please enter the original price:");
		ogPrice = scan.nextDouble();
		scan.nextLine();
		
		randPercent = 0.05 *(1 + gen.nextInt(15));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
