//Program to copy all elements of one array into another array
package arrays;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int arrSize = sc.nextInt();
		int arr[] = new int[arrSize] ;
		
		int arr2[] = new int [arr.length];
		System.out.println("enter the element in the array");
		
		for(int i=0;i<arrSize;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("this is your old array: ");
		for(int i=0;i<arr.length;i++) {
			arr2[i] = arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("this is your new copy array: ");
		for(int i=0;i<arr2.length;i++) {
			
			System.out.print(arr2[i]+" ");
		}

	}

}
