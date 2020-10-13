package java1013;

public class DescriptiveStatistics {

	public static void main(String[] args) {
		
		// 정수 배열 만들기
		int [ ] num = {77, 94, 60, 82, 55, 95};
		
		// 80점이 넘는 데이터의 합계와 개수 그리고 평균 구하기
		// 평균은 소수 첫째자리 까지 구하기 - 소수 둘째자리에서 반올림
		
		// 합계 저장할 변수와 개수를 구할 변수를 생성
		int sum = 0; // 합계 변수
		int ea = 0; // 개수 변수
		
		// 배열 순회
		for(int score : num) {
			// 80이 넘는 데이터를 만나면 score은 sum에 추가
			// 개수는 1 증가
			if(score > 80) {
				sum = sum + score;
				ea = ea + 1;
			}
		}
		
		// 합계와 개수 출력
		System.out.printf("80이 넘는 합계: %d\n", sum);
		System.out.printf("80이 넘는 개수: %d\n", ea);
		
		// 평균 구하기 (합계 / 개수)
		if (ea == 0) {
			// 조건에 맞는 데이터가 없어도 수행하기 위해 if문 작성
			// 나누는 데이터 0인지 아닌지 확인 꼭 해야함
			System.out.printf("조건에 맞는 데이터가 없습니다.\n"); 
		} else {
			// 소수 부분을 구하기 위하여 sum을 double로 형변환 해서 수행
		double avg = (double) sum / ea; 
		// 소수 셋째자리에서 반올림해서 출력하기 위해서
		// 실수 출력형식을 .2f로 설정 
		System.out.printf("80이 넘는 개수 평균: %.2f\n", avg);
		}
		
		// 최대값 최소값 구하기
		// 최대값을 저장할 변수를 생성 - 아주 작은값이나 배열의 첫번째 값으로 초기화
		int max = 0; 
		// 최소값을 저장할 변수를 생성 - 아주 큰 값이나 배열의 마지막 값으로 초기화 
		int min = 100;
		// 배열 순회 하면서 max나 min보다 큰 값이나 작은 값을 만나면 그 값으로 교체
		// 변수 하나 생성 후 if문 작성
		for(int score : num) {
			if(max < score) {
				max = score;
			}
			if (min > score) {
				min = score;
			}
		}
		// 최대값과 최소값 출력하기
		System.out.printf("최대값:%d\n", max);
		System.out.printf("최소값:%d\n", min);	
		
	}
}