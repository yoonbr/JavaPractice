package java1014;

public class SelectionSort {

	public static void main(String[] args) {
		
		// 정렬 할 배열을 생성
		int [] number = {12, 43, 28, 9, 3};
		// 데이터 출력 
		System.out.printf("초기상태:");
		for(int ar : number) { // 빠른 열거 진행
			System.out.printf("%5d",ar);
		}
		System.out.printf("\n");
		
		// 선택정렬 
		for(int i = 0; i < number.length-1; i = i + 1) {
			for(int j = i + 1; j < number.length; j = j + 1) {
				if (number[i] > number[j]) {
					int temp = number[i]; 
					number[i] = number[j];
					number[j] = temp;
				}
			} // 정렬 과정 출력 
			System.out.printf("%d pass:" , i);
			for(int temp : number) {
				System.out.printf("%5d", temp);
			}
			System.out.printf("\n");
		} // 정렬 결과 출력 
		System.out.printf("정렬결과:");
		for(int temp : number) {
			System.out.printf("%5d", temp);
		}
		System.out.printf("\n");
		
	}
}
