package java1027;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatMain {

	public static void main(String[] args) {
		
		// 2020년 10월 27일 화요일 오전 11시 24분 ??초형식으로 출력
		Date today = new Date();
		
		// 날짜 서식 생성 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEE요일 a hh시 "
				+ "mm분 ss");
		
		String msg = sdf.format(today);
		System.out.printf("Today Date : %s\n", msg);
		
		System.out.printf("========================================\n");
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy년 M월 dd일 EEE요일 a hh시 "
				+ "mm분 ss"); // 한자리로 쓰고싶으면 하나씩 줄이기 
	
		String msg1 = sdf1.format(today);
		System.out.printf("Today Date : %s\n", msg1);
		
		// 통화기호 천단위구분기호룰 추가해서 출력 
		int money = 8970000;
		DecimalFormat df = new DecimalFormat(
				"\u0024 #,##0");
		
		String msg2 = df.format(money);
		System.out.printf("Money : %s\n", msg2); // 통화기호까지 나옴 
		
	}
}

















