package Exceptions;

public class thows {
	
	
	public void InvokeBrowse(String BrowserType) throws Exception{
		if (BrowserType.equals("chrome")) {
			
			System.out.println("Execute Chrome");
		} 
		else if (BrowserType.equals("edge")) {
			
			System.out.println("Execute edge");
		}
		else {
			throw new Exception("invalid Browser type" +BrowserType);
		}
		
		
		System.out.println("InvokeBrowser is sucess");
	}
    public void Login() throws ArrayIndexOutOfBoundsException {
    	
    	

			
			for (int i =0 ;i <=5;i++) {
				
				int[] arr = new int[5];
				
				arr[0] = 5;
				arr[1] = 23;
				arr[2] = 125;
				arr[3] = 153;
				arr[4] = 146546;	
				
				System.out.println(arr[i]);
			}	
			
	
		
		
		System.out.println("Login is sucess");
	
    }
   public void adduser() {
		
		System.out.println("adduser is sucess");
	}
   
   public void logout() {
		
		System.out.println("logout is sucess");
	}
   public void close() {
		
		System.out.println(""
				+ "close is sucess");
	}
	

}
