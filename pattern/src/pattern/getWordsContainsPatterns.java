package pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class getWordsContainsPatterns {
	
	public static String[] getWordsContainsPattern(String[] words, String pattern) {
	    List<String> matchingWordsList = new ArrayList<>();
	    for (String word : words) {
	        if (word.toLowerCase().contains(pattern.toLowerCase())) {
	            matchingWordsList.add(word.toUpperCase());
	        }
	    }
	    return matchingWordsList.toArray(new String[matchingWordsList.size()]);
	}


	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 String[] arr=new String[10];
		 
		 System.out.println("******Initializing array******");
		    System.out.println("Enter "+arr.length+" string values");
		    for(int i=0; i<arr.length; i++){
		        arr[i]=sc.nextLine();
		    }
		 
		
//		String[] words = {"South Africa", "Afghanistan", "Sri Lanka", "New Zealand", "West Indies", "England", "India", "Australia", "Pakistan", "Bangladesh"};
		String pattern = "an";
//		String[] matchingWords = getWordsContainsPattern(word, pattern);
		String[] matchingWords = getWordsContainsPattern(arr, pattern);
		for (String word : matchingWords) {
		    System.out.println(word);
		}


	}

}
