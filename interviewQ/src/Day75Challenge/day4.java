package Day75Challenge;

import java.util.HashSet;

//WAP remove all the duplicate element of an array using collaction and without collaction

public class day4 {

	public static void main(String[] args) {
		
		int arr[] = {1,7,8,7,8,4,3};
		
//		HashSet<Integer> hs = new HashSet<>();
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			hs.add(arr[i]);
//		}
//		
//		System.out.println(hs);
//		

//		.----------------------------------
		
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=0;j<arr.length;j++) {
				
				if(j==i && arr[i]==arr[j]) {
					break;
				}
				
				if(arr[i]==arr[j]) {
					count++;
				}
			}if(count == 0) {
				System.out.println(arr[i]);
				
			}
		}
	}

}
