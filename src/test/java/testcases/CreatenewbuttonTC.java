package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.insta.Loginpage;

public class CreatenewbuttonTC {
	public WebDriver driver;
	Loginpage lp;
	
@BeforeMethod
public void setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AVUR08744\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	lp= new Loginpage(driver);
}
@Test
public void logincheck() throws InterruptedException {
	
	lp.setUserName("user");
	Thread.sleep(3000);
	lp.setPassword("pass");
	Thread.sleep(3000);
	lp.login();
}
/*
 * @Test public void forgotpasswordText() { lp.textforgotpassword();
 * 
 * }
 * 
 * 
 */

@AfterMethod
public void tearDown() {
	driver.close();
}







}
