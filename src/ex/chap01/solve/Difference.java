package ex.chap01.solve;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("a 값 : ");
		a = stdIn.nextInt();
		
		while(true) {
			System.out.print("b 값 : ");
			b = stdIn.nextInt();
			if (b > a) {
				break;
			}
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		
		System.out.println("b-a는 "+ (b-a) + "입니다.");
		
	}
}
