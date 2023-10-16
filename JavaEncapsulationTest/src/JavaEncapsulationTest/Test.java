package JavaEncapsulationTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setname("amit", "Sinha");
		System.out.println(s1.getname());

	}

}


//Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

//We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

//It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.The encapsulate class is easy to test. So, it is better for unit testing.