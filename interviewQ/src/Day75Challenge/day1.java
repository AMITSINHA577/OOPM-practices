package Day75Challenge;



//WAP to print all duplicate element in an array or find occurrence of number in array

public class day1 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5,7,8,4,5,7,8,1,2,4,5};
		
		for(int i=0;i<arr.length;i++) {
			
			int count =0;
			for(int j=0;j<arr.length;j++) {
				
				if(j<i && arr[i]==arr[j]) {
					break;
					
				}
				
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			
			if(count >0) {
				
				System.out.println(arr[i]+"------>"+count);
			}
				
			
		}
		
	}

}
