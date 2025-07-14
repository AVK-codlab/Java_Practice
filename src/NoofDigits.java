import java.util.Scanner;

public class NoofDigits {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int org_num = num;
		
		int count=0;
		
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("No of digits in "+org_num+" is "+count);

	}

}
