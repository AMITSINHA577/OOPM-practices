package constructorInJava;


class student5 {
	
	int id;
	int rollNumber;
	String name;
	int age;
	
	student5(int i) {
		id = i;
	}
	
	student5(String n) {
		name = n;
	}
	
	student5(int i, String n) {
		id = i;
		name = n;
	}
	
	student5(int i, int age) {
		id = i;
	}
	
	
	void display() {
		System.out.println(id);
		System.out.println(id +" "+ age);
		System.out.println(age +" "+ name);
		System.out.println(name + " "+ id);
		System.out.println(age);
	}
	
}


class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student5 s1 = new student5(5);
		student5 s2 = new student5("amit");
		student5 s3 = new student5(20, "raj");
		student5 s4 = new student5(01, 30);
		s1.display();
		s2.display();
		s3.display();
		s4.display();

	}

}
