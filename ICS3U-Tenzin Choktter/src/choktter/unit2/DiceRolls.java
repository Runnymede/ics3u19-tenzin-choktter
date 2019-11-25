package choktter.unit2;
/**
 * DiceRolls.java
 * This program randomly rolls two dice and prints the total
 * November 11 , 2019
 * @author Tenzin Choktter
 * <br>
 */
public class DiceRolls {

	public static void main(String[] args) {
		
		//This are the headings for the program
		System.out.format("%6s %6s %6s \n", "Dice 1", "Dice 2", "Total");
		
		//for loop begins here
		for (int i = 1; i < 6; i++) {	
			
			
			int dice1 = (int) (Math.random() * 6);
			int dice2 = (int) (Math.random() * 6);
			int total = dice1 + dice2;
			
			
			System.out.format("%6s %6s %6s", dice1, dice2, total);

			System.out.println();
			}
		
		}

	}


