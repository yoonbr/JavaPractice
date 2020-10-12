package java1006;

public class MyInformation {

	public static void main(String[] args) {
		
		// 이름, 나이, 키, 몸무게, 성별, 결혼여부 저장 후 출력 
		// 이름 문자열, 나이, 키 정수, 몸무게 실수, 성별 F/M, 결혼여부 true, false	
		//필요한 변수를 선언하고 값을 대입		
		String name = "YOONBR";
		int age = 00;
		int height = 160;
		double weight = 0.0;
		char gender = 'F';
		boolean marriage = false;
			
			
		// 출력하기 - 변수는 출력하는 함수에 대입하면
		// 저장하고 있는 값을 출력해줌.
		// "" 과 변수를 + 로 연결하면 결합 가능.
		// 한꺼번에 주석달기 컨+슬래시
//	 		System.out.println("이름은 " + name);
//			System.out.println("나이는 " + age);
//			System.out.println("키는 " + height);
//			System.out.println("몸무게는 " + weight);
//			System.out.println("성별은 " + gender);
//			System.out.println("결혼여부는 " + marriage);

	// \t = 탭,  \n = 줄바꿈
		System.out.println("이름\t" + name + "\n" + "나이\t" + age + "\n" + "키\t" + height 
			+ "\n" + "몸무게\t" + weight + "\n" + "성별\t" + gender + "\n" + 
			"결혼여부\t" + marriage);
			
	// 하나의 글자를 묶을땐 작은따옴표 가능, 큰따옴표는 한개이상
		
	}	
}


