package choktter.unit3;
/**
 * ClapYourHands.java
 * November 25, 2019
 * This program prints out the lyrics to "if you're happy and know it" with 10 verses
 * @author Tenzin Choktter
 * <br>
 */
public class ClapYourHands {

	public static void main(String[] args) {
		
		//These are the ten different ends of the verse
		String [] verses = {"clap twice", "fly away", "run three times", "say hi four times","take a nap", "go out six times", "play soccer seven times", "spin eight times", "eat dinner", "go to sleep"};
		
		//This the variable for the counter 
		int counter = 0;
		
		//This is a do while loop and it will loop until all the verses are printed
		do {
			System.out.println("If you're happy and you know it " + verses [counter]);

			counter ++;
		} while (counter < 10);
	}

}


