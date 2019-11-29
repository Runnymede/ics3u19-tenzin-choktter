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

		String [] verses = {"Clap twice", "Fly away", "Run three times", "Say hi four times","Take a nap", "Go out six times", "Play soccer seven times", "Spin eight times", "Eat dinner", "Go to sleep"};

		int counter = 0;
		do {
			System.out.println("If you're happy and you know it" + verses [counter]);

			counter ++;
		}while (counter < 10);


	}

}


