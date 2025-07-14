package ConditionalStatement;

public class ReverseString {

	public static void main(String[] args) {
		String input = "";
		
		ReverseString c = new ReverseString();
		String output = c.Reverse(input);
		System.out.println(output);

	}
	
	public String Reverse(String input) {
		String reverse = "";
		
		if(input.isEmpty() || input == null) {
			System.out.println("Empty or null string");
		}
		if(input.length()<=1) {
			reverse = input;
		}
		else {
			String originalArray[] = input.split("\\s+");
			
			for(String item : originalArray) {
				reverse = item + " " + reverse;
			}
		}
		return reverse;
	}
	
}
