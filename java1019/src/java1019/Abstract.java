package java1019;
	
	//인스턴스를 생성할 수 없는 추상 클래스로 생성 
	abstract class Starcraft1 {
		// 내용이 없는 추상 메소드 
		// 하위 클래스에서 반드시 내용을 만들어 주어야 합니다. 
		// 변수는 만들 수 있지만 new는 못부름 
		abstract public void attack ();
	}

	class Protoss1 extends Starcraft1 {
		@Override
		public void attack() { 
			System.out.printf("프로토스의 공격\n");
		}
	}

	class Zerg1 extends Starcraft1{
		public void attack() { 
			System.out.printf("저그의 공격\n");
		}
	}

	class Terran1 extends Starcraft1{
		public void attack() { 
			System.out.printf("테란의 공격\n");
		}
	}

	public class Abstract {

		public static void main(String[] args) {
			// 3개의 클래스에 존재하는 인스턴스 메소드 호출
			// 상위 클래스에 스태틱 붙은 클래스가 없으므로 인스턴스 생성 
			Starcraft star = new Protoss();
			star.attack();
			
			star = new Zerg();
			star.attack();
			
			star = new Terran();
			star.attack();
			
			// 추상 클래스는 new를 이용해서 인스턴스를 생성할 수 없음 
//			star = new Stracraft1(); // error 인스턴스 생성 안됨 
//			star.attack();

	}
}
