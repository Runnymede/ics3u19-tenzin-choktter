package choktter.unit2;
/**
 * DigitsDisplay.java
 * October 29, 2019
 * This is an application that prompts the user for a non-negative integer and then displays each digit on a separate line.
 * @author Tenzin Choktter
 * <br>
 */
import java.util.Scanner; 
public class DigitsDisplay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//This asks the user to print a number 
		System.out.println("Please print a non-negative integer ");
		int digits = sc.nextInt();

		//These are the variables
		int number; 
		int mod = 1000;
		int division = 100;
		int counter = 0;

		//This is where the loop begins 
		do { 
			number = digits % mod / division;
			System.out.println (number);
			mod = mod / 10;
			division = division/ 10;
			counter = counter + 1;

		}while (counter < 3);
		sc.close();

	}

}
