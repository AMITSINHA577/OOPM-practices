package arrays;

public class maxSubArraySumKadanes {
	
	public static void kadans(int arr[]) {
		
		int cs = 0;
		int ms = 0;
		
		for(int i=0;i<arr.length;i++) {
			cs += arr[i];
			if(cs<0) {
				cs = 0;
			}
			
			ms = Math.max(cs, ms);
		}
		System.out.println("max sum is: "+ ms);
	}

	public static void main(String[] args) {

		
		int arr[]= {-2, -3, 4, -1, -2, 1, 5, -3};
		
		kadans(arr);
	}

}
