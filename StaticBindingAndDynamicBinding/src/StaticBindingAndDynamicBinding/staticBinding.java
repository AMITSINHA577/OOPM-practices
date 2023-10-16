package StaticBindingAndDynamicBinding;

class dog{
	void eat() {
		System.out.println("dog is eating....");
	}
}


public class staticBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog d1 = new dog();
		d1.eat();
	}

}

//When type of the object is determined at compiled time(by the compiler), it is known as static binding.
//If there is any private, final or static method in a class, there is static binding.