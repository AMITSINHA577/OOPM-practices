package JavaEncapsulationTest;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.setname("amit sinha");
		a1.setemail("ammitSinha@gmail.com");
		a1.setacc_no(123);

		System.out.println(a1.getname());
		System.out.println(a1.getemail());
		System.out.println(a1.getacc_no());
	}

}
