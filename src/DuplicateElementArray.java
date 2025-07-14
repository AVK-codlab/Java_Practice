import java.util.HashSet;

public class DuplicateElementArray {

	public static void main(String[] args) {
		
		String arr[]= {"java","C","C++","java"};
		
		boolean f = false;
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element is "+arr[i]);
					f=true;
					
				}
			}
		}
		if(f==false)
		{
			System.out.println("Duplicate element not found");
		}
		
		HashSet<String> lang = new HashSet();
		boolean flag = false;
		
		for(String l:arr)
		{
			if(lang.add(l)==false)
			{
				System.out.println("Duplicate element is "+l);
				flag = true;
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element not found");
		}

	}

}
