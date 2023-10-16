package InterfaceTestExs;

interface i1{
	
	public void show();
}

class test implements i1{
	
	public void show() {
		
		System.out.println("this is interface class test...");
	}
}

public class interTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test t1 = new test();
		t1.show();

	}

}
