package ex.chap01.solve;

import java.util.Scanner;

public class DigitsNo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("자릿수 구할 양의 정수 값 : ");
			n = stdIn.nextInt();
		}while (n < 0);
		
		int k = 0;
		while (n >0) {
			n /= 10;
			k++;
		}
		
		System.out.println("그 수는 "+ k+"자리 입니다.");
		
	}
}
