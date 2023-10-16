package pattern;

import java.util.Scanner;

public class a {
	
	public static void dimond(int n) {
		
		/// 1st half 
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int input = sc.nextInt();
		dimond(input);

	}

}
