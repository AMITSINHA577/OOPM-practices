package sorting;

public class insertionSort {
	
	public static void iSort(int arr[]) {
		
		for(int i=0;i<arr.length; i++) {
			int curr = arr[i];
			int prev = i-1;
			
			while(prev >=0 && arr[prev] > curr) {
				arr[prev+1] = arr[prev];
				prev --;
			}
			arr[prev+1] = curr;
		}
	}
	
	public static void print(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,3,4,1,6,5};
		iSort(arr);
		print(arr);
	}

}
