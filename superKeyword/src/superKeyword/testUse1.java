package superKeyword;

class a{
	
	int i=10;
	
}

class b extends a{
	
	int i=20;
	
	void show(int i) {
		
	System.out.println("this is normal class ans: " +i);     //  30
	System.out.println("this is this class ans: " +this.i);   //  refer to current class obj   20
 	System.out.println("this is super class ans: " + super.i);  //  refer to parent class obj   10
		
		
	}
}

public class testUse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		b obj = new b();
		obj.show(30);
	}

}

