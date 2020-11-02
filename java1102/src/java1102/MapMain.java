package java1102;

import java.util.stream.Stream;

public class MapMain {

	public static void main(String[] args) {
		
	Stream<Coffee2> coffeeStream = 
			Singleton.sharedInstance().getCoffee2List().stream();
	
	// Coffee2의 데이터중 칼로리만 변환 
	coffeeStream.mapToInt(Coffee2::getCal).forEach(System.out::println);
	
	// Coffee2의 데이터중 이름만 변환 
	coffeeStream.map(Coffee2::getName).forEach(System.out::println);
	
	// coffeeStream.sorted().forEach(System.out::println);
	// 위 문법은 맞지만 오류가 남 
	
	// import, add~~ 
	coffeeStream.sorted(
			(n1, n2) -> {return n1.getName().compareTo(n2.getName());})
	//.forEach(System.out::println);
	.forEach(it->System.out.printf("%s\n", it));
	
	}
}
