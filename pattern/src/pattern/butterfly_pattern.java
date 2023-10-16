package pattern;

public class butterfly_pattern {
	
	public static void butter(int n) {
		///////// outer loop and 1st half
		
		for(int i=1;i<=n;i++) {
			
			///// * print
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			for(int k=1;k<=2*(n-i);k++) {
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

		///////// outer loop and 2st half
		
		for(int i=n;i>=1;i--) {
			
			///// * print
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			for(int k=1;k<=2*(n-i);k++) {
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		butter(4);

	}

}
