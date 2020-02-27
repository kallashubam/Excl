package VRM;



import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//import javax.xml.bind.JAXBElement.GlobalScope;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;  


 public class Browserswitch

{

	 static WebDriver driver;
	 WebElement Firstname;
	private Scanner input;
	 public   void Login() 
	 {
		/*System.setProperty("webdriver.gecko.driver","D:\\Shubam automation\\geckodriver.exe");
	    driver = new FirefoxDriver();*/
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	          
		 
		driver.get("http://staging.exclusife.com");
	    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"buser\"]")).sendKeys("7780877314");
	    driver.findElement(By.xpath("//input[@class='get-started-btna large']")).click();
	   }
	 
	 public  void OTP() throws InterruptedException
	 {    	
		 	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//*[@id=\"aTextbox1\"]")).sendKeys("070385"); //enter otp
	        driver.findElement(By.xpath("//*[@id=\"aTextbox\"]")).sendKeys("123456"); //enter passwrd
	        driver.findElement(By.xpath("//*[@id=\"subclick\"]")).click();
     } 
 public void click_Register() 
 
 {
	 driver.findElement(By.id("registerlink")).click();
	    	System.out.print("Enter Mobile Number");
	 		input = new Scanner(System.in);
	 		String Mobile_Number = input.next();
	 driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(Mobile_Number);
	    driver.findElement(By.xpath("//input[@value='Register']")).click();
	    
          
	   
}
	 public  void Register_Customer() throws InterruptedException
	 {
		 Firstname=driver.findElement(By.cssSelector("input#name"));
 		Firstname.clear();
		    
				Firstname.sendKeys("Shubam");// firstName
		    		
				 driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("kalla");	
	        driver.findElement(By.id("customer_address")).clear(); 
	        driver.findElement(By.id("customer_address")).sendKeys("Noida Sec 63");// Address
		     
 		    Select dropdown = new Select(driver.findElement(By.id("gender")));// gender selection 
                 dropdown.selectByVisibleText("Male"); // gender 
                 driver.findElement(By.id("popupDatepicker")).click();
                 Thread.sleep(2000);
                Select  yeardropdown= new Select(driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/div/div/select[2]"))); 
      		   yeardropdown.selectByVisibleText("2005"); 
      		 Select  monthdropdown= new Select(driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/div/div/select[1]"))); 
             monthdropdown.selectByVisibleText("September");
             driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/div/table/tbody/tr/td/a[contains(text(),\"23\")]")).click();

             //driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/div/table/tbody/tr[4]/td[7]/a")).click();	
             driver.findElement(By.id("sale_amount")).sendKeys("1000");
             //Thread.sleep(1000);
            // driver.findElement(By.xpath("//*[@id=\"register_customer\"]/div[2]/div[7]/div/input[3]")).click();
          
	 }

	 public void Save_Details() 
	 {
         driver.findElement(By.xpath("//*[@id=\"register_customer\"]/div[2]/div[7]/div/input[3]")).click();

		 
	 }
	 
	 public void ShowCustomer_Details() 
	 {

         driver.findElement(By.xpath("//*[@id=\"vmenu\"]/ul/li[4]/a/span")).click();
         driver.findElement(By.xpath("//*[@id=\"vhld\"]/div/section/div[2]/table/tbody/tr[2]/td[1]/a")).click();
         JavascriptExecutor jse = (JavascriptExecutor)driver;
         jse.executeScript("window.scrollBy(0,250)");
		 
	 }	

      public void Welcome_Campaign() 
       
      {	 
          
          
    	 
	 
	 
 }	 
		 
} 
 	
	 
 
