package pattern;

public class solid_rhombus {
	
	public static void solid_r(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i)+1;j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=n;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solid_r(5);

	}

}
