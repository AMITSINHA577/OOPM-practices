package Day75Challenge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//WAP to find small and largest number in an array normal and using collection

public class day2 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 5, 8, 51, 514, 12 };

		int max = Integer.MIN_VALUE;

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println(max);
		System.out.println(min);
		
		
//		using collection
		
		Integer arr2[] = {1,2,9,7,0};
		
		int maxNumber = Collections.max(Arrays.asList(arr2));
		int minNumber = Collections.min(Arrays.asList(arr2));
		
		System.out.println("Max number using collection: "+maxNumber);
		System.out.println("Min number using collection: "+minNumber);
		
		
	}

}
