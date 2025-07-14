package ConditionalStatement;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.nextLine();
		
		while(input.length()==0 || input == null) {
			System.out.println("Enter a valid string");
			input = sc.nextLine();
		}
		sc.close();
		
		String output = palindrome(input);
		System.out.println(output);
		
		if(input.equalsIgnoreCase(output)) {
			System.out.println(input + " is a palindrome");
		}
		else {
			System.out.println(input + " is not a palindrome");
		}

	}
	
	public static String palindrome(String input) {
		String reverse = "";
		
		for(int i = input.length()-1; i>=0; i--) {
			reverse = reverse + input.charAt(i);
		}
		return reverse;
	}

}
