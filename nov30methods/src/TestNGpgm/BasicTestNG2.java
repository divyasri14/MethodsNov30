	package TestNGpgm;
	
	import org.openqa.grid.internal.listeners.Prioritizer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
	
	public class BasicTestNG2 {
	 
		@Test(priority = 2,groups= {"Sanity"} )
		       
		public void testcase1() {
			
			System.out.println("print testcase1 of class2");
		}
	@Test(priority = -1)
		
		public void testcase2() {
			
			System.out.println("print testcase2 of class2");
		}
		
	@Test(priority = 0,groups={"Regression"})
	
	public void testcase3() {
		
		System.out.println("print testcase3 of class2");
	}
	
	
	@Test(priority = 100,enabled = false)
	
	public void testcase4() {
		
		System.out.println("print testcase4");
	}
	
	@AfterMethod
	
	public void afteraTestcase() {
		
		System.out.println("Excute after every Testcase of class2");
	}
	
   @BeforeMethod
	
	public void beforeaTestcase() {
		
		System.out.println("Excute before every Testcase of class 2");
	}
   
   @AfterClass(alwaysRun = true)
   
   public void atEndClass() {
	   
	   System.out.println("at end of classes of class2");
   }
		
   @BeforeClass(alwaysRun = true)
   public void atFirstClass() {
	   
	   System.out.println("load the begging of the classes of class2");
   }
   
   
   
	}
