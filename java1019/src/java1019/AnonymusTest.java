package java1019;
// 상위 클래스 생성

class Super {
	public void method() { 
		
	}
}

// super 클래스의 method의 기능확장을 위해서 하위 클래스를 생성하고
// 메소드를 재정의

class Sub extends Super {
	@Override
	public void method () {
		System.out.printf("하위 클래스를 만들고 재정의 \n");
	}
}
public class AnonymusTest {

	public static void main(String[] args) {
		// 상위 클래스 타입이나 인터페이스 타입으로 변수를 만들고
		// 하위 클래스 타입의 인스턴스를 대입해서 필요한 메소드를 호출 
		Super s = new Sub(); // 인스턴스를 만들어서 
		s.method(); // 메소드를 호출
		
		// anonymus 이용
		// 하위 클래스 없이 상위 클래스의 메소드를 오버라이딩 해서 
		// 필요한 메소드를 구현하고 호출 
		new Super () { 
			@Override
			public void method() {
				System.out.printf("하위 클래스를 만들고 재정의 \n");
			}
		} 
		.method();;
		
		// 변수에 담아서 출력 
		Super s1 = new Super() {
		@Override
		public void method () {
			System.out.printf("하위 클래스를 만들고 재정의 \n");
			}	
		};
		s1.method();
		
	}
}