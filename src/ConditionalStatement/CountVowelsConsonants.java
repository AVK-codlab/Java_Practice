package ConditionalStatement;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {

		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		while(input.isEmpty() || input == null) {
			System.out.println("Enter a valid string");
			input = sc.nextLine();
		}
		sc.close();
		
		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i <= input.length()-1; i++) {
			char ch = input.charAt(i);

			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'u' || ch == 'U') {
				vowels++;
			}
			else if((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z')) {
				consonants++;
			}
		}
		
		System.out.println("No of vowels is " +vowels);
		System.out.println("No of consonants is " +consonants);
	}

}
