package mainmethods;

public class ChildMethod1 {

	public static void main(String[] args) {
	
		MainMethod1 Mul1 = new MainMethod1();
		
		Mul1.A = 10;
		Mul1.B = 20 ;
		
		Mul1.Multiplication1();
		
		//----------------
		
		
		MainMethod1 Mul2 = new MainMethod1();
		
		Mul2.A = 15;
		Mul2.B = 25 ;
		
		int Multivalue = Mul2.Multiplication2();
		
		System.out.println("Multivalues :" +Multivalue);
		
	if  (Multivalue == 375)
	
				{
		
		System.out.println("print this value :" +Multivalue);
		
				}
//---------------------------------------------
	MainMethod1 div = new MainMethod1();
	
	int divvalue = div.Multiplication3(10,5);
	
	System.out.println("Divisionvalue :" +divvalue);
	
if  (Multivalue == 375 && divvalue == 2 )

			{
	
	System.out.println("print this value :" +Multivalue);
	
			}
else
{
	
	System.out.println("print this value1 :" +divvalue);
}
	
	
	
//-----------------------------	
	
	MainMethod1 ADD1 = new MainMethod1();
	ADD1.A = 6;
	ADD1.B = 5;			
	int addvalue = ADD1.Multiplication4(10,5);
	
	System.out.println("ADDvalue :" +addvalue);
//--------------------------------------

	MainMethod1 ADD2 = new MainMethod1();
	ADD2.A = 6;
	ADD2.B = 5;			
	int addvalue1 = ADD2.Multiplication5(10,5);
	
	System.out.println("ADDvalue1 :" +addvalue1);
	
//-----------------------------
	MainMethod1 cons = new MainMethod1(10,105);
	cons.A = 5;
	cons.B = 5;			
   cons. Multiplication1();
  
	

	
		
	
	}
		
}
