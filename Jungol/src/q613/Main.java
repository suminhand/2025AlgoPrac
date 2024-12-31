package q613;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		String school = scan.next();
		int grade = scan.nextInt();
		scan.close();
		
		Student stu = new Student(name, school, grade);
		stu.print();

	}

}
