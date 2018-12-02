package mainmethods;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	
	//Shotr cut chrome ctr+space bar and here declaring the varible for chrome driver
	
	ChromeDriver driver;
	
	//Creating a methos
	
	public void invokebrowser(){
		
	//	webdriver.chrome.driver this is varibile where it will invoke the path of chrome and this value at system level
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\chromedriver02122018\\chromedriver.exe");
		
	//instantiation of object
		driver = new ChromeDriver();
		
	//For responsive testing we have to give dimensions
//		Dimension dim 	= new  Dimension(400, 526);
//		
////	
//		driver.manage().window().setSize( dim);
//	
	//To maximize the chrome
		driver.manage().window().maximize();
		
	//To clear the cookies(donot delete the cookies but bypass the cookies
		
		driver.manage().deleteAllCookies();
	//To call the web page we should give protolcals  like  http,http
		
		driver.get("https://en-gb.facebook.com/login/");
		
	}
	
	
	public void getwindowtitle() {
		
	
System.out.println(driver.getTitle());
		
		
	}
	
	
	public void Facebooklogin(String usrid ,String password) {
		
		driver.findElement(By.id("email")).sendKeys(usrid);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		
				}
	public void close() {
		
	//Close the current active page	
		driver.close();
		
		//Close the all the windows whih are opend by selenium
//		driver.quit();
		
		
	}
	
	
}
