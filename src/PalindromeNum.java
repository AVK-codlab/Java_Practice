import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int org_num = num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		
		if(org_num == rev) {
			System.out.println(org_num +" is a palindrome number");
		}
		else {
			System.out.println(org_num +" is not a palindrome number");
		}
	}

}
