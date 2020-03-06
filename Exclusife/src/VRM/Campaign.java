package VRM;

public class Campaign {

	public static void main(String[] args) throws InterruptedException  
	
	
	
	{
		Browserswitch Bs= new Browserswitch();
		Bs.Login();
		Thread.sleep(2000);
		Bs.OTP();
		Thread.sleep(5000);
		//Bs.Welcome_Campaign();
		Bs.Birthday_Wish();
    }
}
