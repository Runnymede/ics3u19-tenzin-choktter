package choktter.unit2;
/**
 * StringThings.java
 * October 08, 2019
 * @author Tenzin Choktter
 * <br>
 */
import java.util.Scanner; 
public class StringThings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//This asks the user to input their string
		System.out.println("Enter a string that is at least 8 characters long");
		String character = sc.nextLine();

		//Question Number One, Part a 
		System.out.println("The string you entered is: " + character);
		//Part b
		System.out.println("The string you entered in all uppercase is: " + character.toUpperCase());
		//Part c
		System.out.println("The string you entered in all lowercase is: " + character.toLowerCase());
		//Part d
		System.out.println("The length of the string is: " + character.length());
		//Part e
		System.out.println("The character at index six is: " + character.charAt(6));

		//Bonus 
		System.out.println("Enter index to print the character");
		int index = sc.nextInt();
		System.out.println("The character for the index you typed is: " + character.charAt(index));

		//This asks the user to input their two words for question Number 2
		System.out.println("Enter your first word");
		String firstWord = sc.next();
		System.out.println("Enter your second word");
		String secondWord = sc.next();

		//Part a 
		if (firstWord.equalsIgnoreCase(secondWord))
		{
			System.out.println("Your first word = your second word, which is " + firstWord);
		}
		else 
		{ 
			System.out.println("Your first word doesn't = your second word");
		}

		//Part b
		System.out.println(firstWord + " is your first word and " + secondWord + " is your second word which comes sencond");		

		//Question 3
		System.out.println("Create a unsername");
		String username = sc.next();

		System.out.println("Create a password");
		String password = sc.next();

		//Asks the user for their user name and their password
		System.out.println("Please enter your username");
		String enteredUsername = sc.next();

		System.out.println("Please enter your password");
		String enteredPassword = sc.next();

		//Checks if it matches
		if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
			System.out.println("Welcome" + username);
		}
		else {
			System.out.println("Incorrect username or password.");

		}
		sc.close();
	}

}
