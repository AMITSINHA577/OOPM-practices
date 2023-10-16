package arrays;

public class maxSubArraySum {

	public static void subArraySum(int arr[]) {
		
		int max = 0;
		int curr = 0;
		
		for(int i =0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				curr = 0;
				
				for(int k=i;k<=j;k++) {
					
					curr +=arr[k];
				}
				
				System.out.println(curr);
				
				if(max<curr) {
					max = curr;
				}
				
			}
		}
		System.out.println("max sum is: "+max);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2, 4, 6, 8, 10};
		subArraySum(arr);

	}

}
