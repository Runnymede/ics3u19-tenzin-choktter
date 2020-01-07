package choktter.unit4;
/**
 * Methods.java
 * December 17, 2019
 * This program converts temperature
 * @author Tenzin Choktter
 * <br>
 */
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("What is the temperature?");
		int temp = sc.nextInt();
		
		System.out.println("What do you want to covert to? Enter 1 for fahrenheit and 2 for celsius");
		int convert = sc.nextInt();
 
		int conversion;
		
		if (convert == 1) {
			conversion = temp * 9 / 5 + 32;
		}
		else {
			conversion = (temp - 32) * 5 / 9;
		}
	System.out.println(conversion);
	
	}

}
