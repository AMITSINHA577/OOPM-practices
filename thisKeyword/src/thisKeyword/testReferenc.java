package thisKeyword;


//use 1:  this keyword is use to reference variable that refers to the curret object

class test{
	
	int i;
	void show(int i) {
		this.i = i;
	}
	
	void display() {
		
		System.out.println(i);
	}
}

public class testReferenc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test t1 = new test();
		t1.show(10000);
		t1.display();

	}

}
