package staticKeyword;

public class changeStatic {
	
	int id;
	static String collage = "MITM";
	
	
	static void change() {
		collage = "MIT";
	}
	
	void sName(int i) {
		id = i;
	}
	
	void display() {
		System.out.println(id +" "+ collage);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		changeStatic.change();
		changeStatic c1 = new changeStatic();
		c1.sName(01);
		c1.display();
		
}

}
