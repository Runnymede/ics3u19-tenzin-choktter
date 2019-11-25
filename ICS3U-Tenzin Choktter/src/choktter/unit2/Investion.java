package choktter.unit2;
/**
 * Investions.java
 * October 29, 2019
 * This is an Investment application that calculates how many years it will take for a $2,500 investment to be worth at least $5,000 if compounded annually at 7.5%.
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
