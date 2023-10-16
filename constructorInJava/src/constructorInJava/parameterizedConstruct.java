package constructorInJava;

//Java Program to demonstrate the use of the parameterized constructor.
public class parameterizedConstruct {
	
	int id;
	String name;
	
	//creating a parameterized constructor  
	void pConstructor(int i , String s) {
		id = i;
		name = s;
	}
	
	 //method to display the values 
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating objects and passing values
		parameterizedConstruct p1 = new parameterizedConstruct();
		p1.pConstructor(10, "Amit");
		//calling method to display the values of object
		p1.display();

	}

}
