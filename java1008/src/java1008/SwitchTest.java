package java1008;

public class SwitchTest {

	public static void main(String[] args) {
		
		// menu 4개정도 정함 (else, 선택 제한)
		// menu 단가 정함
		// 메뉴 정한 후 수량 입력 (0 < 개수 <= 9)
		// 메뉴 총 가격 확인 Y/N
		// 메시지 출력 Y(정상주문) N(취소)
			
		// 메뉴 정하기 : 햄버거 - 5000, 파스타 - 7000, 감자튀김 - 3000, 음료수 - 1500
				
		// 키보드로 부터 입력받는 객체 생성
		java.util.Scanner pos = new java.util.Scanner(System.in);				
				
		// 메뉴 숫자로 입력 받기	
		int menu = 0;
				
		System.out.printf("구매할 메뉴를 입력해주세요(1-햄버거 2-파스타 3-감자튀김 4-음료수):");
		menu = pos.nextInt();
		// 메뉴 설정하기

		String a = "햄버거" ;
		String b = "파스타" ;
		String c = "감자튀김" ;
		String d = "음료수" ;
				
				
		// 수량 숫자로 입력 받기
		int ea = 0;
				
		System.out.printf("메뉴의 수량을 입력해주세요(1~9까지 구매가능):");
		ea = pos.nextInt();
		// 1~9까지가 아니면 수량 입력화면으로 되돌리기

		// 주문한 메뉴의 총액 계산하기
		// 메뉴별로 금액이 다르므로 if, switch 계산
				
		int total = 0;
				
		switch(menu) {
		case 1 : 
			total = ea * 5000;
			break;
		case 2 : 
			total = ea * 5000;
			break;
		case 3 : 
			total = ea * 5000;
			break;
		case 4 : 
			total = ea * 5000;
			break;
		default:
			System.out.println("메뉴를 다시 확인하세요.");
			break;			
		}
				
				
		// 주문 여부 확인
		System.out.printf("총 금액은 %d원 입니다.\n", total);
		System.out.printf("주문은 Y, 취소는 N");
				
		// 주문 여부 입력 받기
		String input = "";
		// 숫자다음 문자열 할때 한번 더!!
		pos.nextLine();
		input = pos.nextLine();
		
		// input의 값이 Y면 주문 완료, N이면 주문 취소라고 출력
		// if보다 case로 써보기.
				
		switch(input) {		
		case "Y" : 
			System.out.printf("주문완료\n");
			break;
		case "N" : 
			System.out.printf("주문취소\n");
			break;
		default:
			System.out.printf("다시 입력해주세요.\n");
			break;
			
	   	}
						
		// 입력 받는 객체 사용 종료 코드 작성 
		pos.close();
				
	}
}