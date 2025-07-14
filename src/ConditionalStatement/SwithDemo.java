package ConditionalStatement;

import java.util.Scanner;

public class SwithDemo {

	public static void main(String[] args){
		
		System.out.println("Enter the number");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String day = null;
		
		switch(num){
		case 1:
			day="Sunday";
			break;
		
		case 2:
			day="Monday";
			break;
		case 3:
			day="Tuesday";
			break;
		case 4:
			day="Wednesday";
			break;
		case 5:
			day="Thursday";
			break;
		case 6:
			day="Friday";
			break;
		case 7:
			day="Saturday";
			break;			
		
		}
		
		if(num>7) {
			System.out.println("Enter a valid number");
		}
		else {
			System.out.println("The day at " + num + " is " + day);
		}
	}	
}
