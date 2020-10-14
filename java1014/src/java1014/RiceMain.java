package java1014;

public class RiceMain {

	public static void main(String[] args) {
		
		// Rice의 클래스의 인스턴스를 2개 생성
		Rice rice1 = new Rice();
		Rice rice2 = new Rice();
		
		// rice1과 rice2의 데이터 설정
		rice1.num = 1;
		rice1.name = "쌀밥";
		rice1.cal = 210;
		
		rice2.num = 2;
		rice2.name = "현미밥";
		rice2.cal = 190;
		
		// 인스턴스 변수는 각각 소유하기 때문에
		// 하나의 변경이 다른 하나에 영향을 주지 않음.
		System.out.printf("rice1의 이름: %s\n", rice1.name);
		System.out.printf("rice2의 이름: %s\n", rice2.name);
		
		// static이 붙은 변수는 클래스 이름으로도 접근이 가능. 공유하기 때문 
		// 누군가가 변경하면 다른 인스턴스의 것도 변경된 것 처럼 보임
		Rice.menu = "밥";
		System.out.printf("메뉴의 이름: %s\n",rice1.menu);
		System.out.printf("메뉴의 이름: %s\n",rice2.menu);
		
		// 변경하기
		rice1.menu = "오늘의 밥";
		System.out.printf("메뉴의 이름: %s\n",rice1.menu);
		System.out.printf("메뉴의 이름: %s\n",rice2.menu);
					
	}
}
