package interviewQ;

import java.util.HashSet;
import java.util.Set;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class Solution {
//    public String getPermutation(int n, int k) {
//
//    	List<Integer> nums = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            nums.add(i);
//        }
//        
//        int[] factorials = new int[n];
//        factorials[0] = 1;
//        for (int i = 1; i < n; i++) {
//            factorials[i] = i * factorials[i-1];
//        }
//
//        k--;
//        StringBuilder sb = new StringBuilder();
//        for (int i = n-1; i >= 0; i--) {
//            int index = k / factorials[i];
//            int num = nums.get(index);
//            sb.append(num);
//            nums.remove(index);
//            k = k % factorials[i];
//        }
//        
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
////        int n = 4;
////        int k = 9;
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the  first N number: ");
//        int n = sc.nextInt();
//        System.out.print("Enter the  seconed K number: ");
//        int k = sc.nextInt();
//
//        Solution solution = new Solution();
//        String permutation = solution.getPermutation(n, k);
//
//        System.out.println("Permutation: " + permutation);
//    }
//}


public class Solution {
    public int maxBitwiseXOR(int[] nums) {
        int maxBitwiseXOR = 0;
        int mask = 0;
        
        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            Set<Integer> prefixes = new HashSet<>();
            
            for (int num : nums) {
                prefixes.add(num & mask);
            }
            
            int potentialMax = maxBitwiseXOR | (1 << i);
            
            for (int prefix : prefixes) {
                if (prefixes.contains(prefix ^ potentialMax)) {
                    maxBitwiseXOR = potentialMax;
                    break;
                }
            }
        }
        
        return maxBitwiseXOR;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 9, 2};
        Solution solution = new Solution();
        int maxBitwiseXOR = solution.maxBitwiseXOR(nums);
        System.out.println("Maximum Bitwise XOR: " + maxBitwiseXOR);
    }
}
