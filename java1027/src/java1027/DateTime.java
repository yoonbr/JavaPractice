package java1027;

import java.util.Calendar;

public class DateTime {

	public static void main(String[] args) {
		
		// 현재 시간을 갖는 인스턴스 만들기
		Calendar cal = Calendar.getInstance();
		java.util.Date uDate = new java.util.Date();
		
		// 날짜만 필요한 경우 
		java.sql.Date sDate = new java.sql.Date(
				cal.getTimeInMillis());
		java.sql.Time sTime = new java.sql.Time(
				cal.getTimeInMillis());
		System.out.printf("%s\n", cal);
		System.out.printf("%s\n", uDate);
		System.out.printf("%s\n", sDate);
		System.out.printf("%s\n", sTime);
		
		// 1986년 5월 5일 오후 2시를 Calendar 인스턴스로 생성
		Calendar meetDay = Calendar.getInstance();
		// 월은 0부터 시작하므로 하나 적게 설정함 
		meetDay.set(Calendar.YEAR, 1986);
		meetDay.set(Calendar.MONTH, 4); //** 월 주의 
		meetDay.set(Calendar.DAY_OF_MONTH, 5);
		meetDay.set(Calendar.HOUR, 14);
		System.out.printf("%s\n", meetDay);
		
		Calendar meetDay1 = Calendar.getInstance();
		// 월은 0부터 시작하므로 하나 적게 설정함 
		meetDay1.set(Calendar.YEAR, 1993);
		meetDay1.set(Calendar.MONTH, 8); //** 월 주의 
		meetDay1.set(Calendar.DAY_OF_MONTH, 30);
		meetDay1.set(Calendar.HOUR, 14);
		System.out.printf("%s\n", meetDay1);
		
		// 현재 시간을 인스턴스로 생성 
		Calendar today = Calendar.getInstance();
		
		// 2개의 날짜 사이의 갭을 계산하기 - 1/1000초 단위로 출력 
		long result = today.getTimeInMillis() - meetDay1.getTimeInMillis();
		
		// 일단위로 계산 
		result = result / 1000 / 86400; // 24시간 초 단위로 환산 = 86400 
		System.out.printf("지나온 날 수 : %d\n", result);	
	
	}
}




















