package java1102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 클래스 내부 외부 상관 없음 
// 제너릭 적용 
// add on ~~ methods 설정 

class ComparatorImpl implements Comparator<Coffee> {

	@Override
	public int compare(Coffee o1, Coffee o2) {
		// TODO Auto-generated method stub
		return o1.getCal() - o2.getCal();
	}
}

public class LambdaTest {

	public static void main(String[] args) {
		// Coffee 3개 값을 대입해서 저장 
		// Coffee의 개수는 알 수 없음 
		List<Coffee> list = new ArrayList<Coffee>();
		
		// 데이터 삽입
		Coffee coffee = new Coffee();
		coffee.setName("Americano");
		coffee.setMl(571);
		coffee.setCal(10);
		list.add(coffee);
		
		// DTO에는 생성자 두 개 만들어 빠르게 데이터를 집어넣어서
		// 테스트 할 수 있도록 하기 
		coffee = new Coffee("Cafe Latte", 571, 210);
		list.add(coffee);
		
		coffee = new Coffee("Topinut Latte", 571, 320);
		list.add(coffee);
		
		// cal을 이용해서 오름차순 정렬 
		
		// 이 방식은 ComparatorImpl을 2개 이상 만들어서 사용하는 경우 
		list.sort(new ComparatorImpl());
		
		for(Coffee temp : list) {
			System.out.printf("%s\n", temp);
		}
		//cal의 내림차순 정렬 - anontmous class 이용 
		System.out.println("====================================\n");
		list.sort(new Comparator<Coffee>() {

			@Override
			public int compare(Coffee o1, Coffee o2) {
				// 내림차순은 반대로 빼기 
				return o2.getCal() - o1.getCal();
			}
		});
		for(Coffee temp : list) {
			System.out.printf("%s\n", temp);
		}
		// 이름의 내림차순으로 정렬 - 람다 이용 
		Collections.sort(list,(coffee1, coffee2) -> 
		coffee1.getName().compareTo(coffee2.getName()));
		
		System.out.println("====================================\n");
		
		for(Coffee temp : list) {
			System.out.printf("%s\n", temp);
		}

		System.out.println("====================================\n");
		// list의 모든 요소에게 System.out.println을 수행시킴 
		
		list.forEach(System.out::println);
	}

}

























