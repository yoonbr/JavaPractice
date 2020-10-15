package java1015;

public class Lotto {

	public static void main(String[] args) {
		
		// 로또번호 6개 저장할 배열 생성
		// 로또번호는 정수
		int [] lotto = new int[6];
		
		// 6개의 정수를 입력받아서 lotto 배열에 저장 
		// 스캐너 생성 
		// 키보드로 부터 입력받기 위한 인스턴스 생성 , 끝에 close 미리 넣기 
		java.util.Scanner sc = new java.util.Scanner(System.in);
	
		int len = lotto.length;
		// 반복문 생성 
		for(int i = 0; i<len; i = i + 1) {
			System.out.printf("1~45 사이의 숫자를 중복되지 않게 입력하세요 : ");
			// i번째 데이터 입력 
			lotto[i] = sc.nextInt();
		}
	
		// lotto 배열에 저장된 데이터를 출력 
		// temp 로 임시변수 생성 
		for(int temp : lotto) {
			System.out.printf("%5d", temp);
		}
		System.out.printf("\n");
		
		sc.close();
		
	}
}
