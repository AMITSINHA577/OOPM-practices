package StaticBindingAndDynamicBinding;

class dog5{
	
	void eat() {
		System.out.println("dog is eating...");
	}

}

class cat extends dog5{
	
	void eat() {
		System.out.println("cat is eating...");
	}
}


public class dynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c1 = new cat();
		c1.eat();

	}

}


//When type of the object is determined at run-time, it is known as dynamic binding