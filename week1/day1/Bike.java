package week1.day1;

public class Bike {
	
	
	
	public static void main(String[] args) {
		Car c=new Car();
		c.applyBrake();
		c.soundHorn();
		/*commenting the below step as its throwing error because we cannot call the method of 
		 * Car class in bike class, but this is the requirement mentioned in assignment 4 step 9
		Bike b=new Bike();
		b.applyBrake();
		b.soundHorn();
		*/
	}

}
