package mainmethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonProject2 {

	
	private static final boolean WebElement = false;
	WebDriver Driver;
	//List<WebElement> allink;
	
	
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
	
	public void serachAnElement (String product,String catrgory) {
		
		
		Driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		WebElement Dropdown = Driver.findElement(By.id("searchDropdownBox"));
		Select selctbycategory = new Select(Dropdown);
		Driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']/input[@value='Go']")).click();
		String searchresultCount = Driver.findElement(By.id("s-result-count")).getText();
		
		System.out.println("Result: "+ searchresultCount);
	}
		
		public void toFindnthProduct(int itemnumber) {
			
			String partialDynamicxpathe = String.format("//ul[@id='s-results-list-atf']/li[@id='result_%d']",(itemnumber-1));
			
			
			System.out.println(Driver.findElement
					(By.xpath(partialDynamicxpathe)).getText());
			
		}
		
		public void printAllProduct() {
			
			
			List<WebElement> x = Driver.findElements(By.xpath("//ul[@id='s-results-list-atf']/li"));
			for (WebElement product : x) {
				
				System.out.println("-------------------------------------");
		
			System.out.println("Listof allelemnt" +product.getText());
		}
			
		}
		public void printAllProductWithScorllDown() {
				
				
				List<WebElement> x = Driver.findElements(By.xpath("//ul[@id='s-results-list-atf']/li"));
				Actions action = new Actions(Driver);
						
						for (WebElement product : x) {
							
						action.moveToElement(product).build().perform();					
					System.out.println("-------------------------------------");
			
				System.out.println("Listof allelemnt" +product.getText());
			
		}
		
		
}
//		
//		public void printAllProductWithScorllDownwithjava() {
//			
//			
//			List<WebElement> x = Driver.findElements(By.xpath("//ul[@id='s-results-list-atf']/li"));
//			int A,B;
//			
//		
//					for (WebElement product : x) {
//						A =product.getLocation().a;
//						B =product.getLocation().b; 
//						
//						scrollDown(A,B);
//										
//				System.out.println("-------------------------------------");
//		
//			System.out.println("Listof allelemnt" +product.getText());
//		
//	}
//	
//	
//}
//		private void printAllProductswithJavaScript(int a,int b) {
//			
//			JavascriptExecutor jsEngine;
//			String jsCommand;
//			
//			jsEngine =  (JavascriptExecutor)Driver;
//			jsCommand = String.format("Window.scrollBy(%d,%d)",a,b);
//			jsEngine.executeScript(jsCommand);
//			
//			
//			
//			
//			
//			
//		}
}
