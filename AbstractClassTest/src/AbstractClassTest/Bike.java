package AbstractClassTest; 
abstract class Bike {
	
	abstract void run();
}

class honda extends Bike{
	void run() {
		System.out.println("run...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b1 = new honda();
		b1.run();

	}

}
