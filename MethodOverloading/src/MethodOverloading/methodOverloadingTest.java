package MethodOverloading;
public class methodOverloadingTest {
	
	
	void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	void sum(int num1, int num2, int sum3) {
		System.out.println(num1 + num2 + sum3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloadingTest m1 = new methodOverloadingTest();
		m1.sum(10, 10);
		m1.sum(10, 10, 10);

	}

}
