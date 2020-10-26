package java1026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Matrix {

	public static void main(String[] args) {
		
		// 학과 별 근로장학생 명단을 저장 
		// 학과별로 분할되어 있음 
		
		// 1차원 배열 
		String [] 호텔조리학과 = {"가가","나나","사사"};
		String [] 해군부사관과 = {"라라", "바바", "마마"};
		String [] 패션디자인과 = {"다다", "아아"}; // 배열 추가해도 오류 없음 
		String [] 전기과 = {"자자", "차차"}; // 새로 팀이 추가될 경우 

		// 2차원 배열로 생성 
		// 2차원 배열은 각 배열의 데이터에 변경이 되는 경우에는 아무런 문제가 없을 가능성이 높음 
		// 2차원 배열에 1차원 배열이 추가되면 문제 발생 가능성이 있음
		// 배열을 의미하는 데이터와 배열을 같이 저장하지 않기 때문 
		
		String [][] stu = {호텔조리학과, 해군부사관과, 패션디자인과, 전기과}; // 학과 추가 - 학과 이름이 안바뀜 
		
		// 2차원 배열 출력
		for(int i=0; i<stu.length; i=i+1) {
			String [] lib = stu[i];
			if( i == 0 ) {
				System.out.printf("%-8s", "호텔조리학과:");
			} else if ( i == 1 ) {
				System.out.printf("%-8s", "해군부사관과:");
			} else {
				System.out.printf("%-8s", "패션디자인과:");
			} 
			for(int j=0; j<lib.length; j=j+1) {
				System.out.printf("%5s",lib[j]);
			}
			System.out.printf("\n");
		}
		System.out.printf("===================================\n");
		// 테이블 구조의 데이터를 만들 때는
		// 배열과 배열의 의미를 포함하는 데이터를 하나의 묶음으로 만들어서
		// 이 묶음 데이터의 배열을 생성해야 함 
		
		Map <String, Object> map1 = 
				new HashMap <String, Object>();
		// 학과명 저장 
		map1.put("학과명", "호텔조리학과");
		
		// 학생 명단 배열 
		map1.put("학생", 호텔조리학과);
		
		Map <String, Object> map2 = 
				new HashMap <String, Object>();
		// 학과명 저장 
		map2.put("학과명", "해군부사관과");
		
		// 학생 명단 배열 
		map2.put("학생", 해군부사관과);
		
		Map <String, Object> map3 = 
				new HashMap <String, Object>();
		// 학과명 저장 
		map3.put("학과명", "패션디자인과");
		
		// 학생 명단 배열 
		map3.put("학생", 패션디자인과);
		
		// Map의 배열을 생성 
		/* HashMap<String, Object>[] students = 
				new HashMap<String, Object>[](); */ //error
				
		ArrayList<Map<String,Object>> students = 
		new ArrayList<Map<String,Object>>();
				
		// 데이터 삽입 
		students.add(map1);
		students.add(map2);
		students.add(map3);
		
		// 새로운 데이터 생성 
		Map <String, Object> map4 = 
				new HashMap <String, Object>();
		map4.put("학과명", "전기과");
		map4.put("학생", 전기과);
		
		// student 에 추가 - 출력하는 부분을 변경할 필요가 없음 
		students.add(map4);
		
		// 출력 
		for(Map<String,Object> map : students) {
			// 팀 이름을 출력 
			System.out.printf("%s:", map.get("학과명"));
			// 선수 명단을 가져오기 - 사용을 할 때는 원래의 자료형으로 
			// 반드시 형 변환 수행 String 
			String [] student = (String [])map.get("학생");
			// 선수 명단 출력 
			for(String imsi : student){
				System.out.printf("%5s", imsi);
			}
			System.out.printf("\n");
		}	
	}
}
















