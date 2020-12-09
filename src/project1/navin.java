package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class navin {
	WebDriver driver;
	@BeforeTest
	public void setup_method() {
		System.setProperty("webdriver.chrome.driver","F:\\software\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    //driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com");
	}

	@Test
	public void verify_page_title()
	{
	String actTitle=driver.getTitle();
	System.out.println(actTitle);
	String expTitle="Facebook – log in or sign up";		
	Assert.assertEquals(actTitle,expTitle,"same" );
	
	}
	
	@AfterTest
	public void roser_close() {
		driver.close();
	}
	

	
}