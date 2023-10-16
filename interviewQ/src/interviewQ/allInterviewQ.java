package interviewQ;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class allInterviewQ {

//	https://prepinsta.com/interview-preparation/technical-interview-questions/most-asked-coding-questions-in-placements/

//			How to split a string into words or substrings?
//			How to check if a string starts or ends with a particular substring?
//			How to remove duplicate characters from a string?

//	Q1 : Write a code to reverse a number

//	public static void main(String[] args) {
//		
//		int n = 123;
//
//		while (n != 0) {
//			int temp;
//			temp = n%10;
//			System.out.print(temp);
//			n = n/10;
//			
//		}
//	}

//	Q2 : Write a code to reverse a string
//
//public static void main(String[] args) {
//		
//		String n = "my name is amit ";
//
//		String rev = "";
//		char s[] = n.toCharArray(); // created a char array
//		
//		for(int i=s.length-1;i>=0;i--) {
//			rev +=s[i];
//		}
//		System.out.println(rev);
//	}

//	Q3 : Write the code to find the Fibonacci series upto the nth term.

//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("enter the number you what to print: ");
//		int n = sc.nextInt();
//
//		int a = 0;
//		int b = 1;
//		int temp = 0;
//		System.out.print(a+", "+b);
//		for(int i=2;i<n;i++) {
//			temp = a+b;
//			a = b;
//			b = temp;
//
//			System.out.print(", "+ temp);	
//		}
//	}


//	Q5 : Write code of Greatest Common Divisor GCD(HCF) and LCM

//	public static void main(String[] args) {
//
//		int num1 = 24;
//		int num2 = 36;
//		int gcd = 1;
//		int numMin ;
//
//		if(num1>num2) {
//			numMin = num2  ;
//		}else {
//			numMin = num1 ;
//		}
//		
//		
//		for(int i=1;i<=numMin;i++) {
//			if(num1%i==0 && num2%i==0) {
//				gcd = i;
//			}
//		}
//		System.out.print("GCD of given number is: " +gcd);
//
//		System.out.println(" ");
////		LCM.....
//		
//		
//		int lcm = (num1*num2)/gcd;
//		System.out.println("LCM of given number is: "+lcm);
//		
//	}

//Q6: How to find the length of a string?

//	public static void main(String[] args) {
//		
//	
//		String str = "amit";
//		
//		
//		int count = 0;
//		for(char ch : str.toCharArray()) {
//			count ++;
//		}
//		System.out.println("length of "+str+" is "+count);
//		
//				
//	}

//Q7: Write code of  Perfect number
//	all divide sun is equlae to givan number 

//	public static void main(String[] args) {
//
//		int n = 6;
//		int div = 0;
//		for (int i = 1; i < n; i++) {
//			if (n % i == 0) {
//				div += i;
//			}
//		}
//		if (div == n) {
//			System.out.println("The given number is perfect number :)");
//		} else {
//			System.out.println("The given number is not perfect number!");
//		}
//	}

//	Q8: How to convert a string to lowercase or uppercase?

//	public static void main(String[] args) {
//
//	String str = "amit";
//	System.out.println(str.toUpperCase());
//	
//	
//	}

//	new.......................
//	package interviewQ;
//
//	import java.util.Scanner;
//
//	public class proTest {
//
//		public static void main(String[] args) {
//
//			Scanner sc = new Scanner(System.in);
//			System.out.print("enter the String : ");
//			String str1 = sc.nextLine();
//
//			char ch[] = str1.toCharArray();
//
//			String newstr = "";
//			for (int i = 0; i < str1.length(); i++) {
//
//				if ((int) ch[i] >= 97 && (int) ch[i] <= 122) {
//
//					ch[i] -= 32;
//
//				}
//				newstr += ch[i];
//
//			}
//
//			System.out.println(newstr);
//		}
//	}

//Q9: Write code to Check if two strings are Anagram or not
//	static boolean fun(char[] str1, char[] str2) {
//		
//		int n1 = str1.length;
//		int n2 = str2.length;
//		
//		
//		if(n1 != n2) {
//			return false;
//	}
//		
//		Arrays.sort(str1);
//		Arrays.sort(str2);
//		
//		for(int i=0;i<n1;i++) {
//			if(str1[i] != str2[i]) {
//				return false;
//			}
//		}
//		return true;
//	}
//		
//	
//	public static void main(String[] args) {
//
//		char  str1[] = {'a','m','i','t'};  
//		char  str2[] = {'i','t','m','a'};
//		
//		if(fun(str1, str2)) {
//			 System.out.println("The two strings are"+ " anagram of each other");
//		}else
//			System.out.println("The two strings are not" + " anagram of each other");
//		}

//	Q10: Write code Check if the given string is Palindrome or not

//	package interviewQ;
//
//	import java.util.Scanner;
//
//	public class proTest {
//
//		public static void main(String[] args) {
//
//			Scanner sc = new Scanner(System.in);
//			System.out.print("enter the String : ");
//			String str1 = sc.nextLine();
//
//			int Len = str1.length();
//
//			boolean flag = true;
//			for (int i = 0; i < Len / 2; i++) {
//
//				if (str1.charAt(i) != str1.charAt(Len - i - 1)) {
//					flag = false;
//					break;
//				}
//			}
//			if (flag) {
//				System.out.println("string is palindrome");
//			} else {
//
//				System.out.println("string is not palindrome");
//			}
//
//		}
//	}	

//	public static void main(String[] args) {
//
//	
//		String str = "maam";
//		String revStr = "";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			revStr += str.charAt(i); 
//		}
//		if(str.equals(revStr)) {
//			System.out.println("string is palindrome");
//		}else {
//
//			System.out.println("string is not palindrome");
//		}
//	}

//	@11: Write code to Calculate frequency of characters in a string
//
//	public static void main(String[] args) {
//
//		String str = "geeksforgeeks";
//		char ch[] = str.toCharArray();
//
//		for (int i = 0; i < ch.length; i++) {
//
//			int count = 0;
//			int index = i;
//			for (int j = 0; j < ch.length; j++) {
//
//				if (j < i && (ch[i] == ch[j])) {
//					break;
//				}
//
//				if (ch[i] == ch[j]) {
//					count++;
//				}
//			}
//			if (count > 0) {
//
//				System.out.println(ch[i] + " ------> " + count);
//			}
//		}
//	}
//	Q12:How to remove whitespace from a string?

//	public static void main(String[] args) {
//
//		String str = "amit sinha ji n n n n m";
//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			if(ch != ' ') {
//				System.out.print(ch);
//			}
//		}
//				
//
//	}

//	Q13: How to find the first non-repeating character in a string?

//	public static void main(String[] args) {
//		
//		String str = "aammiidedeit";
//		
//		char ch[] = str.toCharArray();
//		
//		for(int i=0;i<str.length();i++) {
//			boolean unique = true;
//			for(int j=0;j<str.length();j++) {
//				
//				if(i !=j && (ch[i]==ch[j])) {
//					unique = false; 
//					break;
//				}
//			}
//			if(unique) {
//				System.out.println("The first non repeated character in String is: " + ch[i]);
//				break;
//			}
//		}
//	}



//	Q14: //	How to check if a string is a valid number (integer or float)?

//	public static void main(String[] args) {
//		
//		String str = "123";
//		try {
//		   int i = Integer.parseInt(str);
//		   System.out.println("Valid Integer");
//		} catch (NumberFormatException e) {
//		   try {
//		      float f = Float.parseFloat(str);
//		      System.out.println("Valid Float");
//		   } catch (NumberFormatException ex) {
//		      System.out.println("Invalid Number");
//		   }
//		}
//
//	
//	}

//	Q15: //			How to reverse the order of words in a sentence?
//
//	public static String wordRev(String str) {
//		String word[] = str.split(" ");
//		String rev = " ";
//		for (int i = word.length - 1; i >= 0; i--) {
//			rev += word[i] + " ";
//		}
//		return rev.trim();
//	}
//
//	public static void main(String[] args) {
//		String str = "hi i am amit sinha";
//		System.out.println(wordRev(str));
//	}


	//	Q17: //			write a java program to pritn even length words in a string ?
//
//	public static void main(String[] args) {
//		
//		String str = "The quick brown foxs hi hellos";
//		
//		for(String s : str.split(" ")) {
//			if(s.length()%2 == 0) {
//
//				System.out.println(s);
//			}
//			
//		}
//
//	}

//	
//	
//	
////	Q18: //		how to sum two string in java ?
//
//	public static void main(String[] args) {
//		
//		String str1 = "111";
//		String str2 = "222";
//		
//		int num1 = Integer.valueOf(str1);
//		int num2 = Integer.valueOf(str2);
//		
//		System.out.println(num1 + num2);
//		}
//

//	Q19: //		how to count number of words in a string in java ?

//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the strong u want: ");
//
//		String s1 = sc.nextLine();
//		String[] str1 = s1.split(" ");
//		int count = 0;
//		for (int i = 0; i < str1.length; i++) {
//			count++;
//		}System.out.println(count);
//		
//	}

////Q20	JAVA program to compare two strings without using string method equals()
//
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string u want: ");
//
//
//		String s1 = sc.nextLine();
//		System.out.println("Enter the 2 string u want: ");
//		String s2 = sc.nextLine();
//
//	
//		char[] ch1 = s1.toCharArray();
//		char[] ch2 = s2.toCharArray();
//		
//		int num1 = ch1.length;
//		int num2 = ch2.length;
//		
//		int flage = 1;
//		
//		if(num1 == num2) {
//			
//			for(int i=0;i<num1;i++) {
//				if(ch1[i] != ch2[i]) {
//					flage = 0;
//					break;
//				}
//			}
//			
//		}else {
//
//			flage = 0;
//		}
//
//		
//		if(flage == 1) {
//			System.out.println("string is equale");
//		}else{
//
//			System.out.println("string is not equale");
//		}
//	}

////	Q21: //		compare string in java different methdes ?
//
//	public static void main(String[] args) {
//
//		String str1 = "amit";
//		String str2 = "amit";
//		
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equalsIgnoreCase(str2));
//		
//		System.out.println(str1.compareTo(str2));
//		System.out.println(str1.compareToIgnoreCase(str2));
//	}

