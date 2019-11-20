package choktter.unit2;
/**
 * CountVowels.java
 * This application prompts the user for a string and then displays a count of the number of vowel in the string
 * November 18, 2019
 * @author Tenzin Choktter
 * <br>
 */
import java.util.Scanner; 
public class CountVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//This is asks the user to enter a text for the program 
		System.out.println("Enter text");
		String word = sc.nextLine();
		int counter = 0;

		//This is where the for loop begins 
		for(int i = 0; i < word.length(); i ++) {

			if (word.charAt(i) == 'a') {
				counter ++;	
			}

			if (word.charAt(i) == 'e') {
				counter ++;
			}

			if (word.charAt(i) == 'o') {
				counter ++;
			}

			if (word.charAt(i) == 'u') {
				counter ++;
			}

			if (word.charAt(i) == 'i') {
				counter ++;
			}

			if (word.charAt(i) == 'A') {
				counter ++;	
			}

			if (word.charAt(i) == 'E') {
				counter ++;
			}

			if (word.charAt(i) == 'O') {
				counter ++;
			}

			if (word.charAt(i) == 'U') {
				counter ++;
			}

			if (word.charAt(i) == 'I') {
				counter ++;
			} 


		}	
		//This prints the number of vowels there are in their text
		System.out.println("The number of vowels in " + word + " is " + counter);
		sc.close();
	}
}