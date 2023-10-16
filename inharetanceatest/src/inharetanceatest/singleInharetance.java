package inharetanceatest;


class sun{
	void sunName() {
		System.out.println("my name is amit");
	}
}


class doughter extends sun{
	void doughterName() {
		System.out.println("my name is radhika");
	}
}

public class singleInharetance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		doughter d1 = new doughter();
		d1.sunName();
		d1.doughterName();
	}

}
