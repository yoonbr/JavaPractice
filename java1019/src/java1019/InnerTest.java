package java1019;

// 외부 클래스 생성 
class Outer {
	// 내부 클래스 생성
	class Inner {
		
	}
	// 내부에서 Inner class 사용 
	Inner inner = new Inner();
	
	// Inner Class에 static 멤버가 있을 때에는
	// class 앞에 static을 추가해줘야 함 
	static class StaticInner {
		static int member = 10;
	}
	
	// LocalInner : 메소드 안에서 만들어진 클래스
	// 메소드 안에서만 사용이 가능 
	public void method() {
		class LocalInner{
			
		}
		LocalInner localinner = new LocalInner();
	}
	// LocalInner는 메소드 외부에서 사용 못함
	// LocalInner localinner = new LocalInner(); > error 
	
}	

public class InnerTest {

	public static void main(String[] args) {
		// 일반 Inner class 는 외부에서는 외부 클래스의 인스턴스를 생성해서 사용
		// Inner inner = new Inner (); - error > inner 클래스는 outer 안에서만 사용 가능  	
		// inner 인스턴스 생성 
		Outer outer = new Outer();
		Outer.Inner inner = outer. new Inner();
		
		// static inner 클래스는 외부 클래스의 인스턴스 없이 사용
		System.out.printf("%d\n", Outer.StaticInner.member);
		
	}
}
