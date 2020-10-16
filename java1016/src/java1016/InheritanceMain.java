package java1016;

	// String msg라는 변수와 disp라는 메소드를 소유한 Base 클래스 
	class Base {
		public String msg = "상위클래스의 msg";
		
		public Base (String msg) { // 생산자 하나 생성 
			this.msg = msg;
		}
		
		public void disp() {
			System.out.printf("상위 클래스의 메소드\n");
		}
	}
	
	// Base class를 상속받은 Drive class 생성
	class Derive extends Base{
		public String msg = "하위 클래스의 msg";
		
		
		// 상위 클래스에 매개변수가 없으면 하위 클래스에 매개변수생성 
		public Derive() {
			super("매개변수");
		} 
		
		public void print() { 
			System.out.printf("하위 클래스의 msg: %s\n", msg);
			
			
			System.out.printf("상위 클래스의 msg: %s\n", super.msg);
		}
		
		@Override
		// Overriding : 상위 클래스에 disp()라는 메소드가 있는데 하위클래스에서 다시 만드는 것 
		public void disp() {
			System.out.printf("상위 클래스의 메소드\n");
		}		
	}
		
	public class InheritanceMain{
	
		public static void main(String[] args) {
		// Drive 클래스의 객체를 생성 
		Derive derive = new Derive();
		// Derive클래스에는 disp가 없지만 Base class에 dis가 있고 Derive는 
		// Base 를 상속 받았으므로 disp 사용 가능
		
		derive.disp();
		
		derive.print();
		
		// 상위 클래스타입의 참조형 변수에는 하위 클래스 타입의 인스턴스 대입 가능
		Base base = derive; // 드라이브가 베이스로부터 상속을 받았기 때문에 들어갈 수 있음 
		
		// 하위 클래스 타입의 변수에 상위 클래스 타입의 인스턴스는 대입할 수 없다 
		// 강제 형변환 이용해서 전환해야함 
		// derive = base; // error
		
		derive = (Derive)base; // 상위 클래스로 강제 형변환 
		
		// 문법적 에러는 안나지만 실행하면 예외가 발생 
		// 위의 base 에는 derive가 들어있는데 아래 문장에는 Base 가 들어있음
		// 위의 경우처럼 원래는 하위 클래스 타입이였는데 상위에 저장하다가 되돌리는 것은 가능하지만
		// 원래 상위 타입인 경우는 실행도중 예외가 발생할 수 있음 
		// ClassCastException 
		// derive = (Derive)(new Base("")); 
		
		// 다형성 구현 (다형성이 없으면 GUI가 존재하지 않음 
		// ex. 마우스 클릭 했는데 상황에 따라 다른 기능을 출력 
		
		Base b = new Base(""); // 상위 클래스에 인스턴스 대입
		b.disp();  // 상위 클래스의 메소드가 호출 
		
		b = new Derive(); // 하위 클래스에 인스턴스 대입 
		b.disp(); // 하위 클래스의 메소드가 호출 
		
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	