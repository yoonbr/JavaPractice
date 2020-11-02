package java1102;

import java.util.List;

public class FinalOpMain {

	public static void main(String[] args) {
		
		// 공유 데이터인 CoffeeList를 가져와서 저장하기 
		List <Coffee2> coffeeList = 
				Singleton.sharedInstance().getCoffee2List();
		
		// 정수의 합계 - sum 
		//coffeeList.stream().sum(); // error, coffee는 합계를 구할 수 없음!
		System.out.printf("칼로리 합계 : %d\n", coffeeList.stream().mapToInt
				(Coffee2::getCal).sum()); // 합계를 숫자로 바꿔줌 maptoint
		
		// 라떼 칼로리의 합계 
		// 스트림 다음 .filter(it -> it.getMilk().equals("milk")) 추가 
		System.out.printf("라떼 칼로리 합계 : %d\n", coffeeList.stream()
				.filter(it -> it.getMilk().equals("milk")).mapToInt
				(Coffee2::getCal).sum());
		
		// 칼로리가 가장 큰 데이터
		// 크기 비교를 못해서 max가 안구해짐 
		System.out.printf("칼로리 최대값 : %s\n", 
				coffeeList.stream().max((n1, n2) -> n1.getCal() - n2.getCal()).get());
		
		System.out.printf("칼로리 최소값 : %s\n", 
				coffeeList.stream().max((n1, n2) -> n2.getCal() - n1.getCal()).get());
		
		// 라떼 종류 중 칼로리 최대값 - filter 추가 
		System.out.printf("칼로리 최대값 : %s\n", 
				coffeeList.stream()
				.filter(it -> it.getMilk().equals("milk"))
				.max((n1, n2) -> n1.getCal() - n2.getCal()).get());
				//.max((n1, n2) -> n1.getName().compareTo(n2.getName()) .get());

		// 라떼 종류 중 최소값 
		System.out.printf("칼로리 최소값 : %s\n", 
				coffeeList.stream()
				.filter(it -> it.getMilk().equals("milk"))
				.max((n1, n2) -> n2.getCal() - n1.getCal()).get());
		
	}
}
