package arrays;

public class arr_test {
	
	public static void update(int markes[]) {
		
		for(int i=0;i<markes.length;i++) {
			markes[i] = markes[i]+1;
		}
	}

	public static void main(String[] args) {

		int marks[] = {69, 79, 89,99};
		update(marks);
		
		for(int i =0; i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}

	}
}
