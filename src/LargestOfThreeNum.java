import java.util.Scanner;

public class LargestOfThreeNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Enter third number");
		int c = sc.nextInt();
		
		sc.close();
		
		if(a>b && a>c)
		{
			System.out.println("Largest number is "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Largest number is "+b);
		}
		else
		{
			System.out.println("Largest number is "+c);
		}

	}

}
