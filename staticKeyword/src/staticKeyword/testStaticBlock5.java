package staticKeyword;

class staticTest12{
	
	static {
		System.out.println("hiii.. i am in static block wellcome");
	}
	
	static {
		System.out.println("hiii.. i am 2 static block wellcome");
	}
}


public class testStaticBlock5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi.. i am main methode wellcome");
		staticTest12 s1 = new staticTest12();

	}

}
