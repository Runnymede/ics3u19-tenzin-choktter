package choktter.unit2;
/**
 * LicenseToRide.java
 * This program sums 4 numbers between 0-9 to add up to minimum 34 
 * November 11 , 2019
 * @author Tenzin Choktter
 * <br>
 */
public class LicenseToRide {

	public static void main(String[] args) {
	
		//this are the variables 
		double counter = 0;
		double percent; 
		
		//This where the loop begins 
		for(double a = 9; a >= 0; a--) {

			for(double b = 9; b >= 0; b--) {

				for(double c = 9; c >= 0; c--) {

					for(double d = 9; d >= 0; d--) {

						double answer = a + b + c + d;

						if (answer >= 34) {
							counter ++;	
						}
					}
				}
			}
		}
		percent = counter / 10000 * 100;
		
		//This prints out the answer on the screen
		System.out.println("Out of 10000, you can only get the sum of the 4 numbers over or equal to 34 a " + counter + " times");
		System.out.println( "In total, there is a " + percent +"% chance");
	}
}