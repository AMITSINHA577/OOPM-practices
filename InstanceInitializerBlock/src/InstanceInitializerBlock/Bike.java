package InstanceInitializerBlock;
public class Bike {
	int speed ;
	
	Bike(){
		System.out.println("speed of bike: "+ speed);
	}
	
	{speed = 200;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike();
		

	}

}


//Suppose I have to perform some operations while assigning value to instance data member e.g. a for loop to fill a complex array or error handling etc.