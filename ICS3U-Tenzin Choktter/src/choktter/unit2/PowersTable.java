package choktter.unit2;
/**
 * PowerTable.java
 * This program prints the power table of a number
 * November 11 , 2019
 * @author Tenzin Choktter
 * <br>
 */
public class PowersTable {

	public static void main(String[] args) {
		
		//for loop begins here
		for (int i = 1; i < 7; i++) {	
			
			//This is the nested loop
			for (int s = 1; s < 6 ; s++) {	

				System.out.format("%6s", (int)Math.pow(i, s));
			}
			System.out.println();
		}
	}
}