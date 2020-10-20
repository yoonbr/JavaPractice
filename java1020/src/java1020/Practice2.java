package java1020;

import java.util.Date;

public class Practice2 {

	public static void main(String[] args) {
		
		// 1. 0.0에서 1.0사이의 랜덤한 실수 가져오기
		double su = Math.random();
		System.out.printf("su:%.2f\n", su);
		
		// 2. “109” 과 “19” 2개의 문자열을 정수로 변환하여 합계를 구하기 
		int sum = Integer.parseInt("109") + 
				Integer.parseInt("19");
		System.out.printf("sum:%d\n", sum);
		
		// 3. java.util.Date - 인스턴스 메소드
		Date date = new Date(); // java.util import하기
		System.out.printf("date:%s", date.toString());
		
	}
}
