package ex.chap02;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int counter = 0;
		int ptr =0; //찾는 소수의 갯수
		int[] prime = new int[500]; //소수를 저장하는 배열
		
		prime[ptr++] = 2;
		
		// 2를 제외한 홀수에서 검사를 한다. (짝수는 무의미)
		for (int n=3; n<= 1000; n+=2) {
			int i;
			for (i=1; i< ptr; i++) {
				counter++;
				if (n % prime[i] == 0) {
					break;
				}
			}
			// 소수를 prime에 저장함으로써 소수와 나눴을때 나눠지면 소수 X
			if (ptr==i) {
				prime[ptr++] = n;
			}
		}
		for (int i=0; i <ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
}
