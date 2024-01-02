package ex.chap01;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int n = stdIn.nextInt();
		
		// 분기문
		if (n > 0)
			System.out.println("양수 입니다.");
		else if (n < 0)
			System.out.println("음수 입니다.");
		else
			System.out.println("0 입니다.");
	}
}
