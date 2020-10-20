package java1020;

public class Lotto {

	public static void main(String[] args) {
		
		// 로또번호 6개 저장할 배열 생성
		// 로또번호는 정수
		int [] lotto = new int[6];
		
		// 6개의 정수를 입력받아서 lotto 배열에 저장 
		// 스캐너 생성 
		// 1. 키보드로 부터 입력받기 위한 인스턴스 생성 , 끝에 close 미리 넣기 
		java.util.Scanner sc = new java.util.Scanner(System.in);
	
		int len = lotto.length;
		// 반복문 생성 
		for(int i = 0; i<len; i = i + 1) {
			System.out.printf("1~45 사이의 숫자를 중복되지 않게 입력하세요 : ");
			// i번째 데이터 입력 
			lotto[i] = sc.nextInt();
		
			// 1부터 45 사이인지 검사해서 
			// 1~45 사이가 아니면 경고메시지를 출력하고 
			// 무효화 시키는 코드를 작성 
			// if (!(lotto[i] >= 1 && lotto[i] <= 45))
			if(lotto[i] < 1 || lotto[i] > 45) {
				System.out.printf
				("번호를 다시 입력하세요\n");
				i = i - 1; 
				continue;
			}
				
		// 중복 검사
		// 두번째 데이터부터 수행
		// 첫번째 부터 자신의 바로 이전 데이터까지 자신과 비교해서 
		// 값이 같은 데이터가 있으면 데이터 중복
		// 이 경우에도 다시 입력하도록 해주어야 합니다. 
		
		// 0 - 안함
		// 1 - 0
		// 2 - 0, 1
		// 3 - 0, 1, 2, 3
		// 4 - 0, 1, 2, 3, 4
		// 5 - 0, 1, 2, 3, 4, 5
		// 출발점은 0번, i 보다 작음 
		if (i > 0) { 
			// 중복된 데이터가 있는지 확인하기 위한 변수 
			boolean flag = false;
			for(int j = 0; j<= i-1; j = j + 1) {
				// 데이터가 중복되었다면 
				// flag 를 true로 변경 
				if(lotto[i] == lotto[j]) { 
					flag = true;
					break;
			}
			
		}
		// 데이터가 중복되었다면
			if (flag == true) {
				System.out.printf
				("중복된 데이터 입니다.\n");
				i = i - 1;
				continue;
			}
		}
	}
		
		sc.close();
		
		// 버블 정렬을 이용해서 내림차순 정렬하도록 코드를 작성 (낮 -> 높)
		// 오름차순과 내림차순 차이는 등호 방향차이
		// 데이터 개수 저장 
		int n = lotto.length;
		// 회전
		for(int i=0; i < n-1; i = i+1) {
			for(int j=0; j < n-i-1; j = j+1) {
				if (lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		
		// lotto 배열에 저장된 데이터를 출력 
		// temp 로 임시변수 생성 
		for(int temp : lotto) {
			System.out.printf("%5d", temp);
		}
		System.out.printf("\n");
		
	}
}