//	Q22: //		write a java program to finde number of wordes in a sentence and the corresponu=ing character count ?
//
//	public static void main(String[] args) {
//
//		String str1 = "amit sinha name";
//		
//		char ch[] = str1.toCharArray();
//		
//		for(int i=0;i<ch.length;i++) {
//			
//			String s = "";
//			
//			while(i<ch.length && ch[i]!= ' ') {
//				s =  s + ch[i];
//				i++;
//			}
//			if(s.length() > 0) {
//				System.out.println(s +"->" +s.length());
//			}
//		}
//		
//
//	}

//	@ 23 :-  print number of wordes vouels and frequency of each character in string
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the any String: ");
//		String str = sc.nextLine();
//		
//		char ch[] = str.toCharArray();
//		int strCount = 0;
//		int vowelsCount = 0;
//		int upperCaseCount = 0;
//		for(int i=0;i<ch.length;i++) {
//			
//			if(ch[i] == ' ' || ch[i] =='.') {
//				strCount ++;
//			}
//			
//			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' ) {
//				vowelsCount ++;
//			}
//			
//			if(ch[i] >=65 && ch[i] <= 90) {
//				upperCaseCount ++;
//				
//			}
//			
//			int count  = 0;
//			
//			for(int j = 0; j<ch.length;j++) {
//				if( j<i && ch[i] == ch[j] && ch[i] == ' ') {
//					break;
//				}
//				
//				if(ch[i]==ch[j]) {
//					count ++;
//				}
//			}
//			if(count > 0) {
//			
//				System.out.println(ch[i] +"---->"+count);
//				
//			}
//			
//			
//		}
//		System.out.println(strCount);
//		System.out.println(vowelsCount);
//		System.out.println(upperCaseCount);
//	}

