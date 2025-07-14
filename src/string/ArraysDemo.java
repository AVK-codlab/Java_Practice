package string;

import java.util.*;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 5;
		arr[3] = 10;
		arr[4] = 7;
		
		System.out.println("first index is " + arr[1]);
		System.out.println("Fourth index is " + arr[4]);
		
		String str[] = {"TOM","PAUL","JIM","FINN","BRAD"};
		
		System.out.println("first index is " + str[1]);
		System.out.println("Fourth index is " + str[4]);
		
		int l1 = arr.length;
		int l2 = str.length;
		
		System.out.println("Length of array 1 is " + l1);
		System.out.println("Length of array 2 is " + l2);
		
		for(int i=0; i<l1; i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		for(int i=0; i<l1; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
