package sorting;

public class selectionSort {
	
	
	public static void sSort(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			int minPos = i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minPos] > arr[j]) {
					minPos = j;
				}
			}
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
		}
	}
	
	
	public static void print(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,3,1,5,4,6,8,7};
		sSort(arr);
		print(arr);
	}

}