//	Q24 Write a Java program that will print the number of occurrences of each character in a string.
//	
//	public static void main(String[] args) {
//	
//		String strs = "Footable";
//		
//		String str = strs.toLowerCase();
//		
//		HashMap <Character, Integer> map = new HashMap <Character, Integer>();
//		
//		for(char ch : str.toCharArray()) {
//			
//			if(map.get(ch) == null) {
//				map.put(ch, 1);
//			}else {
//				map.put(ch, map.get(ch)+1);
//			}
//			
//		}
//		
////		System.out.println(map);   ye bhi kar sakte h or for loop se bhi nikal sakte h is se map me he sala data aayega
//		
//		for(Map.Entry entry : map.entrySet()) {
//			System.out.println(entry.getKey()+" -----> "+entry.getValue());
//		}
//		
//	}
//	

//	@ 25: print all sub string 	for a given string...

//	public static void main(String[] args) {
//
//		String str = "abc";
//		
//		
////		for (int i = 0; i < str.length(); i++) {
////			for (int j = i + 1; j <= str.length(); j++) {
////				System.out.println(str.substring(i, j));
////
////			}
////		}
//		
//	
//		
//		for(int i=0;i<str.length();i++) {
//			String temp = "";
//			for(int j=i;j<str.length();j++) {
//				temp += str.charAt(j);
//				System.out.println(temp);
//			}
//		}
//
//	}

