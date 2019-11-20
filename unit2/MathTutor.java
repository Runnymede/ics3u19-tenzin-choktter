package choktter.unit2;
/**
 * StringThings.java
 * October 08, 2019
 * This application displays math problems by randomly generating two numbers, 1 through 10, and randomly generating an operator (+, -, *, /), and then prompts the user for an answer. 
 * @author Tenzin Choktter
 * <br>
 */
import java.util.Scanner; 
public class MathTutor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//This is where the computer generates random numbers
		int firstNumber = (int) (Math.random() * 10) + 1;
		int secondNumber = (int) (Math.random() * 10) + 1;

		//Depending on the number produced, it will be used to generate random operators  
		int operator = (int) (Math.random() * 4) + 1;

		//If statement is being used to find random operators, asking questions to the user, and also checking whether the answer is right or wrong 
		if (operator == 1) {
			System.out.println("What is " + firstNumber + " + " + secondNumber + "?");
			int addition = firstNumber + secondNumber;
			int additionAnswer = sc.nextInt();

			if (additionAnswer == addition) {
				System.out.println("Correct!");
			}
			else {
				System.out.println("Wrong!");
			}
		}
		else if (operator == 2) {
			System.out.println("What is " + firstNumber + " - " + secondNumber + "?");
			int substraction = firstNumber - secondNumber;
			int substractionAnswer = sc.nextInt();

			if (substractionAnswer == substraction) {
				System.out.println("Correct!");
			}
			else {
				System.out.println("Wrong!");
			}	
		}
		else if (operator == 3) {
			System.out.println("What is " + firstNumber + " * " + secondNumber + "?");
			int multiplication = firstNumber * secondNumber;
			int multiplicationAnswer = sc.nextInt();

			if (multiplicationAnswer == multiplication) {
				System.out.println("Correct!");
			}
			else {
				System.out.println("Wrong!");
			}
		}
		else {
			System.out.println("What is " + firstNumber + " / " + secondNumber + "?");
			double division = firstNumber / secondNumber;
			int divisionAnswer = sc.nextInt();

			if (divisionAnswer == division) {
				System.out.println("Correct!");
			}
			else {
				System.out.println("Wrong!");
			}
			sc.close();
		}
	}

}
