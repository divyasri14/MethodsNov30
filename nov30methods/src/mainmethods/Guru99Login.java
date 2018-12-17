package mainmethods;


	import java.awt.Dimension;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	
	public class Guru99Login {

		
		//Shotr cut chrome ctr+space bar and here declaring the varible for chrome driver
		
		ChromeDriver driver;
		
		//Creating a methos
		
		public void invokebrowser(){
			
		//	webdriver.chrome.driver this is varibile where it will invoke the path of chrome and this value at system level
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\chromedriver02122018\\chromedriver.exe");
			
		//instantiation of object
			driver = new ChromeDriver();
			
		//For responsive testing we have to give dimensions
//			Dimension dim 	= new  Dimension(400, 526);
//			
	////	
//			driver.manage().window().setSize( dim);
	//	
		//To maximize the chrome
			driver.manage().window().maximize();
			
		//To clear the cookies(donot delete the cookies but bypass the cookies
			
			driver.manage().deleteAllCookies();
		//To call the web page we should give protolcals  like  http,http
			
			driver.get("http://demo.guru99.com/v4/");
			
		}
		
		
		public void getwindowtitle() {
			
		
	System.out.println(driver.getTitle());
			
			
		}
		
		
		public void Guru99login(String userid ,String password) {
			
			driver.findElement(By.name("uid")).sendKeys(userid);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("btnLogin")).click();
			
					}
		public void newcustomer () {
			
			driver.findElement(By.linkText("New Customer")).click();
			
			String email = "vv"+System.currentTimeMillis()+"@gamil.com";
			
			
			
			driver.findElement(By.name("name")).sendKeys("divya");
			driver.findElement(By.xpath("//input[@value = 'f']")).click();
			driver.findElement(By.id("dob")).sendKeys("10-11-1985");
			driver.findElement(By.name("addr")).sendKeys("divya");
			driver.findElement(By.name("city")).sendKeys("Banglore");
			driver.findElement(By.name("state")).sendKeys("Karnataka");
			driver.findElement(By.name("pinno")).sendKeys("123456");
			driver.findElement(By.name("telephoneno")).sendKeys("231456");
			driver.findElement(By.name("emailid")).sendKeys(email);
			driver.findElement(By.name("password")).sendKeys("1234");
			driver.findElement(By.name("sub")).click();
	
			
		
		}
		
		public String getCustomeid(){
			
			return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
			
			
		}
		
		public void addaccount(String Customeid) {
			
			driver.findElement(By.linkText("New Account")).click();
			driver.findElement(By.name("cusid")).sendKeys(Customeid);
			
			
	//to select from drop down button.		
			 WebElement dropdownel =  driver.findElement(By.name("selaccount"));	
			 Select selectAccount = new Select(dropdownel);
			 
			 selectAccount.selectByVisibleText("Savings");
			 
			 driver.findElement(By.name("inideposit")).sendKeys("1000");
			 

			 driver.findElement(By.name("button2")).click();
			 
			 System.out.println(selectAccount.isMultiple());
			 
			 
			System.out.println(selectAccount.getWrappedElement());
			
			

		}
		
		public void logOut() {
			
			driver.findElement(By.linkText("Log out")).click();
//			Alert alert = driver.switchTo().alert();
//			System.out.println(alert.getText());
//			alert.accept();
			
			
			
		}
		
		public void close() {			
		//Close the current active page	
			driver.close();
			
			//Close the all the windows whih are opend by selenium
//			driver.quit();
			
			
		}
		
		
	}

	