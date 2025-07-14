
public class SwapNumber {

	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println("Value of a = " + a + ", Value of b = " + b);

		// Logic 1 - Using third variable
//		int t = a;  //t=10
//		a = b;		//a=20
//		b = t;		//b=10
//		System.out.println("Value of a = "+a+", Value of b = "+b);

		// Logic 2 - Addition & Subtraction
//		a = a + b; 	// 10+20=30
//		b = a - b; 	// 30-20=10
//		a = a - b; 	// 30-10=20
//		System.out.println("Value of a = " + a + ", Value of b = " + b);

		// Logic 3 - Multiplication & Division
//		a = a * b; 	// 10*20=200
//		b = a / b;	// 200/20=10
//		a = a / b;	// 200/10=20
//		System.out.println("Value of a = " + a + ", Value of b = " + b);

		// Logic 4 - Binary XOR
//		a = a ^ b; // 10^20=30
//		b = a ^ b; // 30^20=10
//		a = a ^ b; // 30^10=20
//		System.out.println("Value of a = " + a + ", Value of b = " + b);

		// Logic 5
		b = a + b - (a = b);	//10+20 - 20
		System.out.println("Value of a = " + a + ", Value of b = " + b);

	}

}
