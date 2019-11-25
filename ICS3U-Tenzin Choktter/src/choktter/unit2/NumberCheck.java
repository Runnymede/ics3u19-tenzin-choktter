package choktter.unit2;
/** 
 * NumberCheck.java
 * This program is about checking weather a number is positive or negative 
 * October 2,2019
 * @author Tenzin Choktter
 * <br>
 */ 
import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number;
		//this asks the user for a number 
		System.out.println("Type a random number");
		number = sc.nextInt();

		//this will decide weather the number is negative or positive 
		if (number <= 0)
		{
			System.out.println("The number you typed is negative ");
		}
		else 
		{
			System.out.println("The number you typed is poisitive");
		}

		number = number%7;

		//this checks if the number is divisible by 7 
		if (number == 0)
		{
			System.out.println("The number you typed is divisible by 7");
		}
		else 
		{
			System.out.println("The number you typed is not divisible by 7");
		}	
		sc.close();
	}
}


