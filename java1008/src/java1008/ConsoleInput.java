package java1008;

public class ConsoleInput {

	public static void main(String[] args) {
		
		// 키보드로 부터 입력 받는 Scanner 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);
				
		// 이름 입력받기
		System.out.printf("이름입력:");
		String name = sc.nextLine();
				
		// 국어점수 입력 받기
		System.out.printf("국어점수입력:");
		int score1 = sc.nextInt();

		// 수학점수 입력 받기
		System.out.printf("수학점수입력:");
		int score2 = sc.nextInt();
				
		// 주소 입력받기
		System.out.printf("주소입력:");
		// *즁요* 숫자 다음 문자열 입력 받을땐 버퍼를 비우기 위해 한 번 호출 해야함!
		sc.nextLine();
		String address = sc.nextLine();		
				
		System.out.printf("이름:%-10s국어점수:%-10s수학점수:%-10d주소:%s\n", name, score1, score2, address);	
		
		sc.close(); // *스캐너 종료 중요!* close 전에 다 입력하기!

	}
}
