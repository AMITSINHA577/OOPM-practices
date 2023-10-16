package Day75Challenge;

//find all pairs of element from an arrays whose sum is equale to given number 
//number is 20

public class day3 {

	public static void main(String[] args) {
		
		int arr[] = {12,825,14,45,12,10,10,10,7,13,5,15,1,4,5,2,4};
		int gNum = 20;
		for(int i=0;i<arr.length;i++) {
			
			int temp = arr[i]+arr[i+1];
			if(temp == gNum) {
				System.out.println(arr[i]+" + "+arr[i+1]+" = "+gNum);
			}
			
			
		}

	}

}
