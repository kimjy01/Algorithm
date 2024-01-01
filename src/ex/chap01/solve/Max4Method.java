package ex.chap01.solve;

import java.util.Scanner;

public class Max4Method {

	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 4개를 입력해주세요. 최댓값을 구합니다.");
		
		System.out.println("a : "); int a = stdIn.nextInt();
		System.out.println("b : "); int b = stdIn.nextInt();
		System.out.println("c : "); int c = stdIn.nextInt();
		System.out.println("d : "); int d = stdIn.nextInt();
		
		System.out.println("최댓값은 : " + max4(a,b,c,d) + "입니다.");
	}
}
