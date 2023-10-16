package JavaEncapsulationTest;

public class Account {
	
	private String name, email;
	private int acc_no;
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	
	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email = email;
	}
	
	public int getacc_no() {
		return  acc_no ;
	}
	
	public void setacc_no(int acc_no) {
		this.acc_no = acc_no;
	}

}
