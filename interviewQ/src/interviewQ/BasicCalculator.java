package interviewQ;

import java.util.Stack;

public class BasicCalculator {
    public static int calculate(String s) {
        int sign = 1; //for + sign
        int ans = 0;
        int currentNumber = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                currentNumber = s.charAt(i) - '0';
                while(i + 1 < s.length() && Character.isDigit(s.charAt(i+1))) {
                    currentNumber = currentNumber * 10 + s.charAt(i+1) - '0';
                    i++;
                }
                currentNumber = currentNumber * sign;
                ans += currentNumber;
                currentNumber = 0;
                sign = 1;
            }
            else if(s.charAt(i) == '+') {
                sign = 1;
            }
            else if(s.charAt(i) == '-') {
                sign = -1; 
            }
            else if(s.charAt(i) == '(') {
                stack.push(ans); 
                stack.push(sign); 
                ans = 0;
                sign = 1;
            }
            else if(s.charAt(i) == ')') {
                int prevSign = stack.pop();
                ans = ans * prevSign;
                int prevAns = stack.pop();
                ans = ans + prevAns;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(calculate("1 + 1"));
        System.out.println(calculate(" 2-1 + 2 "));
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}