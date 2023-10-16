package staticKeyword;

class studentsDetiles{
	
	int id;
	String name;
	static String collage = "MITM";
	
	studentsDetiles( int id, String name){
		
		this.id = id;
		this.name = name;
	}
	
	void dispaly() {
		System.out.println("this is my name my id and collahe name"+ name+", "+ id+", "+collage);
	}
}

public class testStatic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		studentsDetiles s1 = new studentsDetiles(01, "amit sinha");
		studentsDetiles s2 = new studentsDetiles(02, "raj sinha");
		studentsDetiles s3 = new studentsDetiles(03, "manoj sinha");
		
		s1.dispaly();
		s2.dispaly();
		s3.dispaly();

	}

}
