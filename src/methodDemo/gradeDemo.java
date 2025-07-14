package methodDemo;

public class gradeDemo {

	public static void main(String[] args) {
		findGrade("Tom", 95);
		findGrade("David", 75);
		findGrade("James", 65);

	}
	
	public static void findGrade(String studentName, int score) {
		
		String grade;
		
		if(score>=90 && score<=100) {
			grade= "A";
		}
		else if(score>=80 && score<90) {
			grade= "B";
		}
		else if(score>=70 && score<80) {
			grade= "C";
		}
		else {
			grade= "D";
		}
		
		System.out.println("The name of student is " + studentName + " and grade is " + grade);
	}

}
