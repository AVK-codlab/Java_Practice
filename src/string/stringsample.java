package string;

import java.util.Arrays;

public class stringsample {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2=" World";
		String str = new String("Welcome");
		String str3 = str;
		
		int arr[] = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
	
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		char arr1[]= str1.toCharArray();
		for(int i=0; i<arr1.length; i++) {
		System.out.println(arr1[i]);
		}
		
		String arr2[] = {"BMW","BENZ","AUDI"};
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println(str1.concat(str2));
		System.out.println(str);
		System.out.println(str3); 
		System.out.println(str.contains(str3));
		System.out.println(str1.startsWith("He"));
		System.out.println(str2.indexOf("o"));
		System.out.println(str.equals(str3));
		System.out.println(str.toUpperCase());
		
	}

}
