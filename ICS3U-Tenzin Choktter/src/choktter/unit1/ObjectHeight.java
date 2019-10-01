package choktter.unit1;
/**
 * ObejectHeight.java
 * September 23,2019
 * @author Tenzin Choktter
 * this program is about the height of an object at any given time dropped from a starting height of 100 meters 
 */
import java.util.Scanner;

public class ObjectHeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a time less than 4.5 seconds");

		double time = sc.nextDouble();
		double height = 100 - 2.9 * time * time;

		System.out.println("The height of the object is " + height + "m");
	} 





}


