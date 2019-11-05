package choktter.unit2;
/**
 * CubesSum.java
 * November 01, 2019
 * @author Tenzin Choktter
 * <br>
 */
import java.util.Scanner; 
public class CubesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Part a
		//Asks the user to print a number 
		System.out.println("Enter a non-negative integer?");
		int integer = sc. nextInt();

		//Variables 
		int number; 
		int mod = 1000;
		int division = 100;
		int counter = 0;
		int sum = 0;
		int cubes = 0;
		
		//This is where the loop begins 
		do { 

			number = integer % mod / division;
			cubes = number * number * number;
			sum = sum + cubes;
			mod = mod / 10;
			division = division/ 10;
			counter = counter + 1;

		}while (counter < 3);
		System.out.println( sum );

		sc.close();
	}

}
