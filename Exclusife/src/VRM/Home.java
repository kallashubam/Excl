package VRM;

public class Home {

	public static void main(String[] args) throws InterruptedException  
	
	
	
	{
		Browserswitch Bs= new Browserswitch();
		Bs.Login();
		Thread.sleep(5000);
		Bs.OTP();
		//Bs.click_Register();
		//Bs.Register_Customer();
		//Bs.Save_Details();
		Thread.sleep(10000);
		//Bs.ShowCustomer_Details();
		Bs.Welcome_Campaign();
    }
}


