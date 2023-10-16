package MethodOverriding;


class abc{
	
	void show() {
		System.out.println("this is 1 class");
	}
}

class xyz extends abc {
	
	void show() {
		System.out.println("this is 2 class");
	}
}

public class polytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abc a1 = new abc();
		a1.show();

		xyz x1 = new xyz();
		x1.show();
	}

}
