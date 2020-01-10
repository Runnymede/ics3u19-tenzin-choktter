package choktter.unit4;

import java.lang.reflect.Array;
import java.util.Arrays;

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

		a[0] = 107;
		a[1] = 7;
		a[2] = 7;
		a[3] = 21;
		a[4] = 67;

		System.out.println(min(a));
		System.out.println(max(a));	
		System.out.println(sum(a));
		System.out.println(avrg(a));
		System.out.println(min(a));
		System.out.println(max(a));	
		System.out.println(sum(a));
		System.out.println(avrg(a));
		System.out.println(median(a));
	}
	//min
	/**
	 * this method returns the index of the first occurrance of the smallest number in the array
	 * @param num - the array will be used 
	 * @return
	 */
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
	public static double avrg (int num []) {
		double sum = num[0];
		double avrg; 

		for(int i = 1; i < num.length; i++) {
			sum = num[0] + num[1] + num[2] + num[3] + num[4];		
		}
		avrg = sum/5;
		return avrg;
	}
	//min 
	public static int min (double num []) {
		double min = num[0];
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
	public static int max (double num []) {
		double max = num[0];
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
	public static double  sum (double num []) {
		double sum = num[0];

		for(int i = 1; i < num.length; i++) {
			sum = num[0] + num[1] + num[2] + num[3] + num[4];	
		}
		return sum;
	}

	//average 
	public static double avrg (double num []) {
		double sum = num[0];
		double avrg; 

		for(int i = 1; i < num.length; i++) {
			sum = num[0] + num[1] + num[2] + num[3] + num[4];		
		}
		avrg = sum/5;
		return avrg;
	}


	//median 

	public static double median (double [] num ) {
		Arrays.sort(num);
		int odd;
		
		if(num.length%2 != 0)
		{
			
		}
		
		return median;

	}

}