//	#Q26: check both string are rotation of each other like  main string = "abcd"   ro String = "bcda", " cdab", "dabc"   worange string = "adbc"
//
//	public static boolean rotation(String str, String rostr) {
//
//		if (str.length() != rostr.length()) {
//			return false;
//		} else if (str == null || rostr == null) {
//			return false;
//		} else {
//			String newstr = str + str;
//
//			return newstr.contains(rostr);
//		}
//
//	}
//
//	public static void main(String[] args) {
//		System.out.println(rotation("abcd", "bcda"));
//
//	}

//	#Q27:  Write a program to find the factorial of a number.
//	
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("enter the Number : ");
//		int num1 = sc.nextInt();
//
//		int fact = 1;
//		for(int i=1;i<=num1;i++) {
//			
//			fact *= i;
//		}
//		
//		System.out.println("Given number factorial is: "+fact);
//		
//	}
	
	
//	#Q27.1   Factorial Program using..... recursion.... in java
//
//	public static int fact(int num) {
//		
//		if(num==0) {
//			return 1;
//		}else {
//			return (num*fact(num-1));
//		}
//	}
//	
//	public static void main(String[] args) {
//	
//		int number = 4;
//		int ans = fact(number);
//		System.out.println(ans);
//		
//	}

	
	

//	#Q 28: Implement a program to check if a number is prime.

