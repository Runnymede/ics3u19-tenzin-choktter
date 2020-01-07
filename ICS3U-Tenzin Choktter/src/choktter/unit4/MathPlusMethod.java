package choktter.unit4;

/**
 * Methods.java
 * December 17, 2019
 * This program is for the practice 
 * @author Tenzin Choktter
 * <br>
 */

public class MathPlusMethod {

	public static void main(String[] args) {
		int a[] = new int [5];
		a[0] = 6;
		a[1] = 7;
		a[2] = 3;
		a[3] = 21;
		a[4] = 67;

		System.out.println(min(a));
		System.out.println(max(a));	
		System.out.println(sum(a));
	}
	//min
	public static int min (int num []) {
		int min = num[0];
		int index = 0;

		for(int i = 1; i < num.length; i++) {
			if (num[i] < min) {
				min = num [1];
				index = i; 
			}	
		}
		return index; 
	}
	//max
	public static int max (int num []) {
		int max = num[0];
		int index = 0;

		for(int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				max = num [1];
				index = i; 
			}	
		}
		return index; 
	}
	//sum
	public static int sum (int num []) {
		int sum = num[0];

		for(int i = 1; i < num.length; i++) {
			sum = num[0] + num[1] + num[2] + num[3] + num[4];	
			}
		return sum;
	}

	//average 
	
}








