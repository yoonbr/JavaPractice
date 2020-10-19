package java1019;
	
	interface MyInterface {
		public int n = 10; // 인터페이스 안에 변수를 선언하면 무조건 final
		
		// 인스턴스 안에 메소드를 생성하면 무조건 abstract 
		public void method();
		
		// 인터페이스 안에 메소드를 생성하고 내용을 작성하려면 
		// 접근 지정자를 디폴트로 명시해야함 
		default void method1() { 
			System.out.printf("defualt method\n");
		}
	}
	
	// MyInterface 구현 하는 클래스 
	class MyIn implements MyInterface{

		@Override
		public void method() {
			System.out.printf("인터페이스의 메소드 구현\n");
			
		}
	}

	public class Interface {
		
	public static void main(String[] args) {
		// 인터페이스는 new를 이용해서 객체 생성을 못함 
		// MyInterface obj = new MyInterface();
		
		// MyInterface obj = new my MyIn;

	}
}
