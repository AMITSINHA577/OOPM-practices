package JavaInterfaceTest;

interface printable{
	void print();
}

interface showable{
	void show();
}


class A implements printable,showable{
	public void print() {System.out.println("printable..");};
	public void show() {System.out.println("showable...");};
}

public class multipalInhe__Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new A();
		a1.print();
		a1.show();

	}

}
