package java1029;

public class InsertionSort {

	public static void main(String[] args) {
		
		// * 삽입 정렬 *
		// 1. 데이터 생성 
		int [ ] data = {5, 3, 8, 4, 9, 1, 6, 2, 7};
		// 2. 정렬 전 데이터 출력 - 빠른 열거 
		for(int imsi : data) {
			System.out.printf("%5d",imsi);
		}
		System.out.printf("\n");
		
		// 3. 2번째 부터 마지막 데이터까지 
		for(int i = 0; i < data.length; i = i + 1) {
			// 데이터 복사 
			int key = data[i];
			// 4. 바로 앞에서 부터 맨 앞까지
			int j = i - 1;
			for(; j>=0; j=j-1) {
				// 5. 삽입한 데이터가 더 크면 비교 종료 
				if(key > data[j]) {
					break;
				} 
				// 6. 비교 되는 데이터가 더 크면 비교 되는 데이터를 다음칸으로 복사 
				else { 
					data[j+1] = data[j];
				}
			} // 7. 비교가 종료되면 key의 데이터를 종료된 다음으로 복사해줌 
			data[j+1] = key;
			
			// 8. 각 패스마다 정을 출력 
			for(int imsi : data) {
				System.out.printf("%5d",imsi);
			}
			System.out.printf("\n");
			}
		
	}
}

