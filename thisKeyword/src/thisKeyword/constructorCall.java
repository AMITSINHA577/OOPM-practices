package thisKeyword;

public class constructorCall {
	
	int id;
	String name, sub;
	float fee;
	
	constructorCall(int id, String name, String sub) {
		
		this.id = id;
		this.name = name;
		this.sub = sub;
	}
	
	constructorCall(int id, String name, String sub, float fee) {
		this(id, name, sub);//reusing constructor
		this.fee = fee;
	}
	
	void display() {
		System.out.println(id+" "+ name+" "+ sub+" " + fee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructorCall c1 = new constructorCall(001,"suraj", "Math");
		constructorCall c2 = new constructorCall(001,"sonu", "java",2000000.0f);
		c1.display();
		c2.display();
	}

}
