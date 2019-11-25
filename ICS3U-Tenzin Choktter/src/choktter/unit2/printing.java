package choktter.unit2;
/**
 * printing.java 
 * this program is for printing application that prompts the user for the number of copies to print and then displays the price per copy and the total price for the job 
 * @author Tenzin Choktter 
 * October 3, 2019
 * <br>
 */
import java.util.Scanner; 

public class printing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// This asks the user for the number of copies they want 
		System.out.println("Enter the number of compies to be printed");

		//Variables 
		int amount = sc.nextInt(); 
		double price;

		// This tell program the price for each copy depending on the amount of copies they want 
		if (amount < 100) {
			price = 0.30;
		}
		else if (amount < 500) {
			price = 0.28;		
		}
		else if (amount < 750) {
			price = 0.27;	
		}
		else if (amount <= 1000) {
			price = 0.26;
		}
		else {
			price = 0.25;
		}
		System.out.println("Price per copy is:" + price);

		// this is where the program perform math
		System.out.println("Total cost is :"  + price * amount);

		sc.close();
	}
}

