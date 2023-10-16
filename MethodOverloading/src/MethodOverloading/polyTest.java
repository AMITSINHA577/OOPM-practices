package MethodOverloading;


//class a{
//	
//	void show(int a) {
//		System.out.println(a);
//	}
//	
//	
//	void show(int a, String b) {
//		System.out.println(a+"....."+b);
//	}
//}

public class polyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is 1 main methode");
		
		polyTest p1 = new polyTest();
		p1.main(1000000);
	}
	
	public static void main(int a) {
		// TODO Auto-generated method stub
		System.out.println("this is 2 main methode"+a);
	}

}
