package staticKeyword;

public class staticVariable {
	
	int id;
	String name;
	static String collage = "MITM";
	
	void addName(int i, String n) {
		
		id =i;
		name = n;
	}
	
	void  display() {
		System.out.println(id +" "+ name+" "+ collage);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVariable s1 = new staticVariable();
		staticVariable s2 = new staticVariable();
		s1.addName(01, "amit");
		s1.display();
		s2.addName(02, "harshit");
		s2.display();


	}

}
