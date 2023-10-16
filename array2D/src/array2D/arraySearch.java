package array2D;

import java.util.Scanner;

public class arraySearch {
	
	public static int search(int matrix[][]) {
		
		int mexMatrix = 0;
		for(int i=0;i<matrix.length;i++) {
			
			for(int j=0;j<matrix.length;j++) {
				
				if(matrix[i][j] > mexMatrix) {
					
					mexMatrix = matrix[i][j];
					
//					System.out.println("element found at index "+ i +", "+ j);
					
				}
			}
		}
		return mexMatrix;
	}

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
	
		int matrix [][] = new int [n] [m];
		
		for (int i=0;i<matrix.length;i++) {
			
			for(int j=0;j<matrix.length;j++) {
				
				System.out.print("enter the element in the metrix: ");
				matrix [i][j] = sc.nextInt();
				
			}
		}
		
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j] +" ");
				
			}
			System.out.println();
		}
		
		int max = search(matrix);
		System.out.println(max);
	}

}
