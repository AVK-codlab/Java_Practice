
public class SumofArrayElements {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		
		int sum = 0;
		
		for(int i=0; i<=arr.length-1; i++) 
		{
			sum = sum + arr[i];
		}
		
		System.out.println("Sum is "+sum);

	}

}
