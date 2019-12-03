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



		int [] answer = {0,0,0,0,0,0,0,0,0,0,0};
		int counter = 0; 




		do {
			int dice1 = (int) (Math.random() * 6);
			int dice2= (int) (Math.random() * 6);
			int total = dice1 + dice2;		


			if (total == 2) {
				answer [0] = answer [0] + 1;	
			}

			else if (total == 3) {
				answer [1] = answer [1] + 1;
			}
			
			else if (total == 4) {
				answer [2] = answer [2] + 1;
			}
			else if (total == 5) {
				answer [3] = answer [3] + 1;
			}

			else if (total == 6) {
				answer [4] = answer [4] + 1;
			}
			else if (total == 7) {
				answer [5] = answer [5] + 1;
			}
			else if (total == 8) {
				answer [6] = answer [6] + 1;
			}
			else if (total == 9) {
				answer [7] = answer [7] + 1;
			}
			else if (total == 10) {
				answer [8] = answer [8] + 1;
			}
			else if (total == 11) {
				answer [9] = answer [9] + 1;
			}
			else {
				answer [10] = answer [10] + 1;
			}





			counter ++;
		}while (counter < 10000); 

		System.out.println(answer[0]);
		System.out.println(answer[1]);
		System.out.println(answer[2]);
		System.out.println(answer[3]);
		System.out.println(answer[4]);
		System.out.println(answer[5]);
		System.out.println(answer[6]);
		System.out.println(answer[7]);
		System.out.println(answer[8]);
		System.out.println(answer[9]);
		System.out.println(answer[10]);
		
		







	}

}

