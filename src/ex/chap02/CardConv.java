package ex.chap02;

import java.util.Scanner;

public class CardConv {

	// 정수값 x를 r진수로 변환해 배열 d에 아랫자리부터 넣어두고 자릿수 반환
	static int cardConv(int x, int r, char[] d) {
		int digits =0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		}while (x!=0);
		
		for (int i = 0; i <digits/2; i++) {
			char t = d[i];
			d[i] = d[digits -i -1];
			d[digits -i -1] = t;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no; //변환하는 정수
		int cd; //기수
		int dno; //변환 수의 자릿수
		int retry;
		char[] cno = new char[32]; //변환 후 각 자리의 숫자를 넣어두는 문자배열
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = stdIn.nextInt();
			}while (no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = stdIn.nextInt();
			}while (cd < 2 || cd > 36);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + " 진수로 ");
			for (int i =0; i <dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.println("한 번 더 할까요? (1-예/0-아니오)");
			retry = stdIn.nextInt();
		}while (retry ==1);
	}
}
