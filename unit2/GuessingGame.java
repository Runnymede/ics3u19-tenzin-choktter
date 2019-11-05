package choktter.unit2;
/**
 * GuessingGame.java
 * October 22, 2019
 * @author Tenzin Choktter
 * <br>
 */
import java.util.Scanner; 
public class GuessingGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//This asks the user for their number  
		System.out.println("Enter a number between 1 and 20");
		int playerNumber = sc.nextInt();

		//This is where the computer generates a random number  
		int computerNumber = (int) (Math.random() * 20) + 1;

		//This displays the player's and computer's number on the screen  
		System.out.println("Computer's Number = " + computerNumber);
		System.out.println("Player's Number = " + playerNumber);

		//This compares the two numbers
		if ( playerNumber == computerNumber) {
			System.out.println("You won!");
		}
		else {
			System.out.println("Better luck next time.");
		}
		sc.close();
	}
}
