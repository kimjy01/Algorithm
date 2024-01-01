package ex.chap01.solve;

import java.util.Scanner;

public class Min3Method {

	static int min3(int a, int b, int c) {
		
		int min = a;
		
		if (b < min) min = b;
		if (c < min) min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력해주세요. 최솟값을 구합니다.");
		
		System.out.println("a : "); int a = stdIn.nextInt();
		System.out.println("b : "); int b = stdIn.nextInt();
		System.out.println("c : "); int c = stdIn.nextInt();
		
		System.out.println("최솟값은 : " + min3(a,b,c) + "입니다.");
	}
}
