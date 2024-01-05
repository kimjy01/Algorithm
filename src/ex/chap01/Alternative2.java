package ex.chap01;

import java.util.Scanner;

public class Alternative2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		System.out.println("+와 -를 번갈아 n개 출력합니다.");
		
		do {
			System.out.print("n 값 : ");
			n = stdIn.nextInt();
		} while (n <=0);
		
		// for문을 n/2번 나눗셈 2번, if문 판단 1번
		for (int i=0; i < n/2; i++) {
			System.out.print("+-");
		}
		
		// 홀수일 경우에만 마지막에 +출력
		if (n%2 != 0) {
			System.out.print("+");
		}
		
	}
}
