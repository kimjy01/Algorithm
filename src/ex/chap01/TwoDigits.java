package ex.chap01;

import java.util.Scanner;

public class TwoDigits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int no;
		
		System.out.println("2자리의 양수를 입력하세요");
		
		do {
			System.out.println("no 값 : ");
			no = stdIn.nextInt();
		}while (no < 10 || no > 99);
		
		System.out.println();
	}
}
