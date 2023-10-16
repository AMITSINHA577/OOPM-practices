package arrays;

public class largestNumber {
	
	public static int largeNumber(int number[]) {
		int mixNumber = 0;
		
		for(int i =0;i<number.length;i++) {
			if(number[i]>mixNumber) {
				mixNumber = number[i];
			}
		}
		return mixNumber;
	}

	public static void main(String[] args) {
		
		int arr[] = {2,4,1,2,9,1};
		System.out.println(largeNumber(arr));
		
	}

	

}
