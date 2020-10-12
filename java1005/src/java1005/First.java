package java1005;
// 해당 문장은 없거나 1번만 나옴(소속을 나타내는 단어), 
// 3단 네이밍을 권장(Android, iOS는 3단 네이밍 필수), 
// package없으면 무소속

// import
// package 다음에는 import로 시작하는 문장
// 없거나 1번 이상 사용 가능. import는 소속을 짧게 쓰기 위한 명령어

// class 클래스 이름{내용}, 반드시 1번 이상, 파일을 이름과 클래스 이름중의 하나와 일치해야함. 
// 이클립스는 클래스 이름 정하면 자동으로 이름 생성
// first클래스 생성 -> main 메소드 생성 후 안에 문장 출력 코드 작성
// 소스 코드 내 줄바꿈 아무 의미 X, "{}" -> 하나의 블럭 의미(명령 X) "()" -> 
// 하나의 묶음 해석 ";" -> 한 번에 실행해야 하는 문장 구분 기호 (*중요*)

public class First {

	public static void main(String[] args) {
		
		// system.out = 표준 출력장치, console. 
		// println = 해당 문장을 바로 처리하는데 메시지를 출력하고 *줄 바꿈*을 해줌.
		System.out.println("First Java Program");
		// print = 줄바꿈 안하고 다음 메시지 이어서 출력
		System.out.print("첫번째 자바 프로그램");
		// printf("서식","메시지") 
		System.out.printf("%10s", "Hi"); //Hi를 10칸에 출력. 앞에 8칸 공백 추가
		System.out.printf("\n");
		System.out.println("이름 : yoonbr");
		System.out.println("전화번호 : 010-0000-0000");
		System.out.println("나이 : 00");

	}
}
