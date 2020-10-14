package java1014;


public class Lotto {

	public static void main(String[] args) {
		
		// 로또번호 6개 저장할 배열 생성
		// 로또번호는 정수
		int [] lotto = new int[6];
	
		// lotto 배열에 저장된 데이터를 출력 
		// temp 로 임시변수 생성 
		for(int temp : lotto) {
			System.out.printf("%5d", temp);
		}
		System.out.printf("\n");
		
	}
}
