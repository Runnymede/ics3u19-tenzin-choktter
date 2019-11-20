package choktter.unit2;
/**
 * DigitsSum.java
 * October 29, 2019
 * This tells the user if the number they entered is prime or not
 * @author Tenzin Choktter
 * <br>
 */
import java.util.Scanner; 
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Asks the user for a number
		System.out.println("Enter a number");
		//These are the variables 
		int number = sc. nextInt();
		int div = 2;
		int answer;

		//This is where the loop begins 
		do {

			answer = number % div;

			if (number == 2) {
				System.out.println("Prime");
			}
			else if (answer == 0) {
				System.out.println ("Not prime");
				break;
			}
			else {
				div ++;
			}

		} while (div < number/2);

		//if statement
		if (answer != 0) {
			System.out.println ("Prime");
		}	
		sc.close();
	}
}