//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("enter the Number : ");
//		int num1 = sc.nextInt();
//
//		int fact = 0;
//		for(int i=2;i<num1/2;i++) {
//			if(num1%i==0) {
//				
//				fact = 1;
//				break;
//			}
//			
//		}if(fact == 0) {
//			System.out.println("Given number is prime number: "+num1);
//		}else {
//
//			System.out.println("Given number is not a prime number: "+num1);
//		}
//		
//		
//	}
//
//	
//	@=#29:Implement a program to find the largest element in an array. 
//		
//		
//		class abc{
//		
//		public void numarr(int arr[]) {
//			
//			int max = arr[0];
//			for(int i=0;i<arr.length;i++) {
//				
//				if(max < arr[i]) {
//					max = arr[i];
//				}
//			}
//			System.out.print("Max number in the array is: "+max);
//
//		}
//	}
//
//	public class proTest {
//
//		public static void main(String[] args) {
//
//			Scanner sc = new Scanner(System.in);
//			System.out.print("enter the Size of array : ");
//			int size = sc.nextInt();
//
//			int arr[] = new int[size];
//					
//			System.out.print("enter the element in to array : ");
//			
//			for(int i=0;i<arr.length;i++) {
//				arr[i] = sc.nextInt();
//			}
//			
//			abc a = new abc();
//			a.numarr(arr);
//		}
//	}
//
//
//
//	
//	@Q 30:Implement a program to find the second largest element in an array.
//		
//		
//		class abc{
//		
//		public void secondeMax(int arr[]) {
//			
//			int max = Integer.MIN_VALUE;
//			int max2 = Integer.MIN_VALUE;
//			
//			for(int i=0;i<arr.length;i++) {
//				
//				if(arr[i]>max) {
//					max2 = max;
//					max = arr[i];
//				}
//				if(arr[i]<max && arr[i]>max2) {
//					
//					max2 = arr[i];
//				}
//			}
//			System.out.println("max number is : "+max);
//			System.out.println("2 max number is : "+max2);
//		}
//	}
//
//
//	public class proTest {
//
//		public static void main(String[] args) {
//			
//
//			Scanner sc = new Scanner(System.in);
//			System.out.print("enter the size of array: ");
//			int size = sc.nextInt();
//			int[] arr = new int[size];
//			System.out.println("enter the element u want to insert: ");
//			for(int i=0;i<arr.length;i++) {
//				arr[i] = sc.nextInt();
//				
//			}
//			
//			abc a = new abc();
//			a.secondeMax(arr);
//			
//		}
//	}

//
//	Q31:  Write a program to sort an array of integers in ascending order.

	
//	public static void main(String[] args) {
//
//		int arr[] = { 1, 5, 4, 3, 2 };
//
//		int temp = 0;
//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = i + 1; j < arr.length; j++) {
//
//				if (arr[i] > arr[j]) {
//
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//
//			System.out.println(arr[i]);
//		}
//
//	}
	
//	Q32 Implement a program to remove duplicates from an array.
	
	
//	useing hashset both are working shorted and unshorted
//	
//	import java.util.HashSet;
//	import java.util.Scanner;
//
//
//	class abc{
//		
//		public void secondeMax(int arr[]) {
//
//			HashSet<Integer> hs = new HashSet<>();
//			
//			for(int i=0;i<arr.length;i++) {
//				
//				hs.add(arr[i]);
//			}
//			
//			for(int h:hs) {
//				System.out.print(h+" ");
//			}
//		}
//	}
//
//
//	public class proTest {
//
//		public static void main(String[] args) {
//			
//
//			Scanner sc = new Scanner(System.in);
//			System.out.print("enter the size of array: ");
//			int size = sc.nextInt();
//			int[] arr = new int[size];
//			System.out.println("enter the element u want to insert: ");
//			for(int i=0;i<arr.length;i++) {
//				arr[i] = sc.nextInt();
//				
//			}
//			
//			abc a = new abc();
//			a.secondeMax(arr);
//			
//		}
//	}
//	
//	
//
//   in this case	array must be shorted ...
//
//	
//	
//	
//	class abc{
//		
//		public void secondeMax(int arr[]) {
//			
//			int temp[] = new int[arr.length];
//			int j = 0;
//
//			for (int i = 0; i < arr.length-1; i++) {
//
//				if (arr[i] != arr[i + 1]) {
//					temp[j] = arr[i];
//					j++;
//				}
//			}
//			temp[j] = arr[arr.length - 1];
//
//			for (int k = 0; k < temp.length; k++) {
//				System.out.print(temp[k] + " ");
//			}
//
//		}
//	}
//
//
//	public class proTest {
//
//		public static void main(String[] args) {
//			
//
//			Scanner sc = new Scanner(System.in);
//			System.out.print("enter the size of array: ");
//			int size = sc.nextInt();
//			int[] arr = new int[size];
//			System.out.println("enter the element u want to insert: ");
//			for(int i=0;i<arr.length;i++) {
//				arr[i] = sc.nextInt();
//				
//			}
//			
//			abc a = new abc();
//			a.secondeMax(arr);
//			
//		}
//	}
	
	
//	in this case array is shorted and we not use one more array  in place of temp we put arr and for printing loop go only j+1
//	
//	
//	
//
//class abc{
//	
//	public void secondeMax(int arr[]) {
//		int j = 0;
//		for (int i = 0; i < arr.length-1; i++) {
//
//			if (arr[i] != arr[i + 1]) {
//				arr[j] = arr[i];
//				j++;
//			}
//		}
//		arr[j] = arr[arr.length - 1];
//
//		for (int k = 0; k < j+1; k++) {
//			System.out.print(arr[k] + " ");
//		}
//
//	}
//}
//
//
//public class proTest {
//
//	public static void main(String[] args) {
//		
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("enter the size of array: ");
//		int size = sc.nextInt();
//		int[] arr = new int[size];
//		System.out.println("enter the element u want to insert: ");
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//			
//		}
//		
//		abc a = new abc();
//		a.secondeMax(arr);
//		
//	}
//}

	
//	Q33 remove repeted char in a string
//	
//	package interviewQ;
//
//	import java.util.HashSet;
//
//	public class proTest {
//
//		public static void main(String[] args) {
//
//			String str = "aaabcbbdsse";
//			char[] ch = str.toCharArray();
//			HashSet<Character> hs = new HashSet<>();
//			for(int i=0;i<ch.length;i++) {
//				hs.add(ch[i]);
//			}
//			for(Character h  : hs) {
//				System.out.print(h);
//			}
//		}
//	}
	
