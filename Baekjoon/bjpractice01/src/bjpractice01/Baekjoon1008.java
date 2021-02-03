package bjpractice01;

import java.util.Scanner;

public class Baekjoon1008 {

	public static void main(String[] args) {
		
		// 두 정수 입력 받은 a/b 출력
		// 자료형에 주의해서 코드짜기
		Scanner sc = new Scanner(System.in);
		Double a, b;
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		sc.close();
		
		System.out.println(a/b);
			
	}
}