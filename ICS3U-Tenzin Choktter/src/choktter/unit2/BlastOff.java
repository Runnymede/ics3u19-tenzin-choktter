package choktter.unit2;
/**
 * BlastOff.java
 * This program Counts down from 10 to 1
 * November 11 , 2019
 * @author Tenzin Choktter
 * <br>
 */
public class BlastOff {

	public static void main(String[] args) 

	//This slows down the program by 1 second each time it prints on the screen
			throws InterruptedException {

		//This loop counts down from 10-1
		for (int i = 10; i > 0; i--) {
			System.out.println(i);	
			Thread.sleep(1000);
		}
		//This prints "blast off" at the end 
		System.out.println("Blast Off");

	}
}