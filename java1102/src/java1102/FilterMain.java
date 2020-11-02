package java1102;

import java.util.stream.Stream;

public class FilterMain {

	public static void main(String[] args) {
		
		// 공유 데이터 streamlist를 전부 출력 
		Stream<String> st1 = 
				Singleton.sharedInstance().getStrList().stream();
		
		// st1.forEach(System.out::println); // 전체 List 출력 
		
		// 중복 제거 
		// st1.distinct().forEach(System.out::println);
		
		// 중복 제거하고 2개 건너뛰고출력 
		// st1.distinct().skip(2).forEach(System.out::println);
		
		// 스트림은 한번 사용하면 재사용이 안됨. 주석 처리 후 사용 
		
		// filter는 매개변수가 1이고 리턴 타입이 boolean인 함수를 대입 
		// 12자 이상인 데이터 분류 
		// st1.filter(it -> it.length() > 12).forEach(System.out::println);
		
		// 데이터 내 c가 들어간 단어 출력 
		
		st1.filter(it -> it.indexOf("c") >= 0).forEach(System.out::println);
		
		// Coffee의 List를 스트림으로 생성 
		Stream <Coffee2> st2 = 
				Singleton.sharedInstance().getCoffee2List().stream();
		
		// 우유가 들어가지 않은 coffee 골라서 출력하기 
		st2.filter(it -> it.getMilk().equals("no milk")).forEach(System.out::println);
		
	}
}
