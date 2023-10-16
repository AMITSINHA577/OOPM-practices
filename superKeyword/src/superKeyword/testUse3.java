package superKeyword;

// super()  can be used to invoke immediate parent class costsuter

class demoA{
	
	demoA(){
		System.out.println("this class demoA");
	}
}


class demoB  extends demoA{
	
	demoB(){
		super();
		System.out.println("this class demoB");
	}
}

public class testUse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demoB b1 = new demoB();

	}

}