//	Q34 Write a program to count the occurrence of each element in an array.
//	
//	package interviewQ;
//
//	import java.util.HashMap;
//	import java.util.HashSet;
//
//	public class proTest {
//
//		public static void main(String[] args) {
//
//			int arr[] = {1,3,2,4,3,2,4,5,6,7,5,4};
//		
//			HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
//			
//			for(int i=0;i<arr.length;i++) {
//				if(m.get(arr[i]) == null) {
//					m.put(arr[i], 1);
//				}else {
//					int count = m.get(arr[i]);
//					m.put(arr[i], count+1);
//				}
//			}System.out.println(m+" ");
//			
//		}
//	}
//
//	without hashmap
//	
//	
//	package interviewQ;
//
//	import java.util.HashSet;
//
//	public class proTest {
//
//		public static void main(String[] args) {
//
//			int arr[] = { 1, 3, 2, 4, 3, 2, 4, 5, 6, 7, 5, 4 };
//
//			for (int i = 0; i < arr.length; i++) {
//				int count = 0;
//				for (int j = 0; j < arr.length; j++) {
//
//					if (j < i && arr[i] == arr[j]) {
//						break;
//					}
//					if (arr[i] == arr[j]) {
//						count++;
//					}
//				}
//				if (count > 0) {
//
//					System.out.println(arr[i] + "---->" + count);
//
//				}
//			}
//		}
//	}
	
	
	
//#Q 35 Armstrong Number Java Program	
	
