package arrays;

public class linearSearch {
	
	public static int update(int number[],int findData) {
		
		for(int i=0;i<number.length;i++) {
			if(number[i]==findData) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		
		int data[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int findData = 18;
		
		int index = update(data, findData);
		if(index == -1) {
			System.out.println("not found");
		}else {
			System.out.println("yes we found that number at index: " + index);
		}

	}

}
