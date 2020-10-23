package java1023;

import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		
		// String을 저장하는 LinkedList생성 
		
		LinkedList<String> list = new LinkedList<String>();
		// 데이터 추가
		list.add("mintchoco latte");
		list.add("dolche latte");
		list.add("cream latte");
		list.add("vanilla latte");
		list.add(0, "hot chocolate");
		list.add("hazelnut latte");
		
		// 데이터 지우기 
		list.remove(2);
		
		// 데이터 정렬
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		// 전체 변수 출력 (1개 변수 생성)
		for(String latte : list) {
			System.out.printf("%s\n", latte);
		}
		
	}
}
