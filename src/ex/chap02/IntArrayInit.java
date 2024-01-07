package ex.chap02;

public class IntArrayInit {

	public static void main(String[] args) {
		// 배열 초기화에 의해 생성
		int[] a= {1,2,3,4,5};
		
		for (int i=0; i <a.length; i++) {
			// 만약 값이 없는데 출력하려고 하면 컴파일 오류 발생
			System.out.println("a["+i+"] = " + a[i]);
		}
	}
}
