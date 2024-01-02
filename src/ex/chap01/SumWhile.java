package ex.chap01;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1 부터 n까지의 합을 구합니다.");
		System.out.println("n 값 : ");
		int n = stdIn.nextInt();
		
		int sum =0;
		int i =1;
		
		// 반복문
		while (i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + n + "까지 합은 " + sum + " 입니다.");
	}
}
