package methodDemo;

public class carDemo {
		private String make;
		private int speed;
		public void increaseSpeed(int speed) {
			System.out.println("Increasing speed from " + speed);
			this.speed = speed+10;
		}
		
		public int newSpeed() {
			return this.speed;
		}
		
		public void setMake(String make) {
			this.make = make;
		}
		
		public String getMake() {
			return this.make;
		}
		
}
