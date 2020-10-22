package java1022;

// new class
class Generic <T>  {
	private T data[]; 
	// 숫자자료형이나 boolean이 아닌 자료형은 null로 초기화 
	//null : 대입된 인스턴스가 없다 
	
	// 매개변수가 있는 생성자 
	// 데이터를 개수에 상관없이 대입이 가능 : ... 
	public Generic(T...n) {
		data = n;
	}
	
	public void disp() {
		for(T imsi : data) {
			System.out.printf(imsi + "\t");
		}
		System.out.printf("\n");
	}
}

// SOUTH, NORTH, WEST, EAST 만을 갖는 자료형을 생성

enum Direction {SOUTH, NORTH, WEST, EAST;} // 특정한 값 제외한 다른 값을 집어넣지 않기 위해 사용 

public class GenericTest {

	public static void main(String[] args) {
		
		Direction direction = Direction.EAST; // 위의 4개의 값이 아니면 에러 발생 
		
		Generic <String> g1 = new Generic <String>("hungry");
		
		// 인스턴스를 이용해서 disp 호출 
		g1.disp();
		
		// 정수를 출력하는 Generic을 생성해서 출력 
		Generic <Integer> g2 = new Generic <Integer> (1004, 8282);
		
		// 인스턴스 이용해서 disp 호출 
		g2.disp();

	}
}
