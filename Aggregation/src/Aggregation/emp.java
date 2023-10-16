package Aggregation;
public class emp {

	int id;
	String name;
	address Address;

	public emp (int id, String name, address Address) {
		this.id = id;
		this.name = name;
		this.Address = Address; 
	}
	
	void display() {
		System.out.println(id + " " + name);
		System.out.println(Address.city+" "+ Address.country+" "+ Address.state);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		address a1 = new address("dewas", "india", "MP");
		emp e = new emp(01, "ravi", a1);
		
		e.display();

	}

}


//In this example, Employee has an object of Address, address object contains its own informations such as city, state, country etc. In such case relationship is Employee HAS-A address.