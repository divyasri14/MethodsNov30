package Exceptions;

public class ExceptionHandle {

	public static void main(String[] args) {
		
		try {
			
			for (int i =0 ;i <=5;i++) {
				
				int[] arr = new int[5];
				
				arr[0] = 5;
				arr[1] = 23;
				arr[2] = 125;
				arr[3] = 153;
				arr[4] = 146546;	
				
				System.out.println(arr[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("throwing Array exception");
		}
		
		finally {
			System.out.println("it will execute irrespective of exception occurs or not");
		}
	
	System.out.println("after Exception also executing this line");
	}

}
