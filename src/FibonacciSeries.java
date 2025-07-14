
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n = 10;
		int num1 = 0;
		int num2 = 1;
		int nextNum;
		
		for(int i =1;i<=n;i++) {
			System.out.println(num1);
			nextNum = num1 + num2;
			
			num1 = num2;
			num2 = nextNum;
		}

	}

}
