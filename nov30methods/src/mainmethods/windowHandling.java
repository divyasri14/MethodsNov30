package mainmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class windowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver;
		
		//Creating a methos
		
	
			
		//	webdriver.chrome.driver this is varibile where it will invoke the path of chrome and this value at system level
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\chromedriver02122018\\chromedriver.exe");
			
		//instantiation of object
			driver = new ChromeDriver();
			

			driver.manage().window().maximize();
			
			
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
//this is decleared to navigate the pages in between this below code for parent
			String parentWindow = driver.getWindowHandle();
			System.out.println(parentWindow);
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.tagName("button")).click();
			
//This is for child window
			//String ChildWindow;
			
		String	ChildWindow=driver.getWindowHandles().toArray()[1].toString();
			
			System.out.println(ChildWindow);	
			
			driver.switchTo().window(ChildWindow);
			
			
			System.out.println(driver.getTitle());
		
			
			
			driver.close();

//After closing the child window running the paren window			
			driver.switchTo().window(parentWindow);
			
			System.out.println(driver.getTitle());	
			
			
			
			
			
		

	}

}
