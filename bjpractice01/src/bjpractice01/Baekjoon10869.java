package bjpractice01;

import java.util.Scanner;

public class Baekjoon10869 {

	public static void main(String[] args) {
		// 두 수의 덧셈, 뺄셈, 곱셈, 나눗셈(몫), 나머지 출력 
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		
		System.out.printf("%d\n", a+b);
		System.out.printf("%d\n", a-b);
		System.out.printf("%d\n", a*b);
		System.out.printf("%d\n", a/b);
		System.out.printf("%d\n", a%b);

	}
}