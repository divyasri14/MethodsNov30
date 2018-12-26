package Exceptions;

public class DemoOfThrowsException {

	public static void main(String[] args) {
		
		thows ex = new thows();
		try {	
		ex.InvokeBrowse("Safar");
		ex.Login();
		ex.adduser();
		ex.logout();
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array exception occured");
		
	}
		
		catch (Exception e) {
			System.out.println("exception occured");
		
	}
		
		finally {
			ex.close();
		}

}
}
