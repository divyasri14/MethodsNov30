package mainmethods;

public class ChildMethod {

	public static void main(String[] args) {
		
//void method calling
		
		MainMethod srikanth = new MainMethod();
		srikanth.salary = 1000;
		srikanth.bonous = 2000;
		srikanth.calculatesal1();
		
//int method calling
		MainMethod divya = new MainMethod();
		divya.salary = 100;
		divya.bonous = 2000;
	    int sal = divya.calculatesal2();
	    System.out.println("Totlasalary2:" +sal);
	
	
//int  method with arguments passing in calling code
		MainMethod srinu = new MainMethod();
		int sal1 = srinu.calculatesal3(30,10);
		System.out.println("Totlasalary3:" +sal1);
		
		

//overwritg with local varibles
		MainMethod Moki = new MainMethod();
		Moki.salary = 100;
		Moki.bonous = 2000;
		int sal2 = Moki.calculatesal4(30,10);
		System.out.println("Totlasalary4:" +sal2);
		
//overwritg with class varibles
		MainMethod Tanvi = new MainMethod();
		Tanvi.salary = 100;
		Tanvi.bonous = 2000;
		int sal3 = Tanvi.calculatesal5(10,10);
		System.out.println("Totlasalary5:" +sal3);
	

	}

}
