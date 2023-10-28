package week1.day1;

public class Mobile {
	
	public void makeCall()
	{
	 String mobileModel="Samsung";
	 float mobileWeight=150.56f;
	 System.out.println("Mobile Model :" + mobileModel );
	 System.out.println( "Mobile weight :" + mobileWeight +"gm");
	}
	public void sendMsg()
	{
	boolean isFullyCharged=false;
	int mobileCost=15000;
	System.out.println("Is Fully Charged :" + isFullyCharged );
	System.out.println("Mobile Cost :Rs." + mobileCost );
	}

	public static void main(String[] args) {
		
		Mobile m=new Mobile();
		System.out.println("This is my mobile");
		m.makeCall();
		m.sendMsg();
	}

}
