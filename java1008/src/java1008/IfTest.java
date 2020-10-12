package java1008;

public class IfTest {

	public static void main(String[] args) {
	
		// 사용자가 복사할 매수 입력
		// 1 ~ 100장 까지는 장당 50원
		// 101 ~ 1000장 까지는 장당 40원
		// 그 이상은 장당 30원
		// 총 금액을 출력하는 프로그램 작성
		
		// 1. 복사할 매수 입력 받기 - Scanner
		// 2. 한 장당 가격 설정 - if
		// 3. 금액 계산 - 연산자
		// 4. 금액 출력 - 출력
			
		// 1. 복사할 매수 입력 받기 - Scanner
		java.util.Scanner copy = new java.util.Scanner(System.in);
			
		System.out.printf("복사 매수 입력:");
		int paper = copy.nextInt();
			
		copy.close();
			
		// 2. 한 장당 가격 설정 - if
			
		int price = 0;	// 가격 변수 생성
			
		//** 이상, 이하 구분 잘 하기 
		if(paper >= 1 && paper <= 100) {
			price = 50;
		} else if (paper >= 101 && paper <= 1000) {
			price = 40;			
		} else {
			price = 30;
		}
			
		// 3. 금액 계산 - 연산자
			
		int totalprice = paper * price;
			
		// 4. 금액 출력 - 출력
			
		System.out.printf("복사 매수:%d, 장당 금액:%d,\n총 복사 가격은%d원 입니다.", paper, price, totalprice);

	}
}
