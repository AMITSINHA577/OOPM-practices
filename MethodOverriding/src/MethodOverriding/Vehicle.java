package MethodOverriding;
class Vehicle {
	
	void run() {
		System.out.println("vehicle is runing...");
	}	
}

class bike2 extends Vehicle {
	
	void run() {
		System.out.println("bike is runing...");
	}
	
	public static void main(String[] args) {

		bike2 b1 = new bike2();
		b1.run();
	}

}
