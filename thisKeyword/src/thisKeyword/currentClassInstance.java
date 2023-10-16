package thisKeyword;

public class currentClassInstance {
	
	int id;
	String name;
	
	void takeArgument(int id, String name) {
		id = id;
		name = name;
	}
	
	void display() {
		System.out.println(id +" "+ name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		currentClassInstance c1 = new currentClassInstance();
		c1.takeArgument(01, "ankit");
		c1.display();
	}

}


// this program give 0 or null because 
//In the above example, parameters (formal arguments) and instance variables are same. So, we are using this keyword to distinguish local variable and instance variable.



//public class currentClassInstance {
//	
//	int id;
//	String name;
//	
//	void takeArgument(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}
//	
//	void display() {
//		System.out.println(id +" "+ name);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		currentClassInstance c1 = new currentClassInstance();
//		c1.takeArgument(01, "ankit");
//		c1.display();
//	}
//
//}