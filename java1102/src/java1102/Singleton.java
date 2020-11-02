package java1102;

import java.util.ArrayList;
import java.util.List;

//인스턴스를 1개만 생성할 수 있는 클래스의 디자인 패턴 - 싱글톤 
// 공유 자원을 소유한 클래스나 서버의 작업 처리 클래스가 싱글톤으로 디자인됨
public class Singleton {
	// 공유할 데이터 생성 (문자열 list, DTO의 class)
			private List<String> strList;
			private List<Coffee2> coffee2List;
	
	private Singleton() {
		// 공유 데이터 생성 
		strList = new ArrayList<String>();
		strList.add("topinut Latte");
		strList.add("greentea Latte");
		strList.add("choco Latte");
		strList.add("mliktea Latte");
		strList.add("sweetpotato Latte");
		strList.add("choco Latte");
		
		coffee2List = new ArrayList<Coffee2>();
		coffee2List.add(new Coffee2(1, "Americano", "no milk", 20));
		coffee2List.add(new Coffee2(2, "Cafe Latte", "milk", 168));
		coffee2List.add(new Coffee2(3, "Hot Choco", "milk", 243));
		coffee2List.add(new Coffee2(4, "Green tea", "no milk", 30));
		coffee2List.add(new Coffee2(5, "Caramel Latte", "milk", 259));
		
	}
	
	private static Singleton obj;
	
	public static Singleton sharedInstance() {
		
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}

	public List<String> getStrList() {
		return strList;
	}

	public List<Coffee2> getCoffee2List() {
		return coffee2List;
	}

}
