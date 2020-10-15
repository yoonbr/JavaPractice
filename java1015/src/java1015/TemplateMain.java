package java1015;

public class TemplateMain {

	public static void main(String[] args) {
		
		// 1. Template 클래스의 Disp는 고정된 문자열을 출력해주는 메소드 
		// 원형은 static void disp() 
		// 해당 메소드 호출
		// * 스태틱이 있으면 호출 안해도됨 *
//		Template aa = new Template();	
//		aa.disp();
		
		Template.disp();
		
		
		// 2. oneArg는 문자열을 입력받아 출력해주는 메소드 
		// static void oneArg(String)
		// 원하는 메시지 출력 
		// 스태틱이 있으므로 인스턴스 생성 안해도 됨 
//		Template arg = new Template();
//		arg.oneArg(" 매개변수 출력 ");
		
		Template.oneArg(" 메시지 ");
		
		// 3. Template 클래스의 memberDisp는 정수를 입력받아서 출력하는 메소드
		// void memberDisp(int)
		// 원하는 숫자 출력
		// 스태틱 없음 첫번째 할 일 : 인스턴스 생성 
		Template num = new Template();
		num.memberDisp(777); // void이므로 여기서끝!
		
		// 4. returnMemberFunc은 정수의 제곱을 구해주는 메소드 
		// int returnMemberFunc(int)
		// 원하는 숫자를 입력해서 제곱값을 구하고 출력 
		// 스태틱 없으면 객체 생성 
		// Template.returnMemberFunc(5); 작성 후 자료형이 있으므로
		// 자료형 + 이름 왼쪽에 생성 
		int su = Template.returnMemberFunc(5);
		System.out.printf("결과: %d", su);
		
	}
}
