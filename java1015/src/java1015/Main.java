package java1015;

public class Main {

	public static void main(String[] args) {
		
		// 인스턴스 생성
		Scedule sce1 = new Scedule();
		sce1.num = 1;
		sce1.date = "10/12";
		sce1.content = "밥, 김치, 미역국"; 
		sce1.cal = 300;
		
		// static 변수에 데이터 저장하기  
			Scedule.request = "우유/요구르트";
				
		
		System.out.printf("번호: %d, 날짜: %5s, 식단: %5s, 칼로리: %3d, 후식: %5s\n", 
				sce1.num, sce1.date, sce1.content, sce1.cal, sce1.request);

		
		Scedule sce2 = new Scedule();
		sce2.num = 2;
		sce2.date = "10/13";
		sce2.content = "밥, 김치, 된장국"; 
		sce2.cal = 350;

		System.out.printf("번호: %d, 날짜: %5s, 식단: %5s, 칼로리: %3d, 후식: %5s\n", 
				sce2.num, sce2.date, sce2.content, sce2.cal, sce2.request);
		
		Scedule sce3 = new Scedule();
		sce3.num = 3;
		sce3.date = "10/14";
		sce3.content = "밥, 김치, 김치찌개"; 
		sce3.cal = 340;
		
		System.out.printf("번호: %d, 날짜: %5s, 식단: %5s, 칼로리: %3d, 후식: %5s\n", 
				sce3.num, sce3.date, sce3.content, sce3.cal, sce3.request);
		
	}

}
