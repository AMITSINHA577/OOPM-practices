package JavaEncapsulationTest; 
public class Student {
	
	private String name1;
	private String name2;
	
	public String getname() {
		String name = name1 + name2;
		return name ;
		
	}
	
	public void setname(String name1, String name2) {
		this.name1 = name1;
		this.name2 = name2;
	}
	

}
