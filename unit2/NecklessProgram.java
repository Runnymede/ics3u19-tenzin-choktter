package choktter.unit2;
/**
 * NecklessProgram.java
 * November 07, 2019
 * This application prompts the user for two single-digit integers and then displays the sequence and the number of steps taken.
 * @author Tenzin Choktter
 * <br>
 */
import java.util.Scanner; 
public class NecklessProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//this asks the user for their 2 numbers 
		System.out.println("Please enter your two positive numbers");
		//these are the variables 
		int firstNum = sc. nextInt();
		int secondNum = sc. nextInt();
		
		int num1 = firstNum;
		int num2 = secondNum;

		//this is where the loop begins
		do {
			int thirdNum = (num1 + num2) % 10;
			System.out.println(thirdNum);
			
			num1 = num2;
			num2 = thirdNum;

		} while (num1 != firstNum || num2 != secondNum);
		
		sc.close();
	}
}