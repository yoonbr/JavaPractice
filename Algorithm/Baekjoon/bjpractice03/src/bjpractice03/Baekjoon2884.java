package bjpractice03;

import java.util.Scanner;

public class Baekjoon2884 {

	public static void main(String[] args) {
		
		// 45분 일찍 알람시계 맞추기
		// 입력시간 24시간
		
		Scanner sc = new Scanner(System.in);
		// H, M의 정수 출력
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		// 45분 빼기 
		// 분이 0보다 작을 경우 60을 더해주고 
		// 시간이 0보다 작을 경우 24를 더해준다 
		int H1 = H;
		int M1 = M - 45;
		if(M1 < 0) {
			M1 = M1 + 60;
			H1 = H1 - 1;
			if(H1 < 0) {
				H1 = H1 + 24;
			}
			
		}
		System.out.printf("%d %d", H1, M1);
		
		sc.close();
	}
}
