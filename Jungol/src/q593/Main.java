package q593;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNum;
		char ascii;
		
		while(true) {
			inputNum = Integer.parseInt(scan.nextLine().split(" ")[3]);
			if(inputNum == 0) break;
			ascii = (char) inputNum;
			System.out.println(ascii);
		}
		
		scan.close();

	}

}
