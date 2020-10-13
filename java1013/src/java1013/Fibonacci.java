package java1013;

public class Fibonacci {

	public static void main(String[] args) {
		
		// 정수를 입력받아 정수 번째 피보나치 수열의 값 구하기 - Scanner 생성
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.printf("구하고자 하는 수열의 위치는? : ");
		int n = sc.nextInt();
		// 필요한 변수 3개 생성 - 1, 2번째 항, 수열의 값
		int n1 = 1; // 이전 첫번째 항의 값 저장
		int n2 = 1; // 이전 두번째 항의 값 저장
		int result = 1; // 피보나치 수열의 값 저장
		
		// 첫번째와 두번째는 고정이므로 세번째부터 계산
		for(int i = 3; i <= n; i = i + 1) {
			result = n1 + n2;
			n2 = n1;
			n1 = result;
		}
		// 출력 - 10:55, 11:89
		System.out.printf("%d번째 값: %d\n", n, result);
		//입력 객체 사용이 종료되었으므로 정리
		sc.close();

	}
}