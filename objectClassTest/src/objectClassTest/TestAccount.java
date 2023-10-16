package objectClassTest;


class Account{
	
	int acc_no;
	String name;
	float amount;
	
	void enterData(int no, String s, float amo) {
		
		acc_no = no;
		name = s;
		amount = amo;
				
	}
	
	void deposit(float mony) {
		amount += mony;
		System.out.println(mony +" deposit in your account.");
	}
	
	void withdrow(float mony) {
		if(amount<mony) {
			System.out.println("insufficent balance.");
		}else{
			System.out.println( mony+ " withdrow amount.");
		}
	}
	
	void checkBalance() {
		System.out.println("Balance amount is: "+ amount);
	}
	
	
	void display() {
		System.out.println(amount+" "+ name+" "+acc_no);
	}
}



class TestAccount {

	public static void main(String[] args) {

		Account a1 = new Account();
		a1.enterData(100, "raj", 1000);
		Account a2 = new Account();
		a2.enterData(110, "aaj", 5000);

		a1.deposit(100);
		a1.withdrow(50);
		a1.checkBalance();
		a1.display();
		a2.display();
	}

}
