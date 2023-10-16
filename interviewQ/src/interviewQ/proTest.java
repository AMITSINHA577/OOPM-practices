package interviewQ;

public class proTest {

public static void main(String[] args) {
		
		String n = "my name is amit ";

		String rev = "";
		char s[] = n.toCharArray(); // created a char array
		
		for(int i=s.length-1;i>=0;i--) {
			rev +=s[i];
		}
		System.out.println(rev);
	}
}