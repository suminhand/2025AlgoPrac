package q614;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.print();
		
		Scanner scan = new Scanner(System.in);
		String school = scan.next();
		int grade = scan.nextInt();
		
		Student stu2 = new Student(school, grade);
		stu2.print();
	}

}
