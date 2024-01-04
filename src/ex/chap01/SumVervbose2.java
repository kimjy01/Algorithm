package ex.chap01;

import java.util.Scanner;

public class SumVervbose2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n 값 : ");
			n = stdIn.nextInt();
		} while (n <=0);
		
		int sum=0;
		
		// if문의 판단 횟수를 n회에서 0회로 줄임
		for (int i =1; i < n; i++) {
			System.out.print(i + "+");
			sum += i;
		}
		
		// 마지막 한 번을 위해서 for문을 돌리는 것은 비효율적
		System.out.print(n + "=");
		sum += n;
		System.out.println(sum);
		
	}
}
