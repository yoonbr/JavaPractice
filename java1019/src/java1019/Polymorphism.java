package java1019;

// 상속하기 
// extends Starcraft 생성 후 하위 클래스에 상속 달아주기 

class Starcraft {
	public void attack () {}
}

class Protoss extends Starcraft {
	public void attack() { 
		System.out.printf("프로토스의 공격\n");
	}
}

class Zerg extends Starcraft{
	public void attack() { 
		System.out.printf("저그의 공격\n");
	}
}

class Terran extends Starcraft{
	public void attack() { 
		System.out.printf("테란의 공격\n");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// 3개의 클래스에 존재하는 인스턴스 메소드 호출
		// 상위 클래스에 스태틱 붙은 클래스가 없으므로 인스턴스 생성 
		Starcraft star = new Protoss();
		star.attack();
		
		star = new Zerg();
		star.attack();
		
		star = new Terran();
		star.attack();
		
		star = new Starcraft(); // Starcraft 인스턴스 생성 가능		

	}
}
