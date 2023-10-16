package constructorInJava;


class student6{
	
	int id;
	String name;
	
	student6(int i, String s){
		id = i;
		name = s;
		
	}
	
	student6(student6 s){
		id = s.id;
		name = s.name;
		
	}
	
	void display() {
		System.out.println(id + " "+ name);
	}
}


class copyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student6 s1 = new student6(12, "raj");
		student6 s2 = new student6(s1);
		s1.display();
		s2.display();

	}

}
