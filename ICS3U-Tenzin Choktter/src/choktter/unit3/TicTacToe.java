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

		//This is the do while loop so the program runs until a player wins  
		int counter = 0;
		do { 
			//This asks player one to enter their moves by the row and then the column 
			System.out.println("Enter your move, Row(From 0-2) for O:");
			int rowPlayer1 = scan.nextInt();

			System.out.println("Enter your move, Column(From 0-2) for 0:");
			int colPlayer1 = scan.nextInt();

			tttBoard[rowPlayer1][colPlayer1] = 'O';

			//This is a nested for loop that prints out the table for the TTT program  
			for (int row = 0; row < tttBoard.length; row++) {
				for (int col = 0; col < tttBoard[0].length; col++) {
					System.out.print(tttBoard[row][col] + " | " );

				}
				System.out.println();
				System.out.println("-----------");
			}

			//This is an if statement that checks if player one wins 
			if (tttBoard[0][0] == 'O' && tttBoard[0][1] == 'O' && tttBoard[0][2] == 'O' ||  tttBoard[0][0] == 'O' && tttBoard[1][0] == 'O' && tttBoard[2][0] == 'O' ||  tttBoard[2][0] == 'O' && tttBoard[2][1] == 'O' && tttBoard[2][2] == 'O' ||  tttBoard[1][0] == 'O' && tttBoard[1][1] == 'O' && tttBoard[1][2] == 'O' ||  tttBoard[0][1] == 'O' && tttBoard[1][1] == 'O' && tttBoard[2][1] == 'O' ||  tttBoard[0][2] == 'O' && tttBoard[1][2] == 'O' && tttBoard[2][2] == 'O'||  tttBoard[0][0] == 'O' && tttBoard[1][1] == 'O' && tttBoard[2][2] == 'O'||  tttBoard[0][2] == 'O' && tttBoard[1][1] == 'O' && tttBoard[2][0] == 'O') {
				System.out.println ("Player one won");
				break;
			}

			//This asks player two to enter their moves by the row and then the column
			System.out.println("Enter your move, Row(From 0-2) for X:");
			int rowPlayer2 = scan.nextInt();

			System.out.println("Enter your move, Column(From 0-2)for X:");
			int colPlayer2 = scan.nextInt();

			//This is a nested for loop that prints out the table for the TTT program
			tttBoard[rowPlayer2][colPlayer2] = 'X';
			for (int row = 0; row < tttBoard.length; row++) {
				for (int col = 0; col < tttBoard[0].length; col++) {
					System.out.print(tttBoard[row][col] + " | " );

				}
				System.out.println();
				System.out.println("-----------");		
			}
			//This is an if statement that checks if player two wins 
			if (tttBoard[0][0] == 'X' && tttBoard[0][1] == 'X' && tttBoard[0][2] == 'X' ||  tttBoard[0][0] == 'X' && tttBoard[1][0] == 'X' && tttBoard[2][0] == 'X' ||  tttBoard[2][0] == 'X' && tttBoard[2][1] == 'X' && tttBoard[2][2] == 'X' ||  tttBoard[1][0] == 'X' && tttBoard[1][1] == 'X' && tttBoard[1][2] == 'X' ||  tttBoard[0][1] == 'X' && tttBoard[1][1] == 'X' && tttBoard[2][1] == 'X' ||  tttBoard[0][2] == 'X' && tttBoard[1][2] == 'X' && tttBoard[2][2] == 'X'||  tttBoard[0][0] == 'X' && tttBoard[1][1] == 'X' && tttBoard[2][2] == 'X'||  tttBoard[0][2] == 'X' && tttBoard[1][1] == 'X' && tttBoard[2][0] == 'X') {
				System.out.println ("Player two won");
				break;
			}
			counter ++;
		}while (counter <4);

		scan.close();
	}
}
