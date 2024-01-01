package ex.chap01;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최대값을 구합니다.");
		
		// a, b, c 의 세 정수 값을 받는다
		System.out.println("a의 값 : "); int a = stdIn.nextInt();
		System.out.println("b의 값 : "); int b = stdIn.nextInt();
		System.out.println("c의 값 : "); int c = stdIn.nextInt();
		
		// 먼저 a에 max를 넣고 비교를 해서 b, c를 max에 넣는다.
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("최댓값은 " + max + " 입니다.");
	}
}
