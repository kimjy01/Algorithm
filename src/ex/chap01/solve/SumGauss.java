package ex.chap01.solve;

import java.util.Scanner;

public class SumGauss {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		
		int n = stdIn.nextInt();
		
		int sum = (1+n)*(n/2) + (n%2==1 ? (n+1)/2 : 0);
		
		System.out.println("1부터 " + n + "까지 합은 " + sum + " 입니다.");
	}
}
