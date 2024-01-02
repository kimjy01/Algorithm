package ex.chap01;

import java.util.Scanner;

public class SumFor2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		// dowhile은 무조건 1회 실행함
		// 양수가 나오기 전까지 계속 도는 반복문임.
		do {
			System.out.print("n 값 : ");
			n = stdIn.nextInt();
		} while (n <=0);
		
		int sum =0;
		
		for (int i=0; i <=n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + " 까지의 합은 " +sum+ "입니다.");
	}
}
