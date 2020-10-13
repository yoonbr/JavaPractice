package java1013;

public class ArrayPractice {

	public static void main(String[] args) {
		
		// 이름 배열을 생성과 동시에 초기화
		String [ ] names = {"가가", "나나", "다다", "라라", "마마"};
		// 실수 3개 저장하는 배열 만들고 값을 대입
		double [ ] num = new double [5];
		num [0] = 159.7;
		num [1] = 161.4;
		num [2] = 160.1;
		num [3] = 161.1;
		num [4] = 175.1;
				
		// 반복문을 사용하면 유지보수가 수월해짐
		// 내가 쓴 반복문
//		int i = 0;
//		while (i <= 2) { // index는 0부터 시작하므로 0, 1, 2
//			System.out.printf("이름 : %s, 키: %3.1f\n", names[i], num[i]);
//			
//			i = i + 1;
//
//		}
		// 강사님이 사용하신 반복문
//		for (int e=0; e<3; e=e+1) {
//			System.out.printf("이름 : %s, 키: %3.1f\n", names[i], num[i]);
//		}
		
		// 3이라고 배열의 데이터 개수를 설정하는 부분을 수정
		// 배열의 속성(names.length)으로 설정 - 데이터를 변경해도 출력부분 수정 필요가 없어짐.		
//		for (int e=0; e<names.length; e=e+1) { 
//			System.out.printf("이름 : %s, 키: %3.1f\n", names[e], num[e]);
//		}
		
		//. 으로 접근하거나 [인덱스]로 데이터를 접근하게 되면 메모리를 한번 더 찾아가야 함.
		// 반복문 등에서 동일한 데이터를 여러번 . 이나 [인덱스]를 이용해서 찾아가게 되면 비효율적
		// 이런 경우 이 데이터를 가까운 곳에 저장해두고 접근하는것이 좋음.
		
//		int n = names.length;
//		for (int e=0; e<n; e=e+1) { 
//			System.out.printf("이름 : %s, 키: %3.1f\n", names[e], num[e]);
//		}
		// while문
		int i = 0;
		int n = names.length;
		while (i < n) { // index는 0부터 시작하므로 0, 1, 2
			System.out.printf("이름 : %s, 키: %3.1f\n", names[i], num[i]);
			
			i = i + 1;
		}
		// name말고 다른 변수명 들어가도 가능
		for (String name : names) { // 이름 배열 
			System.out.printf("%s\n", name);
		}
		
		for (double hi : num) { // 키 배열
			System.out.printf("%3.1f\n", hi);
			
		}
	}
}
