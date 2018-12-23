package mainmethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonProject {

	
	WebDriver Driver;
	List<WebElement> allink;
	
	
	public void InvokeBrowser(String Browsertype){
		
		if(Browsertype.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\chromedriver02122018\\chromedriver.exe");
		Driver = new  ChromeDriver();
		
		} 
		else if(Browsertype.equals("edge")) {
				
				System.setProperty("webdriver.edge.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\edgedriver\\MicrosoftWebDriver.exe");
				Driver = new  EdgeDriver();
		}
		
		
		
	
			
		Driver.manage().window().maximize();
		
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.get("https://www.amazon.in/");


		
	}
//URl of an webelement
public String getlinks() {
	//to get the attribute of an web element
	
	String url = Driver.findElement(By.linkText("Your Amazon.in")).getAttribute("class");
	return url;
}


//size of link test
public int getcount() {
	
	allink=  Driver.findElements(By.tagName("a"));
	
	return allink.size();
	
}

public  void printalltest() {
	//enhanced for loop syn for(WebElement tempvarible :allink) and in input some doesnot have linktest those are images
	
	for(WebElement List :allink) {
		System.out.println("Link of text:  " + List.getText()+"hrefis" + List.getAttribute("id"));
		
	}
	
	
	
}
}





