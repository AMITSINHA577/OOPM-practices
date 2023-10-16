package objectClassTest;


class fact{
	
	int num;
	int temp = 1;
	
	void calFact(int n) {
		num = n;
		
	}
	void display() {
		for(int i=1;i<=num;i++) {
			temp *= i;
		}
		System.out.println(temp);
	}
}



public class anonymousObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fact f1 = new fact();
		f1.calFact(5);
		f1.display();

	}

}
