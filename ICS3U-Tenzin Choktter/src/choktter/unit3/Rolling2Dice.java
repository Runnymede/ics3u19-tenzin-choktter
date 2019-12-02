package choktter.unit3;
/**
 * Rolling2Dice.java
 * December 02, 2019
 * This program rolls two six sided dice and adds up the score.  
 * @author Tenzin Choktter
 * <br>
 */
public class Rolling2Dice {

	public static void main(String[] args) {


		int [] dice2 = {1, 2, 3 , 4 , 5, 6}; 


		int counter = 0; 
		int answer1;
	
		
		
		do {
			answer1 = (int) (Math.random() * 6) + 1;

			counter ++;
		
			int counter1 = 0;

			int [] dice1 = {1, 2, 3 , 4 , 5, 6}; 

			if (answer1 == 1) {
				counter1++;	
			}
				
				
				
				System.out.println(counter1);
		
			
		
		}while (counter < 1000); 
	



	}

	}
	
