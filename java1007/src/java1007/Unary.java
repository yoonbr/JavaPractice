package java1007;

public class Unary {
	
	public static void main(String[] args) {
		// 변수 선언
		boolean result = true;
		int x = 10;
		
		// !붙이면 반대로 결과 리턴
		System.out.println("!result=" + (!result));
		
		//증감 연산자 사용
		++x; //변수의 값을 1증가
		x++; 
		
		System.out.println("++x:" + x); 
		System.out.println("x++:" + x); 
		
		++x; // 앞에 붙으면 증감 후 명령어에 사용 증감을 먼저 해서 12를 만들고 출력
		x++; // 뒤에 붙으면 명령어 사용 후 변수 값 증감 출력 후 증감 하기 때문에 12를 출력하고 x는 13이 됨.

	}

}
