package objectClassTest;


class Employee{
	
	int id;
	String name;
	float salary;
	
	void enterData(int objId, String s, float sal) {
		
		id = objId;
		name = s;
		salary = sal;
	}
	
	
	void displayData() {
		
		System.out.println(id +", "+ name+", "+salary);
		
	}
}


class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.enterData(1, "raju", 1000000);
		e1.displayData();
	}

}
