package mainmethods;

public class MainMethod1 {
//Constructor with default
	public MainMethod1() {
		int A = 50;
		int B = 50;
	System.out.println("These are constructor values");
	}
//Contructor with arguments(Method overloading)
	public MainMethod1(int A, int B) {
		this.A = A;
		this.B = B;
	
			System.out.println("These are overwriting constructor values");
			}
	
	
	
	
	int A;
	int B;
	
	public void Multiplication1() {
		
		System.out.println("A value:" +A);
		System.out.println("B value:" +B);
		int C = A * B;
		System.out.println("C value:" +C);

	}

	int Multiplication2() {
		
		System.out.println("A value:" +A);
		System.out.println("B value:" +B);
		int C1 = A * B;
		return C1 ;		
	}

	int Multiplication3(int D ,int E) {
		
		System.out.println("D value:" +D);
		System.out.println("E value:" +E);
		int DIV = D / E;
		return DIV;
		
		
	}

	
int Multiplication4(int A ,int B) {
		
		System.out.println("A value:" +A);
		System.out.println("B value:" +B);
		int ADD = A+B;
		return ADD;
		
		
	}

int Multiplication5(int A ,int B) {
	
	System.out.println("A value:" +A);
	System.out.println("B value:" +B);
	int ADD1 = this.A+this.B;
	return ADD1;
	
	
}
}





