package mainmethods;

public class demoAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AmazonProject ap = new AmazonProject();
		
		ap.InvokeBrowser("chrome");
		
		System.out.println(ap.getlinks());
		System.out.println(ap.getcount());
		ap.printalltest();
	}

}
