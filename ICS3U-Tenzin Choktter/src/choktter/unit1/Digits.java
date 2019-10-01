package choktter.unit1;
/**
 * Digits.java
 * Sept 30, 2019
 * @author Tenzin Choktter 
 * this program is about separating numbers in hundreds, tens, and ones  
 */
import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three-digit number");
		int number = sc.nextInt();
		int hundreds;
		int tens;
		int ones;
		hundreds = number/100;
		tens = number%100/10;
		ones = number%10;
		System.out.println("hundreds = " + hundreds);
		System.out.println("tens = " + tens);
		System.out.println("ones = " + ones);


	}

}
