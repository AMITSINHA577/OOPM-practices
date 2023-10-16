package MultipaleInharetanceTest;

interface i1{
	
	public void show();
}

interface i2{
	
	public void display();
}


class test implements i1, i2{
	
	public void show() {
		System.out.println("this is show class...");
	}
	
	public void display() {
		System.out.println("this is display class...");
	}
}

public class mulTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test t1 = new test();
		t1.show();
		t1.display();

	}

}
