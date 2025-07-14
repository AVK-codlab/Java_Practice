
public class EqualofTwoArrays {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		int b[] = {1,2,3,4};
		
		boolean f= true;
		
		if(a.length == b.length)
		{
			for(int i = 0; i<a.length; i++)
			{
				if(a[i]!=b[i])
				{
					f=false;
				}
			}
		}
		else
		{
			f=false;
		}

		if(f==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}

}
