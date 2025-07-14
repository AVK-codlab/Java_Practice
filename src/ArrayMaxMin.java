
public class ArrayMaxMin {

	public static void main(String[] args) {

		int a[] = { 60, 110, 70, 30, 80 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum value is " + max);

//		int b[]= {50,20,40,10,30};
		
		int min = a[0];
		
		for(int j=1; j<a.length; j++)
		{
			if(a[j]<min)
			{
				min = a[j];
			}
		}
		System.out.println("Minimum value is "+min);
	}

}
