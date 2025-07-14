package ConditionalStatement;

import java.util.Scanner;

public class ReverseChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String original = sc.nextLine();
		
		while(original.isEmpty() || original == null) {
			System.out.println("Enter a valid string");
			original = sc.nextLine();
		}
		sc.close();
		
		ReverseChar output = new ReverseChar();
		String outputString = output.reverseCharacter(original);
		System.out.println(outputString);
	}
	
	private String reverseCharacter(String input) {
		String reverse ="";
		
		for(int i = input.length()-1; i>=0; i--) {
			reverse = reverse + input.charAt(i); 
		}
		
		return reverse;
	}

}
