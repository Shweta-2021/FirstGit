package com.insta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
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
}
