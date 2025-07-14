package ConditionalStatement;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		int arr[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println("The value at index " + i + " is " + arr[i]);
		}
		for (int num : arr) {
			System.out.println("The value is " + num);
		}

		String arr1[] = { "Sachin", "Sehwag", "Ganguly", "Dhoni" };

		for (String player : arr1) {
			System.out.println("The player is " + player);

		}
	}

}
