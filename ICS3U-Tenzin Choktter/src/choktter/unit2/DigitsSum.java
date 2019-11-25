package choktter.unit2;
/**
 * DigitsSum.java
 * October 29, 2019
 * this application prompts the user for a non-negative integer and then displays the sum of the digits.
 * @author Tenzin Choktter
 * <br>
 */
import java.util.Scanner; 
public class DigitsSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Asks the user to enter a number 
		System.out.println("Enter a non-negative integer?");
		int integer = sc. nextInt();

		//These are the variables 
		int number; 
		int mod = 1000;
		int division = 100;
		int counter = 0;
		int sum = 0;

		//This is where the loop begins
		do { 

			number = integer % mod / division;
			sum = sum + number;
			mod = mod / 10;
			division = division/ 10;
			counter = counter + 1;

		}while (counter < 3);
		System.out.println( sum );

		sc.close();
	}

}
