package inharetanceatest;

class sun1{
	void sun1Name() {
		System.out.println("my name is amit...");
	}
}


class sun2 extends sun1{
	void sun2Name() {
		System.out.println("my name is raj...");
	}
}



class sun3 extends sun2{
	void sun3Name() {
		System.out.println("my name is sanju...");
	}
}


public class multilevelInharetance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sun3 s1 = new sun3();
		s1.sun1Name();
		s1.sun2Name();
		s1.sun3Name();
		
	}

}
