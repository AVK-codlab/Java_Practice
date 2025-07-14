
public class EvenOddfromArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,};
		
		System.out.println("Even numbers are*********");
		for(int i = 0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" ");
			}
			
		}

		System.out.println("Odd numbers are*********");
		for(int i = 0; i<=arr.length-1; i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]+" ");
			}
			
		}

	}

}
