package java1021;

public class String1 {

	public static void main(String[] args) {
		
		// String클래스의 인스턴스 생성
		String apple = "AppleIphone12Mini";
		
		// 2번째 문자 출력
		char ch = apple.charAt(3);
		System.out.printf("%c\n", ch); // 한글자 문자형 입력 
		// 문자열의 길이 출력
		int len = apple.length();
		System.out.printf("%d\n", len); // 문자열의 길이는 정수 
		
		// 문자 1개씩 출력 
		for(int i=0; i<len; i=i+1) { // i가 len보다 작을때까지 
			char temp = apple.charAt(i); // 변수 새로 생성하기 
			System.out.printf("%c\n", temp); 
 		}
		
		String rv1 = "ggangpae1@gMail.com";
		String rv2 = "ggangpae1@kakao.com";
		
		// rv1과 rv2 에 gmail이 포함되어 있는지 판별
		// 대소문자는 구별하지 않음 
		// 전부 소문자로 변경하거나 대문자로 변경해서 진행 
		if(rv1.toLowerCase().indexOf("gmail".toLowerCase()) >= 0) { 
			System.out.printf("rv1에 gmail이 있음.\n");
		} else {
			System.out.printf("rv1에 gmail이 없음.\n");
		}
		if(rv2.toLowerCase().indexOf("gmail".toLowerCase()) >= 0) {
			System.out.printf("rv2에 gmail이 있음.\n");
		} else {
			System.out.printf("rv2에 gmail이 없음.\n");
		}
		
	}
}













