	package TestNGpgm;
	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
	
	public class guru99Testng {
	
		
		 ChromeDriver driver;
		
		@BeforeClass
		
		public void invokeBrowser() {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\chromedriver02122018\\chromedriver.exe");
			
			
				driver = new ChromeDriver();
				
	
				driver.manage().window().maximize();
				
				driver.manage().deleteAllCookies();
			
				driver.get("http://demo.guru99.com/v4/");
				
		}
		
		
		@AfterClass
		
		public void closeBrowser() {
			
			driver.close();
		}
		
		
		@Test(priority=0)
		
		public void veriftTitle() {
			
			String expectedtiltle= "Guru99 Bank Home Page" ;
			
			String actualTitle= driver.getTitle();
			System.out.println("tiltle is" +actualTitle); 
			Assert.assertEquals(actualTitle, expectedtiltle);
		}
	
		
		
		@Parameters({"userid","password"})
		@Test(priority=1000)
		
		public void loginpage(String userid,String password) {
			
			driver.findElement(By.name("uid")).sendKeys(userid);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("btnLogin")).click();
			
		}
	}
