package java1014;

public class User {	
	
	// 프로퍼티 	
	// public 이면 class 내부의 메소드에서 사용이 가능하고 클래스 외부에서 인스턴스를 이용해서도 접근 가능 
	public int num;
	// private 
	private String name;
	
	// 메소드
	public void disp() {
		System.out.println(name); // private 이용하여 출력 
		System.out.printf("메소드\n"); 
		
	}
}
