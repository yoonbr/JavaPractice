package java1027;

import java.util.regex.Pattern;

public class EmailReg {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\w+@\\w+\\.\\w+(\\.\\w+)?");
		
		String [] emails = {
				"yxond@naver.com",
				"bonnie.kakao.com",
				"bonnie@kakao.co.kr"
		};
		// 위의 데이터의 이메일이 맞는지 체크 
		for (String imsi : emails) // 
		// 배열의 빠른 열거 
		{
			System.out.printf("%b\n", p.matcher(imsi).find());
		}
		// 1. java에서 정규식을 사용할 수 있는 클래스를 찾고 확인하는 방법을 검색 
		// 2. 이메일 정규식을 검색 
		// 자바스크립트 형태로 검색되면 맨 앞,뒤 / 는 제거함 
	}
}
