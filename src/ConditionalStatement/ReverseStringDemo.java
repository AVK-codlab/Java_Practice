package ConditionalStatement;

import java.util.Scanner;

public class ReverseStringDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverse = reverseMethod(str);
		System.out.println("Reversed string is " + reverse);
	}
	
	public static String reverseMethod(String s) {
		String reverse = "";
		if(s.length()==0 || s == null) {
			System.out.println("Empty or null string");
			reverse = null;
		}
		
		else if(s.length() == 1) {
			reverse = s;
		}
		
		else {
			String array[] = s.split("\\s+");
			
			for(String item : array) {
				reverse = item + " " + reverse;
			}
		}
		return reverse;
	}

}
