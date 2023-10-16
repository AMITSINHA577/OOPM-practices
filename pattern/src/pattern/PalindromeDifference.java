package pattern;

import java.util.Scanner;

import java.util.Scanner;

public class PalindromeDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int reverseNum = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverseNum = (reverseNum * 10) + remainder;
            num /= 10;
        }
        int diff = 0;
        while (originalNum != reverseNum) {
            int remainder1 = originalNum % 10;
            int remainder2 = reverseNum % 10;
            diff += Math.abs(remainder1 - remainder2);
            originalNum /= 10;
            reverseNum /= 10;
        }
        System.out.println("The difference in digits to make " + originalNum + " a palindrome is: " + diff);
    }
}
