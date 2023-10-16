package EncapTest;

class test{
	
	private int a;
	
	public void settest(int b) {
		a = b;
	}
	
	public int gettest() {
		return a;
	}
}

public class encapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test t1 = new test();
		t1.settest(10);
		System.out.println( t1.gettest());

	}

}