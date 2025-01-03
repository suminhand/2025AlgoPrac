package q571v2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		strPrint(num);
	}
	
	public static void strPrint(int num) {
		if(num <= 0) {
			return;
		} else {
			System.out.println("~!@#$^&*()_+|");
			strPrint(num - 1);
		}
	}

}
