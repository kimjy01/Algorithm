package ex.chap02;

public class PrimeNumber3 {

	public static void main(String[] args) {
		int counter = 0; //곱셈과 나눗셈의 횟수
		int ptr =0; //찾는 소수의 갯수
		int[] prime = new int[500]; //소수를 저장하는 배열
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		
		for (int n=5; n<= 1000; n+=2) {
			boolean flag = false;
			// n의 제곱근 이하의 어떤 소수로도 나누어떨어지지 않음
			for (int i=1; prime[i]*prime[i] <= n; i++) {
				// 제곱 1, 조건문 1
				counter += 2;
				if (n % prime[i] == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				prime[ptr++] = n;
				counter++;
			}
		}
		for (int i=0; i <ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
}
