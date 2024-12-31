package q614;

public class Student {
	
	private String school;
	private int grade;
	
	public Student() {
		this("Jejuelementary", 6);
	}
	
	public Student(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	
	public void print() {
		System.out.println(this.grade + " grade in " + this.school + " School ");
	}

}
