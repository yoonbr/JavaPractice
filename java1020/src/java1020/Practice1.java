package java1020;

public class Practice1 {

	public static void main(String[] args) {
		
		// 정수 배열 생성 
		int [] ar = { 20, 24, 17, 26, 22 }; 
		
			// bubble sort
			// 데이터 개수가 n개라고 하면 
			// 최대 n-1 회전 동안 
			// 첫번째 부터 (n-1) - 회전수 까지 자신의 뒤에 있는 데이터와
			// 비교해서 정렬하는 범위 
			int n = ar.length;
			for(int i = 0; i < n-1; i = i + 1) {
				for(int j = 0; j < n-i-1; j = j + 1) { 
					if (ar[j] > ar[j+1]) { // 등호의 방향을 바꾸면 거꾸로 정렬 
						int temp = ar[j];
						ar[j] = ar[j+1];
						ar[j+1] = temp;
					}
				}
				// 반복문 안에서 정렬 과정 출력 
				System.out.printf("%d pass:" , i);
				for(int temp : ar) {
					System.out.printf("%5d", temp);
				}
				System.out.printf("\n");
			}
		
		// 정렬 후의 결과를 출력 
		for(int temp : ar) {
			System.out.printf("%4d", temp);
		}
		System.out.printf("\n");
		
	}
}
