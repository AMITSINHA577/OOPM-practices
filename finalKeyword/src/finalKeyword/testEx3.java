package finalKeyword;

//if we creat any final class we cannot override

final class testfinal2{  // yaha final kiya h isliye error aa raha h Q ki final class ko overrid nah kar sakte h
	
    void m1() {    
		System.out.println("this is main class");
	}
}

//class testrefinal3 extends testfinal2{
//	
//	void m1() {
//		System.out.println("this is extends class");
//	}
//}

public class testEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testrefinal1 f1 = new testrefinal1();
		f1.m1();

	}

}
