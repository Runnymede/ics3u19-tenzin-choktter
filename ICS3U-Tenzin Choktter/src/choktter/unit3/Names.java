package choktter.unit3;
/**
 * Names.java
 * November 22, 2019
 * This program outputs the list of name twice, first in the order it was input, and then in reverse
 * @author Tenzin Choktter
 * <br>
 */
import java.util.Scanner; 
public class Names {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("How many names do you want?");
		int numberName = scan.nextInt();

		String[] names = new String[numberName];

		System.out.println("Enter the names ones by one");

		for (int i = 0; i < numberName; i++) {
			names[i] = scan.next();	 
		}
		for (int i = 0; i < numberName; i++) {
			System.out.println(names[i]);	 
		}
		for (int i = numberName-1; i >= 0; i--) {
			System.out.println(names[i]);	
		}
		scan.close();
	}
}