package ex.chap01.solve;

import java.util.Scanner;

public class SumOf {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력해주세요. 두 수 사이의 합을 구합니다.");
		
		System.out.println("a 값 : ");
		int a = stdIn.nextInt();
		System.out.println("b 값 : ");
		int b = stdIn.nextInt();
		
		if (a > b) {
			int temp = b;
			b = a;
			a = temp;
		}
		
		System.out.println(a + "부터 " +b + "의 합은" + sumof(a,b)+ "입니다.");
	}
	
	static int sumof(int a, int b) {
		
		int sum=0;
		
		for (int i=a; i <= b; i++ ) {
			sum += i;
		}
		
		return sum;
	}
}
