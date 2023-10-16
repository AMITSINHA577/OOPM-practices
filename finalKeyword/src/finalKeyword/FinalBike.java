package finalKeyword;

//public class FinalBike {
//	
//	final int speed = 200;
//	
//	void run() {
//		speed = 300;
//		System.out.println("Speed of Bike:  " + speed);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		FinalBike f1 = new FinalBike();
//		f1.run();
//
//	}
//
//}
//1: If you make any variable as final, you cannot change the value of final variable(It will be constant).

//public class FinalBike {
//
//	int speed = 200;
//
//	final void run() {
//		System.out.println("Speed of Bike:  " + speed);
//	}
//
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	FinalBike f1 = new FinalBike();
//	f1.run();
//
//}
//}

//2: If you make any method as final, you cannot override it.



public final class FinalBike {

	int speed = 200;

	final void run() {
		System.out.println("Speed of Bike:  " + speed);
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	FinalBike f1 = new FinalBike();
	f1.run();

}
}
//3 : If you make any class as final, you cannot extend it.
//4: 