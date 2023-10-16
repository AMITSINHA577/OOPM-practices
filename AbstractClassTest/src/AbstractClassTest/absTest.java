package AbstractClassTest;


abstract class vehical{
	
	abstract void start();
}

class car extends vehical{
	
	void start() {
	
		System.out.println("this is car class and car start useing keys...");
	}
}

class scooter extends vehical{
	
	void start() {
	
		System.out.println("this is scooter class and scooter start useing keys...");
	}
}

public class absTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c1 = new car();
		c1.start();
		
		scooter s1 = new scooter();
		s1.start();

	}

}
