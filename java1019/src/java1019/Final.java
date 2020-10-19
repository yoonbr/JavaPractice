package java1019;

// 클래스 앞에 abstract가 있는 경우 상속받는 클래스를 생성해서 사용 
// class 앞에 final이 있으면 상속할 수 없음 : The type TextEx cannot subclass the final class Test

class Test { 
	// 메소드 앞에 final 붙이면 Overriding 할 수 없음 
	public void method () { // static이 없으므로 인스턴스 생성 
		System.out.printf("메소드\n");
	}
}

class TextEx extends Test {
	@Override
	public void method () {  
		super.method();
		System.out.printf("기능추가\n");
	}
}

public class Final {

	public static void main(String[] args) {
		int n = 10;
		System.out.printf("n:%d\n", n);
		n = 20; 
		System.out.printf("n:%d\n", n);
		
		// final 변수임을 알리기 위하여 변수명을 대문자로 작성 
		final String NAME = "BONNI";
		System.out.printf("name : %s\n", NAME);
		// name = "BONI" 
		// error : final 변수의 값은 변경할 수 없음 
		
		// Test class 메소드 호출해서 실행
		// 메소드 볼때 static 없으면 인스턴스 생성, 있으면 클래스이름으로 실행 
		// static 이 있으면 인스턴스 생성 안하고 Test.method();
		Test test = new TextEx ();
		test.method();
	
	}
}
