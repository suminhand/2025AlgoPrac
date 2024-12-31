package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] numArr = new int[100];
		Scanner scan = new Scanner(System.in);
		int ptr = 0;
		
		while(true) {
			numArr[ptr] = scan.nextInt();
			if (numArr[ptr] == 0) {
				break;
			}
			ptr++;
		}
		
		while(ptr > 0) {
			System.out.print(numArr[--ptr] + " ");
		}
	}

}
