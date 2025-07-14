package methodDemo;

public class CarSpeed {

	public static void main(String[] args) {
			
		carDemo bmw = new carDemo();
		
		bmw.increaseSpeed(50);
		System.out.println("The new speed is " + bmw.newSpeed());
		bmw.setMake("BMW");
		System.out.println(bmw.getMake());
		
	}

}
