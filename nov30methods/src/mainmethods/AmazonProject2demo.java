package mainmethods;

public class AmazonProject2demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		AmazonProject2 ap = new AmazonProject2();
		
		ap.InvokeBrowser("chrome");
		
		ap.serachAnElement ("snuggles","Baby");	
//		ap.toFindnthProduct(3);
//        ap.printAllProduct();
        ap.printAllProductWithScorllDown();
	}

}
