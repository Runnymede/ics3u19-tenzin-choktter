package choktter.unit2;
/**
 * Investions.java
 * October 29, 2019
 * @author Tenzin Choktter
 * <br>
 */

public class Investion {

	public static void main(String[] args) {

		//Variables 
		double money = 2500;
		int year = 0;

		//This is the loop 
		do {
			money = money * 1.075;
			year = year + 1;

		} while (money < 5000);

		//This tells the user how long it takes the investment to be worth $5000
		System.out.println("It takes " + year + " years for the investment to be worth at least $5,000");

	}
}
