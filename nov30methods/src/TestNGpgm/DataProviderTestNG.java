package TestNGpgm;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {
	
	@Test(dataProvider="getValues")
	
	public void printlogindetails(String userId ,String password) {
		
		System.out.println("userid is"+userId + "Password is" + password);
	}
	
     @Test(dataProvider="getValuesofDifferntDatatypes")
	
	public void printlogindetailsOfDifferntDataTypes(String userId,int id) {
		
		System.out.println("userid is"+userId + "Password is" + id);
	}
     
     @DataProvider
 	
 	public String[][] getValues(){
 		
 		String[][] data = new String[2][2];
 		
 		data[0][0]="ab@gmail.com";
 		data[0][1]="sdfgg";
 		
 		data[1][0]="axb@gmail.com";
 		data[1][1]="zxc";


 		
 		return data;
 		
 	}

     
     
	@DataProvider
	
	public Object[][] getValuesofDifferntDatatypes(){
		
		Object[][] data1 = new Object[4][2];
		
		data1[0][0]="ab@gmail.com";
		data1[0][1]=123;
		
		data1[1][0]="ab@gmail.com";
		data1[1][1]=314;
		data1[2][0]="ab@gmail.com";
		data1[2][1]=123;
		data1[3][0]="ab@gmail.com";
		data1[3][1]=022;
		
		return data1;
		
	}

}
