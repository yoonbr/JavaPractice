package java1016;

public class UserMain {

	public static void main(String[] args) {
		
		// 인스턴스 생성
		// 프로그램 내에서 인스턴스를 1개만 만드는 경우
		// 인스턴스 이름을 클래스 이름으로 하는데 첫글자를 소문자로 변경 
		User user = new User();
		user.setNum(1);
		user.setId("yoond");
		user.setPw("abc1234");
		user.setNickname("AA");
		user.setName("가가");
		
		System.out.printf("%s\n", user);
		
	}
}
