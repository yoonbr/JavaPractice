package java1020;

import java.io.IOException;

public class ThrowsException {
	
	// main 메소드에서 호출할 수 있도록 static 메소드로 생성 
	// 이 메소드에서 발생하는 예외는 메소드를 호출하는 곳에서 처리
	public static void method() 
			throws Exception { // ArithmeticException 써도 가능 
		int i = 10;
		int j = 0; 
		System.out.printf("%d\n", i % j);
	}
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			
				e.printStackTrace();
		}
		// Runtime 인스턴스 생성  
		Runtime r = Runtime.getRuntime();
		// Runtime의 exec 메소드는 예외처리를 강제 
		// 예외처리 구문으로 감싸서 실행 
		try {
			r.exec("open /System/Applications/TextEdit.app");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
