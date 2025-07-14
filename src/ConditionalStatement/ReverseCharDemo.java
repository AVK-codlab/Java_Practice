package ConditionalStatement;

import java.util.Scanner;

public class ReverseCharDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");

		String input = sc.nextLine();
		while (input.isEmpty() || input == null) {
			System.out.println("Enter valid string");
			input = sc.nextLine();
		}
		sc.close();

		String reverse = reverseChar(input);
		System.out.println("Reversed output is " + reverse);

	}

	public static String reverseChar(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}

		return output;
	}
}
