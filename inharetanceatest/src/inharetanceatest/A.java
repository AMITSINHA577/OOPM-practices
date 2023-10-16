package inharetanceatest;

class x 
{

	void showx()
	{
		System.out.println("this is showx class methode");
	}

}

class y extends x
{

	void showy()
	{
		System.out.println("this is showy class methode");
	}

	
}

class z extends x
{

	void showz()
	{
		System.out.println("this is showz class methode");
	}

	
}

public class A
{
	public static void main(String [] args)
	{
		z a1 = new z();
		a1.showx();
//		a1.showy();
		a1.showz();
		
		y y1 = new y();
		y1.showy();

	}


}