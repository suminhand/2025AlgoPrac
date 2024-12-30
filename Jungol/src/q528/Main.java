package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		System.out.println(N);
		if(N < 0) {
			System.out.println("minus");
		}
		
		scan.close();
	}

}
