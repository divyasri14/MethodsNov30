package mainmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver;
		
		//Creating a methos
		
	
			
		//	webdriver.chrome.driver this is varibile where it will invoke the path of chrome and this value at system level
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\chromedriver02122018\\chromedriver.exe");
			
		//instantiation of object
			driver = new ChromeDriver();
			

			driver.manage().window().maximize();
			
			
			driver.get("https://jqueryui.com/droppable/");
		
			//frames using webelement
			WebElement dragDrop = driver.findElement(By.className("demo-frame"));
			
			driver.switchTo().frame(dragDrop);
			
			WebElement source= driver.findElement(By.id("draggable"));
			

			WebElement target= driver.findElement(By.id("droppable"));
			
			Actions action = new Actions(driver);
			// one way to draganddrop
			//action.dragAndDrop(source, target).build().perform();
			String clorBeforeDropping =  source.getCssValue("color");
			//second way
			action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
			String clorAfterDropping =  target.getCssValue("color");
			
			System.out.println(clorBeforeDropping);
			System.out.println(clorAfterDropping);
			
			
			
			
	}

}
