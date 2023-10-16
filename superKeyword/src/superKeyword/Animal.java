package superKeyword;

class Animal {
	String name = "raj";
}

class dog extends Animal{
	String name = "amit";

	void display() {
		System.out.println(name);
		System.out.println(super.name);
		
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog d1 = new dog();
		d1.display();
	}

}


//We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.