package objectClassTest;

class Student1{
	
	int id =10;
	String name = "Amit Sinha";
}

public class TestClass2 {

	public static void main(String[] args) {

		Student1 s1 = new Student1();
//		s1.id = 20;
		s1.name = "Sandeep Sinha";
		System.out.println(s1.id);
		System.out.println(s1.name);
	}

}
