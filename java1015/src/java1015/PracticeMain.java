package java1015;

public class PracticeMain {

	public static void main(String[] args) {
		
		// Practice 인스턴스 2개 생성 
		// static {} 은 1개만 호출, {} 은 2번 호출 되어야 함 
		Practice aa = new Practice();
		Practice bb = new Practice();
	
		// Hello Java 3번 출력
		aa.disp();
		
		// Hello Kotlin 출력 
		System.out.println("Hello Kotlin");
		
		// Hello Java 3번 출력
		aa.disp(); 
		
		// Hello Java n번 출력
		aa.print(5); // 5번 출력 		
		aa.print(7); // 7번 출력 
		
		// Practice 클래스에 있는 add 함수를 호출 (실행)
		// public void add (int a, int b),스태틱 없음
		// 인스턴스 생성
		Practice practice = new Practice();
		//정수 매개변수 2개를 요구하므로 2개를 대입해 호출  
		practice.add(30, 70); 
		// 위의 경우는 리턴되는 데이터가 없기 때문에 다른 작업을 호출 할 수 없음. 
		// 작업 끝 
		
		// public int addReturn(int a, int b)
		int r = practice.addReturn(30, 70);
		// 결과 출력
		System.out.printf("결과:%5d\n", r); 
		
		// return 받은 결과가 있으므로 이 결과를 가지고 다음 작업에 이용이 가능
		r = practice.addReturn(r, 50);
		System.out.printf("결과:%5d\n", r); 
		
		r = practice.addReturn(r, 40);
		System.out.printf("결과:%5d\n", r); 
		
		
		// PracticeMain 클래스의 main 메소드에서 위에서 만든 메소드를 호출
		// Practice 클래스의 static 메소드 호출 
		Practice.init();
		
		// Math 클래스에서는 0.0 에서 1.0 사이의 랜덤한 숫자를 생성해주는 메소드가 존재
		// 이 메소드 원형은 아래와 같음
		// static double random()
		// 0.0 에서 1.0 사이의 랜덤한 숫자를 1개 출력 
		double random = Math.random(); {
			System.out.printf("결과:%5f\n", random); 
		}
		
		// Math 클래스에는 실수를 소수 첫째 자리에서 반올림해주는 
		// 아래와 같은 함수가 존재한다. 이 함수를 이용해서 6.78을 소수 첫째 자리에서
		// 반올림해서 출력 
		// static long round (double a)
		
		long r1 = Math.round(6.78); 
			System.out.printf("결과:%d\n", r1); 
			
			practice.thisCheck(100);
			
	}
}
	
		
		
			
			

	