//	public static void main(String[] args) {
//
//		int num = 1634;
//
//		int orignalNum1 = num;
//		int count = 0;
//
//		while (orignalNum1 != 0) {
//
//			orignalNum1 /= 10;
//			count += 1;
//		}
//
//		int orignalNum = num;
//
//		int ans = 0;
//
//		while (orignalNum != 0) {
//
//			int singleDigite = orignalNum % 10;
//
//			ans += ((int) Math.pow(singleDigite, count));
//
//			orignalNum /= 10;
//		}
//
//		if (ans == num) {
//			System.out.println("number is Armstrong number");
//		} else {
//			System.out.println("number is not a Armstrong number");
//		}
//

	
//#Q36 Generating Random Number in Java	
//	public static void main(String[] args) {
//
//		int max = 400;
//		int min = 200;
//		
//		int b = (int)(Math.random()*(max-min+1)+min);  
//		System.out.println(b);  
//
//	}

	
//Q37 Java Automorphic Number Program
//
//	A number is called an automorphic number if and only if the square of the given number ends with the same number itself. For example, 25, 76 are automorphic numbers because their square is 625 and 5776, 
//	respectively and the last two digits of the square represent the number itself. Some other automorphic numbers are 5, 6, 36, 890625, etc.
//	
//	
//	
//	public static boolean fun(int num) {
//
//		int ans = num * num;
//
//		while (num > 0) {
//			if (num % 10 != ans % 10) {
//				return false;
//			}
//
//			ans /= 10;
//			num /= 10;
//		}
//		return true;
//	}
//
//	public static void main(String[] args) {
//
//		int num = 25;
//		if (fun(num)) {
//			System.out.println(num + " is an automorphic number.");
//		} else {
//			System.out.println(num + " is not an automorphic number.");
//		}
//
//	}

	
	
//	Q38   Peterson Number
//	A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.
//	Number = 145
//			145 = !1 + !4 + !5
//			=1+4*3*2*1+5*4*3*2*1
//			=1+24+120
//			145=145
//	
//
//	static int factorial(int num) {
//		int result = 1;
//		for (int i = 1; i <= num; i++) {
//			result *= i;
//		}
//		return result;
//	}
//
//	static boolean isPetersonNumber(int num) {
//
//		int originalNum = num;
//		int sum = 0;
//		while (num != 0) {
//
//			int temp = num % 10;
//			sum += factorial(temp);
//			num /= 10;
//		}
//		return sum == originalNum;
//	}
//
//	public static void main(String[] args) {
//
//		int number = 145;
//
//		if (isPetersonNumber(number)) {
//			System.out.println(number + " is a Peterson number.");
//		} else {
//			System.out.println(number + " is not a Peterson number.");
//		}
//	}

	
	
	
	
	
//Q  Program to copy all elements of one array into another array
//	
//	
//	public static void main(String[] args) {
//		int arr1[] = { 1, 2, 3, 4, 5, 6 };
//		int arr2[] = new int[arr1.length];
//		for (int i = 0; i < arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
//		for (int h : arr2) {
//			System.out.println(h);
//		}
//	}
//
	
	
	
//	Q   Program to find the frequency of each element in the array
//	
//	
//
//	public static void main(String[] args) {
//		int arr1[] = { 1, 2, 3, 4, 5, 6,1,2,3,4,5,6,7,8,9};
//		
//		
//		for(int i=0;i<arr1.length;i++) {
//			
//			int count =0;
//			int vistie = 0;
//			for(int j=0;j<arr1.length;j++) {
//				
//				if(j<i && arr1[i]==arr1[j]) {
//					break;
//				}
//				
//				if(arr1[i]==arr1[j]) {
//					
//					count++;
//				}
//				
//			}if(count > 0) {
//				System.out.println(arr1[i]+"...."+count);
//			}
//		}
//		
//	}

	

//Q   Program to left rotate the elements of an array
	
//	
//	public static void main(String[] args) {
//		int arr1[] = { 1, 2, 3, 4, 5};
//
//		int first = arr1[0];
//		for(int i=0;i<arr1.length-1;i++) {
//			
//			arr1[i] = arr1[i+1];
//		}
//		arr1[arr1.length-1] = first;
//		
//		for(int ans : arr1) {
//			System.out.print(ans+" ");
//		}
//		
//	}
//	
//	ye frist element ko rotated kiya h  aagr n number ko karna h to ek loop me dal do sab ko bas 
	
//	int arr1[] = { 1, 2, 3, 4, 5 };
//	int n = 3;
//
//	for (int k = 0; k < n; k++) {
//
//		int first = arr1[0];
//		for (int i = 0; i < arr1.length - 1; i++) {
//
//			arr1[i] = arr1[i + 1];
//		}
//		arr1[arr1.length - 1] = first;
//
//	}
//	for (int ans : arr1) {
//		System.out.print(ans + " ");
//
//	}

	
	
