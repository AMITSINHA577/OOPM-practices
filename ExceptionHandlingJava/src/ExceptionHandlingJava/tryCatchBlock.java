package ExceptionHandlingJava;

//public class tryCatchBlock {
//
//	public static void main(String[] args) {
//		
//		try {
//
//			int a = 100;
//			int b = 0;
//			int c = a/b;
//			System.out.println(c);
//
//			
//		} catch (Exception e) {
//
//			System.out.println(e);
//		}
//	}
//
//}


//ex


//try{    
//	//code that may throw an exception 
//    risky code 
//	}catch(Exception_class_Name ref){
//	handling code
//}  




//finaly............

//Java finally block is always executed whether an exception is handled or not. Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.

//public class tryCatchBlock {
//
//	public static void main(String[] args) {
//		
//		try {
//
//			int a = 100;
//			int b = 0;
//			int c = a/b;
//			System.out.println(c);
//
//			
//		} catch (Exception e) {
//
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("i am in finally bolck...");
//		}
//	}
//
//}
//



//difference between final finally and finalize

//1 final 

//keyword,  use with  (variable, methode, class),   	Final method is executed upon its call.,    


//2  finally

//block,  use with try and catch,    "Finally" block executes just after the execution of"try-catch" block.

//3  finalize

// methode, methode with overwride,   finalize() method executes just before the destruction of the object.



//difference between Throw and Throws


//Throw.......
//This keyword is used for explicitly throwing an exception.
//this keyword use for runtime or  unchecked exceptions using the throw keyword.
//You have to use the throw keyword inside any method.

//use only single exception hendling
//or is me new keyword ka use karte h 
//we cannot write any statement after throw keyword...


//Throws.....
//This keyword is used for declaring any exception.
//this keyword use for compiletime or  checked exceptions using throws keyword.
//You have to use the throws keyword with any signture (methode k sath he methode k aandar nahi ) of the method.
//use multipal exception hendling by , coma seprated

//or is me new keyword ka use nahi karte h 

//but throws me is koi rule nahi h ki (//we cannot write any statement after throw keyword...)