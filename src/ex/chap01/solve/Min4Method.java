package ex.chap01.solve;

import java.util.Scanner;

public class Min4Method {

	static int min4(int a, int b, int c, int d) {
		
		int min = a;
		
		if (b < min) min = b;
		if (c < min) min = c;
		if (d < min) min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 4개를 입력해주세요. 최솟값을 구합니다.");
		
		System.out.println("a : "); int a = stdIn.nextInt();
		System.out.println("b : "); int b = stdIn.nextInt();
		System.out.println("c : "); int c = stdIn.nextInt();
		System.out.println("d : "); int d = stdIn.nextInt();
		
		System.out.println("최솟값은 : " + min4(a,b,c,d) + "입니다.");
	}
}
