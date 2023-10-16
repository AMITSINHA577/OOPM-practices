package objectClassTest;

class Student2 {
	
	int id ;
	String name;

	void enterData(int r, String n){
		id = r;
		name = n;
	}
	
	void displayData(){
		System.out.println(id +","+name);

	}
	
}

	class TestClass3{
		
		public static void main(String[] args) {

			Student2 s1 = new Student2();
			s1.enterData(12,"ram");
			s1.displayData();
		}
	
	}
	

