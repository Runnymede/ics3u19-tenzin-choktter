package choktter.unit4;

import java.util.Scanner;

/**
 * IsoTriangle.java
 * December 17, 2019
 * This program asks the user for the size of the triangle and then prints the triangle with that many lines. 
 * @author Tenzin Choktter
 * <br>
 */
public class IsoTriangle {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size");
		int getSize = sc.nextInt();






		drawStars(getSize);
		drawSpace(getSize);
	}

	public static void drawStars(int size) {

		String stars = "*";

		int counter = 0;

		do {

			System.out.print ("*");


			counter ++;

		}while (counter < size);

	}
	public static void drawSpace(int size) {


		int counter = 0;

		do {
			System.out.print(" ");

			counter ++;

		}while (counter < size);                                                           

	}
}

