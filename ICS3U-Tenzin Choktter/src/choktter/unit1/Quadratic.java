package choktter.unit1;
/**
 * Digits.java
 * Oct 1, 2019
 * @author Tenzin Choktter 
 * this program is about finding the roots of numbers
 */ 

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value for a");
		int a = sc.nextInt();
		System.out.println("Please enter a value for b");
		int b = sc.nextInt();
		System.out.println("Please enter a value for c");
		int c = sc.nextInt();
		double root1;
		double root2;
		root1 = (- b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a); 
		root2 = (- b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a); 
		System.out.println("The two roots are : " + root1 + ", " + root2);
		
	}

}
