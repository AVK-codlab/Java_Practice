package ConditionalStatement;

import java.util.Scanner;

public class ConditionalDemo {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the signal");
		Scanner sc = new Scanner(System.in);
		String signal = sc.nextLine();
		
		String red="red";
		String yellow="yellow";
		
		
		if(signal.contentEquals(red)) {
			System.out.println("Stop the vehicle");
		}
		else if(signal.contentEquals(yellow)) {
			System.out.println("Wait");
		}
		else {
			System.out.println("Go");
		}

	}

}
