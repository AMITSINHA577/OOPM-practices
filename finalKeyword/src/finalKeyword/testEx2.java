package finalKeyword;

//if we creat any final methode we cannot override

class testfinal1{
	
//    final void m1() {   // yaha final kiya h isliye error aa raha h Q ki final methode ko overrid nah kar sakte h 
//		System.out.println("this is main class");
//	}
}

class testrefinal1 extends testfinal1{
	
	void m1() {
		System.out.println("this is extends class");
	}
}

public class testEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testrefinal1 f1 = new testrefinal1();
		f1.m1();

	}

}
