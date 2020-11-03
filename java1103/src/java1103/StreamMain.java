package java1103;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		List<Coffee> list = new ArrayList<Coffee>();
		list.add(new Coffee (1, "Americano", "no milk", 20));
		list.add(new Coffee (2, "Cafe Latte", "milk", 180));
		list.add(new Coffee (3, "Frapucchino", "milk", 215));
		list.add(new Coffee (4, "Ice Choco", "milk", 190));
		list.add(new Coffee (5, "RoseTea", "no milk", 10));
		
		// mlik로 분류 
		System.out.printf("%s\n",
				list.parallelStream().collect(Collectors.groupingBy
						(Coffee::getMilk)));
		
		// 우유 첨가 별 칼로리의 평균
		
		System.out.printf("%s\n",list.stream().collect(Collectors
				.groupingBy(Coffee::getMilk, Collectors.averagingDouble
						(Coffee::getCal))));

	}
}
