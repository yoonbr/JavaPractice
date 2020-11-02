package java1102;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class CollectionAccess {

	public static void main(String[] args) {
		
		// 문자열리스트 생성 
		List <String> stocks = 
				new ArrayList<String>();
		stocks.add("한화솔루션");
		stocks.add("박셀바이오");
		stocks.add("삼성전자");
		stocks.add("현대");
		stocks.add("Apple");
		stocks.add("AMD");
		
		// 반복문을 이용한 전체 데이터 출력 
		// 데이터의 개수는? 가져오는건 어떤 메소드인지?
		// 데이터의 개수를 리턴하는 메소드와 1개의 데이터를 가져오는 메소드를 찾아야함
		// int size(), T get(int index)
		/*for(String temp : stocks) {
			System.out.printf("%s\n", temp);
		}*/
		// 왜 이렇게 하는지 잘 생각해보기 
		
		int len = stocks.size();
		for(int i=0; i <len; i=i+1) {
			System.out.printf("%10s", stocks.get(i));
		}
		System.out.printf("\n");
		
		// Iterator 이용
		Iterator<String> iterator = 
				stocks.iterator();
		// 다음 데이터가 존재한다면 
		while(iterator.hasNext()) {
			//다음 데이터를 출력 
			System.out.printf("%10s", iterator.next());
		}
		System.out.printf("\n");
		// 빠른열거가 안되면 이 두 방식으로 접근해야함
		// 두 방식의 발전 -> 빠른 열거 
		
		// 빠른열거 
		for(String temp : stocks) {
			System.out.printf("%10s",temp);
		}
		System.out.printf("\n");
		
		// 현재까지는 데이터 접근법과 작업하는 코드를 따로따로 씀 
		
		// 스트림 이용 
		// 스트림 찾아오기 
		Stream <String> stream = stocks.stream();
		stream.forEach(name -> System.out.printf("%10s",name));
		// 접근하는걸 별도로 만들지 않고 알아서 순회함 
		// 데이터가 많을때 좋고, 많지 않을땐 효과를 많이 내지는 못함 
		
	}
}






















