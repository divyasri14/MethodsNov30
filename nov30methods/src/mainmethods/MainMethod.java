package mainmethods;

public class MainMethod {

	int salary;
	int bonous;
	
	//Void method defining
	
public void calculatesal1 () {
		
		System.out.println("Salary:" +salary);
		System.out.println("Salary:" +bonous);
		int TotalSal = salary + bonous;
		System.out.println("TotalSalary is :" +TotalSal);
	}

	
//Int method defining
int  calculatesal2 () {
		
		System.out.println("Salary:" +salary);
		System.out.println("Salary:" +bonous);
		int TotalSal1 = salary + bonous;
		return TotalSal1;
		
	}

//int  method with arguments passing in calling code
int  calculatesal3 (int sal, int bon) {	
		int TotalSal2 = sal + bon;
		return TotalSal2;
}
		
//Overwriting the local varibles
int  calculatesal4 (int salary, int bonous) {
			
			int TotalSal3 = salary + bonous;
			return TotalSal3;
		
	}

//Overwriting the class varibles
int  calculatesal5 (int salary, int bonous) {
	
	int TotalSal4 = this.salary + this.bonous;
	return TotalSal4;

}

}
