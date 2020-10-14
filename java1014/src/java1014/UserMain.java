package java1014;

public class UserMain {

	public static void main(String[] args) {
		
		// User 클래스의 인스턴스 만들기
		User user1 = new User();
		User user2 = new User();
		
		// user1의 인스턴스의 참조를 user3에 복사
		// user3와 user1은 동일한 인스턴스
		User user3 = user1; 
		
		// user1, user2, user3의 해시코드를 출력 
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		System.out.println(user3.hashCode());
		
		// user1의 프로퍼티와 메소드 호출
		user1.num = 1;
		
		// name은 private으로 만들어졌기 때문에 
		// 인스턴스를 이용해서 접근하면 에러 
		// user1.name = "bonnie";
		
		user1.disp(); 
		
	}
}
