
public class InheritanceDemo {

	public static void main(String[] args) {
		
		int x = 50;
		int b = 20;
		int y = 30;
		int z = 80;
		
		Numbers a = new Numbers(x,b);
		a.Number(x,b);
		System.out.println("Sum is " +a.Num());
		
		AddNumbers num = new AddNumbers(y, z);
		num.Number(y, z);
		System.out.println("Sum is " + num.Num());
		
		num.extra();
	}

}
