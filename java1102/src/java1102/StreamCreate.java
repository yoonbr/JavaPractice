package java1102;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreate {
	public static void main(String[] args) {
		
		// 문자열 배열을 생성
		String [] names = 
			{"사과", "딸기", "메론", "레몬", "포도"};
		
		List<String> list = 
				new ArrayList<String>();
		
		list.add("삼성전자");
		list.add("화천기계");
		list.add("삼성전기");
		list.add("호텔신라");
		list.add("화승인더");
		
		// 배열의 데이터를 Stream을 이용해서 전부 출력 
		// 배열 array 이용해서 스트림 생성 
		Stream<String> st1 = 
				Arrays.stream(names);
		
		// 데이터를 순회하면서 작업 
		st1.forEach(System.out::println);
		
		// List를 이용해서 Stream 을 생성 
		Stream<String> st2 = 
				list.stream();
		st2.forEach(System.out::println);
		
	}
}
