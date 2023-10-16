//Program to find the frequency of each element in the array

package arrays;

import java.util.Scanner;

class frequencyArray{
	
	 public static void  frequency(int arr[]) {
		 
		 
		 for(int i=0;i<arr.length;i++){
			 int count = 1;
			 for(int j=i+1;j<arr.length;j++) {
				 
				 if(arr[i]==arr[j]) {
					 count ++;
					 arr[j] = 0;
				 }
			 }

//			 We use another nested for loop to compare the current element with all the other elements in the array. If we find another element that is equal to the current element, we increment a count variable to keep track of how many times we've seen that element.

//			 We also mark the other element as "counted" by setting its value to 0. This is to avoid double-counting elements when we loop through the array.
			 
			 if(arr[i]!=0) {
				 System.out.println(arr[i] +"--->"+count);
				  
			 }
		}
		
	}
}


public class frequencyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the length of array:");
		int sizeArr = sc.nextInt();
		int arr[] = new int [sizeArr];
		System.out.println("enter the element in array: ");
		for(int i=0;i<sizeArr;i++) {
			arr[i] = sc.nextInt();
		}
		
		frequencyArray f1 = new frequencyArray();
		f1.frequency(arr);

	}

}
