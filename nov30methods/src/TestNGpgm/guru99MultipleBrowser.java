	package TestNGpgm;
	
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
	
	public class guru99MultipleBrowser {
	
		
		 WebDriver driver;
		 
		 
		@Parameters({"browsertype"})
		@BeforeClass
	
		
		public void InvokeBrowser(String BrowserType) {
		
if(BrowserType.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\chromedriver02122018\\chromedriver.exe");
			driver = new  ChromeDriver();
			
			} 
			else if(BrowserType.equals("edge")) {
					
					System.setProperty("webdriver.edge.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\edgedriver\\MicrosoftWebDriver.exe");
					driver = new  EdgeDriver();
			}
			
			
			
		
				
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
//			Driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
//			
//			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
