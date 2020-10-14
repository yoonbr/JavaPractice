package java1014;

public class DescriptiveStatistics2 {

	public static void main(String[] args) {
		
		// 기술 통계
		// 이름 배열 만들기
		String [ ] names = {"GAGA", "NANA", "DADA", "RARA", "MAMA", "BABA"};
			
		// 정수 배열 만들기
		int [ ] scores = {77, 94, 60, 82, 55, 95};
		
		// score이 가장 높은 name 찾기
		// 가장 높은 score을 저장하기 위한 변
		int maxScore = 0;
		// 가장 높은 score의 name을 저장할 변수를 생성
		String maxName = "";
		
		// 배열을 순회
		// 빠른 열거를 사용하지 않은 이유는 2개의 배열을 이용하기 때문 
		for (int i = 0; i < scores.length; i = i+1) {
			// i 번째 score를 score에 대입
			int score = scores[i];
			
			// i 번째 name을 대입
			String name = names[i];
			
			// 배열 안의 값과 최대값을 비교해서 
			// 배열 안의 값이 최대값보다 크면 최대값을 배열 안의 값으로 변경 
			if(maxScore < score) {
				maxScore = score;
				//가장 큰 값이 변경될 때 그 때의 name을 maxName으로 변경 
				maxName = name; 
			}
		}
		System.out.printf("고득점:%s 큰 값:%d\n", 
				maxName, maxScore);
		
		// score가 80에 가장 가까운 데이터와 그 데이터의 name을 조회
		// 가까운 데이터를 찾을때는 차이가 제일 적은 데이터를 찾아야함
		// 차이에는 음수가 없음.
		// 모든 데이터의 차이를 구해서 그 차이가 최소인 데이터를 찾아야 함
		// 스마트 폰 앱 등에서 가까운 곳 찾기에 많이 사용
		
		// 차이가 가장 적은 값을 저장할 변수 생성
		int minDistance = 100;
		// 차이가 가장 작은 이름을 저장할 변수 생성
		String minName = "";
		for (int i = 0; i < scores.length; i = i+1) {
			// i 번째 score를 score에 대입
				int score = scores[i];
			// i 번째 name을 name에 대입 
				String name = names[i];
				// 80과 score의 차이구하기 
				 	int distance = score - 80;
				 	// 거리는 인수가 없기 때문에 음수가 나오면 -1을 곱해서 
				 	// 양수를 만들어야 함 
				 	if(distance < 0) {
				 		distance = distance * -1;
				 	}
				 	// distance가 가장 작은 데이터 찾기 
				 	if (minDistance > distance) {
				 		minDistance = distance;
				 		minName = name;
				 	}
				 	
				}
		
		System.out.printf("80에 가장 가까운 이름:%s\n", minName);
		
	}
}
