package thisKeyword;


//use3   this() keywprd  can be used to invoke current  class constuctor

class test3{
	
	test3(){
		System.out.println("this is no agr coustuctor");
	}
	
	test3(int a){
		
		this();
		System.out.println("this is par construtor");
	}
}

public class testUse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test3 t1 = new test3(1000);

	}

}
