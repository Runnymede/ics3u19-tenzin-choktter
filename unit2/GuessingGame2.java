package choktter.unit2;
/**
 * GuessingGame.java
 * October 28, 2019
 * @author Tenzin Choktter
 * <br>
 */
import java.util.Scanner; 
public class GuessingGame2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = 1;
		//This asks the user for their number  
		do {
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
				System.out.println("Try again");
			}
		} while (loop == 1);

		sc.close();

	}

}
