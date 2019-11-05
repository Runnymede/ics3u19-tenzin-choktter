package choktter.unit2;
/**
 * CarRecall.java
 * October 28, 2019
 * @author Tenzin Choktter 
 * this program is about CarRecall application that prompts a customer for the model number of their car to find out if it is defective
 * <br>
 */ 
import java.util.Scanner; 
public class CarRecall2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	

		////This asks the user for their model number to check whether their car needs to be repaired
		System.out.println("Enter the car's model number or 0 to quit:");
		int modelNumber = sc. nextInt();

		//variables 
		String defective; 

		//Checks if the car is defected depending on their model number 
		while (modelNumber != 0) 
		{

			switch (modelNumber) {

			case 199: defective = "Your car is defective. It must be repaired."; 
			break;
			case 179: defective = "Your car is defective. It must be repaired."; 
			break;
			case 189: defective = "Your car is defective. It must be repaired."; 
			break;
			case 190: defective = "Your car is defective. It must be repaired."; 
			break;
			case 191: defective = "Your car is defective. It must be repaired."; 
			break;
			case 192: defective = "Your car is defective. It must be repaired."; 
			break;
			case 193: defective = "Your car is defective. It must be repaired."; 
			break;
			case 194: defective = "Your car is defective. It must be repaired."; 
			break;
			case 195: defective = "Your car is defective. It must be repaired."; 
			break;
			case 221: defective = "Your car is defective. It must be repaired."; 
			break;
			case 780: defective = "Your car is defective. It must be repaired."; 
			break;
			default: defective = "Your car is not defective.";
			break;
			}	


			System.out.println(defective);

			System.out.println("Enter the car's model number or 0 to quit:");
			modelNumber = sc.nextInt();
		}	sc.close();
	}
}






