package java1022;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// 비어 있는 StringBuilder클래스의 인스턴스를 생성
		StringBuilder sb = new StringBuilder();
		
		// 문자열 추가
		sb.append("레드벨벳");
		sb.append("블랙핑크"); // 왜 오류? - 클래스와 메소드 이름이 같음
		
		// sb 내용을 갖는 String 인스턴스를 생성
		String str = sb.toString();
		
		// 출력 
		System.out.printf(str);
		
		// 한 글자 씩 줄단위로 출력 
		int len = str.length();
		for (int i=0; i<len; i=i+1) {
				char ch = str.charAt(i);
				System.out.printf("%c\n", ch);
			
		}
	}
}
