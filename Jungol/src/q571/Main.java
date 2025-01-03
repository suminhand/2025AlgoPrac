package q571;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		scan.close();
		
		for (int i=0; i<num; i++) {
			strPrint();
		}

	}
	
	public static void strPrint() {
		System.out.println("~!@#$^&*()_+|");
	}

}
