import java.util.Scanner;

public class CountOddEven {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int evenCount = 0;
		int oddCount = 0;
		
		while(num>0)
		{
			int rem = num%10;
			
			if(rem%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			num = num/10;
		}
		
		System.out.println("Number even numbers "+evenCount);
		System.out.println("Number odd numbers "+oddCount);

	}

}
