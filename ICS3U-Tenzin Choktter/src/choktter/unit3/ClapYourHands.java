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
	
		char [][] tttBoard = new char [3][3];
		
	
		for (int row = 0; row < tttBoard.length; row++) {
			for (int col = 0; col < tttBoard[0].length; col++) {
				System.out.println(tttBoard[row][col]);
			}
			System.out.println();
		}
		

	}

}
