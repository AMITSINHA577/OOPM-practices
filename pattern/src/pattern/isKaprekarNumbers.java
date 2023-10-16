package pattern;

import java.util.Scanner;

public class isKaprekarNumbers {
	
	public static int isKaprekarNumber(int num) {
	    
		if (num < 0) {
	        return -1; 
	    }
	    
	    else if (num == 0) {
	        return -2; 
	    } 
	    
	    else {
	        long square = (long) num * num; 

	        int numDigits = String.valueOf(num).length(); 
	        long divisor = (long) Math.pow(10, numDigits); 

	        long right = square % divisor; 
	        long left = (square - right) / divisor; 

	        if (left + right == num) {
	            return 0 ; 
	        } 
	        else {
	            return 0; 
	        }
	    }
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int ans = sc.nextInt();
		
		System.out.println(isKaprekarNumber(ans));  
		

	}

}
