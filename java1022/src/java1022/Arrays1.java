package java1022;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		
		// 배열 생성
		String [] ar 
			= {"가가", "나나", "다다", "라라", "마마", "바바", "사사"}; 
		
		// 정렬하는 메소드 호출
		Arrays.sort(ar);
		
		int loc = Arrays.binarySearch(ar, "사사"); // ar의 위치에서 라라 찾기
				// 출력 
				System.out.printf("사사 : %d번째\n", loc);
			
				// 보니의 위치 찾기
				int loc2 = Arrays.binarySearch(ar, "보니");
				
				// 출력 : 데이터가 없으므로 음수 출력, 음수는 알 수 없음 
				System.out.printf("보니 : %d번째", loc2);
		
	}
}
