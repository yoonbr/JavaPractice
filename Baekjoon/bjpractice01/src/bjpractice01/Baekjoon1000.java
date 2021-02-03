package bjpractice01;

import java.util.Scanner;

public class Baekjoon1000 {

	public static void main(String[] args) {
		
		// 1000, 1001, 10998
		// 두 수를 입력 받고 합, 뺄셈, 곱셈 출력 
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		
		System.out.printf("%d\n", a+b);
		System.out.printf("%d\n", a-b);
		System.out.printf("%d\n", a*b);

	}
}