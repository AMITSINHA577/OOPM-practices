package superKeyword;

class A{
	
	void show() {
		System.out.println(" this is class A");
	}
}

class B extends A{
	
	void display() {
		super.show();
	}
}

public class testUSe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b1 = new B();
		
		b1.display();
	}

}
