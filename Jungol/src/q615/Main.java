package q615;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student stu = new Student();
		Scanner scan = new Scanner(System.in);
		String name;
		int kor, eng;
		
		for(int i=0; i<2; i++) {
			name = scan.next();
			kor = scan.nextInt();
			eng = scan.nextInt();
			
			stu.set(name, kor, eng);
		}
		scan.close();
		
		stu.print();

	}

}
