package choktter.unit3;

import java.util.Scanner;

/**
 * TicTacToe.java
 * November 26, 2019
 * This program is set for two players to play Tic-Tac-Toe 
 * @author Tenzin Choktter
 * <br>
 */
public class TicTacToe {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char [][] tttBoard = new char [3][3];

		int counter = 0;
		do { 
			System.out.println("Enter your move, Row(From 0-2) for O:");
			int rowPlayer1 = scan.nextInt();

			System.out.println("Enter your move, Column(From 0-2) for 0:");
			int colPlayer1 = scan.nextInt();

			tttBoard[rowPlayer1][colPlayer1] = 'O';


			for (int row = 0; row < tttBoard.length; row++) {
				for (int col = 0; col < tttBoard[0].length; col++) {
					System.out.print(tttBoard[row][col] + " | " );

				}
				System.out.println();
				System.out.println("-----------");
			}
			if (tttBoard[0][0] == 'O' && tttBoard[0][1] == 'O' && tttBoard[0][2] == 'O' ) {
				System.out.println ("Player one won");
				break;
			}
			
			
			System.out.println("Enter your move, Row(From 0-2) for X:");
			int rowPlayer2 = scan.nextInt();

			System.out.println("Enter your move, Column(From 0-2)for X:");
			int colPlayer2 = scan.nextInt();
 
			tttBoard[rowPlayer2][colPlayer2] = 'X';
			for (int row = 0; row < tttBoard.length; row++) {
				for (int col = 0; col < tttBoard[0].length; col++) {
					System.out.print(tttBoard[row][col] + " | " );

				}
				System.out.println();
				System.out.println("-----------");
					
			}
			counter ++;
		}while (counter <4);

	}
}
