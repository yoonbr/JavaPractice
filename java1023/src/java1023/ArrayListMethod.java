package java1023;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListMethod {

	public static void main(String[] args) {
		
		// 문자열 ArrayList 생성 + 에러메시지 밑줄 대서 import 생성해주기
		ArrayList<String> list = new ArrayList<String>();

		// 데이터 추가
		list.add("cafe latte");
		list.add("americano");
		list.add("frapucchino");
		list.add("smoothie");
		list.add(2, "cafe mocha"); // 중간에 끼워넣고 싶을 때

		// 데이터 개수 확인 (size)
		System.out.printf("데이터 개수:%d\n", list.size());

		// smoothie 삭제
		// list.remove(4);
		list.remove("smoothie");

		// 전체를 순회해서출력 (smoothie가 지워져서 4개만 출력됨)
		for (String coffee : list) {
			System.out.println(coffee);
		}

		// 데이터를 정렬
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1); // 오름차순은 o1(o2),내림차순은 o2(o1)로 바꿔줌 
			}

		});
		System.out.printf("=======================\n");
		// 전체를 순회해서 출력
		for (String coffee : list) {
			System.out.println(coffee);
		}

	}
}
