package ex.chap01.solve;

import java.util.Scanner;

public class NumPira {

	static void nspira(int n) {
		for (int i =1; i <= n; i++) {
			for (int j =1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j <= (i-1)*2+1; j++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;

		do {
			System.out.print("단수는  : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		nspira(n);
	}
}
