package superKeyword;

public class animal2 {

	void eat() {
		System.out.println("eating something...");
	}
}
	class dog2 extends animal2 {

		void eat() {
			System.out.println("eating2 something...");
		}
		
		void display() {
			super.eat();
			eat();
		}
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			dog2 d1 = new dog2();
			d1.display();
		}

	}

