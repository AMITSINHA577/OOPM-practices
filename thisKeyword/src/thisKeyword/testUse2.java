package thisKeyword;

//use 2  this keyword can be used to invoke current class method

class testdemo{
	
	void show() {
		System.out.println("hello amit ");
	}
	
	void show1() {
		System.out.println("hello amit1 ");
	}
	
	void display() {
		this.show();
		this.show1();
	}
}

public class testUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testdemo t1 = new testdemo();
		t1.display();
	}

}
