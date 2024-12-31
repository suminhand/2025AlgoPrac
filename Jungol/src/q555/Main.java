package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char[] charArr = new char[11];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			charArr[i] = scan.next().charAt(0);
		}
		for(int i=0; i<10; i++) {
			System.out.print(charArr[i]);
		}
		
		scan.close();

	}

}
