package MethodOverloading;


class test{
	
	void show(int a) {
		System.out.println("this is int methode");
	}
	
	void show(String b) {
		System.out.println("this is String methode");
	}
}

public class polyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test t1 = new test();
		t1.show('a');  // char h isliye yaha par automatic type change ho raha h 

	}

}
