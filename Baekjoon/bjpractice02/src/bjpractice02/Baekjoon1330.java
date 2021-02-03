package bjpractice02;

import java.util.Scanner;

public class Baekjoon1330 {

	public static void main(String[] args) {
		
		// 두 정수 a와 b가 주어졌을 때, a와 b를 비교하는 프로그램 작성 
		// 첫째 줄에 다음 세 가지 중 하나를 출력 
		// a가 b보다 큰 경우에는 '>'를 출력, a가 b보다 작은 경우에는 '<'를 출력, a와 b가 같은 경우에는 '=='를 출력
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		sc.close();
	}
}
