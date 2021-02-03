package bjpractice01;

import java.util.Scanner;

public class Baekjoon10430 {

	public static void main(String[] args) {
		
		// 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 
		// 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		sc.close();
		
		System.out.printf("%d\n", (a+b)%c);
		System.out.printf("%d\n", ((a%c)+(b%c))%c);
		System.out.printf("%d\n", (a*b)%c);
		System.out.printf("%d\n", ((a%c)*(b%c))%c);

	}
}
