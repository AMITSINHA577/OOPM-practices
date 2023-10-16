package objectClassTest;

class Student {
	int id =10;
	String name = "Amit Sinha";
	}

class TestClass{
	public static void main(String[] args) {
		Student s1  = new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
	}

}
