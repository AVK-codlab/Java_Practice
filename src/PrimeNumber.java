import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int count = 0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println(num+" is a prime number");
			}
			else
			{
				System.out.println(num+" is not a prime number");
			}
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}

	}

}
