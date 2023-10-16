package inharetanceatest;

class suns {
	void sunName() {
		System.out.println("my name is amit...");
	}
}

class father extends suns {
	void fatherName() {
		System.out.println("my name is raj...");
	}
}

class mother extends suns {
	void motherName() {
		System.out.println("my name is ravina...");
	}
}

public class hierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mother m1 = new mother();
		m1.motherName();
		m1.sunName();
//		m1.fatherName(); error 
	}

}




//multiple inheritance is not supported in java?

//Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.