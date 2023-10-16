package constructorInJava;

//Let us see another example of default constructor  
//which displays the default values 
public class defaultConstructor {
	
	int id;
	String name;
	

	//method to display the value of id and name  
	void display() {
		System.out.println(id +" " + name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating objects
		defaultConstructor d1 = new defaultConstructor();
		
		//displaying values of the object 
		d1.display();
		
	}

}
