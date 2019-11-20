package choktter.unit2;
/**
 * PackageCheck.java
 * October 15, 2019
 * This application prompts the user for the weight of a package and its dimensions which are length, width, and height and then displays an appropriate message if the package does not meet the requirements
 * @author Tenzin Choktter
 * <br>
 */
import java.util.Scanner;
public class PackageCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//this asks the user for weight of the package in kilograms
		System.out.println("Enter the package weight in kilograms");
		int weight = sc.nextInt();

		//this asks the user for length of the package in centimeters
		System.out.println("Enter package length in centimeters");
		int length = sc.nextInt();

		//this asks the user for width of the package in centimeters
		System.out.println("Enter package width in centimeters");
		int width = sc.nextInt();	

		//this asks the user for height of the package in centimeters
		System.out.println("Enter package height in centimeters");
		int height = sc.nextInt();

		//Math calculations to find the volume 
		int volume;
		volume = ( height * width * length);

		//Checks if the package will be accepted 
		if (weight > 27 && volume > 100000 ) {
			System.out.println("Too heavy and too large");
		}
		else if (weight > 27) {
			System.out.println("Too heavy");
		}
		else if (volume > 100000) {
			System.out.println("Too large");	
		}
		else {
			System.out.println("Accepted");
		}
		sc.close();
	}

}
