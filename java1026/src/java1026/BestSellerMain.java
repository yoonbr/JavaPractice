package java1026;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BestSellerMain {

	public static void main(String[] args) {
		
		// Bestseller 인스턴스 1개를 생성하고, 값을 설정 
		BestSeller bestseller = new BestSeller();
		bestseller.setRank(1);
		bestseller.setBookname("아몬드"); 
		bestseller.setWriter("손원평");
		bestseller.setDate("2017-03-31");
		bestseller.setPrice(10800);
		bestseller.setScore(5.0);
		
		// BestSeller 인스턴스의 값을 각각 출력 	
		/* System.out.printf("순위:%d, 도서명:%s, 저자:%s\n", bestseller.getRank(), 
				bestseller.getName(), bestseller.getWriter()); */
		
		// DTO 대신 사용하는 map
		Map <String, Object> map = 
				new HashMap <String, Object>();
		
		// 데이터 저장 (map.put ())
		map.put("rank", 1);
		map.put("bookname", "아몬드");
		map.put("bookwriter", "손원평"); // writer -> bookwriter로 수정해도 오류없이 출력 
		map.put("date", "2017-03-31");
		map.put("price", 10800);
		
		// 데이터 출력 
		Set<String> keySet = map.keySet();
		for(String key : map.keySet()) {
			System.out.printf("%s:%s\n", key, map.get(key));
		}
		
	}
}
















