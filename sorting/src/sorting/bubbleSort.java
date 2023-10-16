package sorting;

public class bubbleSort {
	
	public static void bSort(int arr[]) {
		
		for(int turn=0; turn<arr.length-1; turn++) {
			
			for(int j=0; j<arr.length-1-turn;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void print(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,3,1,4,5,7,6};
		bSort(arr);
		print(arr);
	}

}
