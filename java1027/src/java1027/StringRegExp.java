package java1027;

import java.util.regex.Pattern;

public class StringRegExp {

	public static void main(String[] args) {
		
		// 올바른 전화번호인지 확인 
		// 전화번호 정규표현식 찾기 
		Pattern p = Pattern.compile("^\\d{2,3}-\\d{3,4}-\\d{4}$"); 
		// 검사할 문자열 배열 생성 
		String [] phones = {
					"010-0000-0000", 
					"윤디", 
					"보니", 
					"031-0000-0000", 
					"다다",
					"americano", 
					"cafe라떼"
					};
		
		// 전화번호 존재 여부 확인 
		for(String imsi : phones) {
			System.out.printf("%b\n", p.matcher(imsi).find());
		}
	}
}
