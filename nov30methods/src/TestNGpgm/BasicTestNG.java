	package TestNGpgm;
	
	import org.openqa.grid.internal.listeners.Prioritizer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
	
	public class BasicTestNG {
	 
		@Test(priority = 2)
		
		public void testcase1() {
			
			System.out.println("print testcase1");
		}
	@Test(priority = -1,groups={"Sanity","Regression"})
		
		public void testcase2() {
			
			System.out.println("print testcase2");
		}
		
	@Test(priority = 0)
	
	public void testcase3() {
		
		System.out.println("print testcase3");
	}
	
	
	@Test(priority = 100,enabled = false)
	
	public void testcase4() {
		
		System.out.println("print testcase4");
	}
	
	@AfterMethod
	
	public void afteraTestcase() {
		
		System.out.println("Excute after every Testcase");
	}
	
   @BeforeMethod(alwaysRun = true)
	
	public void beforeaTestcase() {
		
		System.out.println("Excute before every Testcase");
	}
   
   @AfterClass(alwaysRun = true)
   
   public void atEndClass() {
	   
	   System.out.println("at end of classes");
   }
		
   @BeforeClass
   public void atFirstClass() {
	   
	   System.out.println("load the begging of the classes");
   }
   
   
   
	}
