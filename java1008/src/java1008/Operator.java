package java1008;

public class Operator {

	public static void main(String[] args) {
		
		int score = 78;
		/* msg 라는 변수에 score가 60이상이면 합격, 아니면 불합격
		** 삼항연산자 
		 boolean이 리턴되는 식 ? true 일때 수행 할 내용 : false 일때 수행 할 내용 */
		String msg = score >= 60 ? "합격" : "불합격";
		System.out.println(msg);
		System.out.printf("%20s\n", msg);
		
		int a = 20;
		// a = a * 4;로 변경 가능 
		a *= 4;
		System.out.printf("a=%2d\n", a);
		
		int b = 50; 
		b += 20;
		System.out.printf("b=%2d\n", b);
		
		// 다음 2개 변수의 값을 교환
		// n1은 20이 나오고 n2는 30이 나오도록
		// n1이나 n2에 직접 20이나 30은 대입하면 안됨.
		// 데이터가 여러 개 있을 때 순서대로 나열(정렬 - sort)하기 위해서 자주 수행 - swap
		int n1 = 30;
		int n2 = 20;
		
		int temp = n1; //임시변수 생성 후 n1의 값 30 넣어둠
		n1 = n2; // n1은 n2의 값 20으로 변경
		n2 = temp; // n2는 temp에 들어있던 값 30 출력		
		
		System.out.printf("n1:%3d\t n2:%3d\n", n1, n2);

	}
}
