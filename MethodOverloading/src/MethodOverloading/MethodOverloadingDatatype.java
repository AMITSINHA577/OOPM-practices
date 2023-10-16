package MethodOverloading;

public class MethodOverloadingDatatype {
	
	void student(int id, String name) {
		System.out.println(id +" "+name);
	}
	
	void student(int id, String name, float numbers) {
		System.out.println(id +" "+name+" "+ numbers );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingDatatype m1 = new MethodOverloadingDatatype();
		m1.student(01, "amit sinha");
		m1.student(02, "raj sinha", 10.4f);

	}

}
