package arrays;

public class subArray {
	
	public static void subArr(int arr[]) {
		int to = 0;
		
		for (int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr.length;j++) {
				int sum = 0;

				for(int k=i; k<=j;k++) {
					System.out.print(arr[k]+" ");
					sum = sum+arr[k];

					
				}
				to ++;
				System.out.println("sum is: "+sum);
				
				System.out.println();
			}
			System.out.println();
					
		}
		System.out.println(to);
	}

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8};
		subArr(arr);
	}

}