//	Q Java Program to print the duplicate elements of an array
//	
//	
//	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3, 4, 5, 5 };
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//
//				if (arr[i] == arr[j]) {
//
//					System.out.println(arr[i]);
//				}
//			}
//		}
//
//}


	
	
//	Q Program to print the elements of an array in reverse order
//
//	
//	
//	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3, 4, 5};
//		
//		for(int j=arr.length-1;j>=0;j--) {
//			System.out.println(arr[j]);
//		}
//	}






	
//	String-----------------------------------
	
	
	//Java Program to divide a string in 'N' equal parts.
//
//		public static void main(String[] args) {
//
//			String str = "aaabbbcccddd";
//			int n = 3;
//			char ch[] = str.toCharArray();
//			
//			String temp = "";
//			for(int i=0;i<str.length();i++) {
//				
//				if(i%n == 0 && i> 0) {
//					System.out.println(temp);
//					temp = "";
//				}
//				temp += ch[i]; 
//				}
//				
//				if(temp.length()!=0) {
//					System.out.println(temp);
//				}
//			}


	
	
	
	
	
	
	
//	binary search ''''''''''''''''''''''
//
//	public class proTest {
//
//		public static int test(int arr[], int element) {
//
//			int start = arr[0];
//			int end = arr.length - 1;
//
//			while (start <= end) {
//
//				int mid = (start + end) / 2;
//
//				if (element == arr[mid]) {
//					return mid;
//				} else if (element < arr[mid]) {
//
//					end = mid - 1;
//				} else {
//					start = mid + 1;
//				}
//			}
//
//			return 0;
//		}
//
//		public static void main(String[] args) {
//
//			int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//			int num = 7;
//			int ans = test(arr, num);
//
//			if (ans == 0) {
//				System.out.println("element not found");
//			} else {
//				System.out.println(ans);
//			}
//		}
//	}

	
//	binary search but dissacind odear
//	
//	package interviewQ;
//
//	public class proTest {
//
//		public static int test(int arr[], int element) {
//
//			int start = 0;
//			int end = arr.length - 1;
//
//			while (start <= end) {
//
//				int mid = (start + end) / 2;
//
//				if (element == arr[mid]) {
//					return mid;
//				} else if (element < arr[mid]) {
//					start = mid + 1;
//				} else {
//
//					end = mid - 1;
//				}
//			}
//
//			return 0;
//		}
//
//		public static void main(String[] args) {
//
//			int arr[] = { 100, 92, 83, 74, 65, 56, 47, 38, 29 };
//			int num = 47;
//			int ans = test(arr, num);
//
//			if (ans == 0) {
//				System.out.println("element not found");
//			} else {
//				System.out.println(ans);
//			}
//		}
//	}


	
	
//Q   first occurrence of an element in a sorted array using binary search. 	
	
//	package interviewQ;
//
//	public class proTest {
//
//		public static int test(int arr[], int element) {
//
//			int start = 0;
//			int end = arr.length - 1;
//			int result = -1;
//
//			while (start <= end) {
//
//				int mid = (start + end) / 2;
//				if (element == arr[mid]) {
//					result = mid;
//					start = mid - 1;    //first occurrence
//					start = mid+1;     last occurrence
//				} else if (element < arr[mid]) {
//					end = mid - 1;
//				} else {
//
//					start = mid + 1;
//
//				}
//			}
//
//			return result;
//		}
//
//		public static void main(String[] args) {
//
//			int arr[] = { 2, 4, 10, 10, 10, 18, 20 };
//			int num = 10;
//			int ans = test(arr, num);
//
//			if (ans == -1) {
//				System.out.println("element not found");
//			} else {
//				System.out.println(ans);
//			}
//		}
//	}

	

}