package bjpractice01;

import java.util.Scanner;

public class Baekjoon2588 {

	public static void main(String[] args) {
		
		// 세자리수 * 세자리수의 과정 곱셈 출력 
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close(); // ** Scanner 쓰고 꼭 닫아주기
		
		// b의 자리수에 따라서 곱셈 
		System.out.println(a*(b%10)); // 일의 자리 출력 
		System.out.println(a*(b%100/10)); // 십의 자리 출력 
		System.out.println(a*(b/100)); // 백의 자리 출력 
		// 마지막 전체 수 곱셈 출력 
		System.out.println(a*b);

	}
}