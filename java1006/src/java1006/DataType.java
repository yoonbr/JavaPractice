package java1006;

public class DataType {
	
	public static void main(String[] args) {
		
		char ch = 'A' + 3;
		int i = 'A' + 3;
		// 문자 변수에 저장해서  D
		System.out.println("ch:" + ch);
		// 정수 변수에 저장해서 68
		System.out.println("i:" + i);
		// 문자열과 숫자를 더하기하면 결합 A1
		String str = "A" + 1;
		System.out.println("str:" + str);
		
		// Overflow가 발생해서 음수가 저장됨
		int result = 2100000000 + 100000000;
		System.out.println("result:" + result);
		
		// 0.1을 100번 더했는데 10.0이 아닌 결과를 출력
		// 표현상의 한계로 인한 결과 발생
		double sum = 0.0;
		for(int k=0; k<100;k=k+1) {
			sum = sum + 0.1;
		}
		
		System.out.println("sum:" + sum);
		
		// byte b = 278; error
		byte b = (byte)278;
		System.out.println("b:" + b);
		
		
		int j = (int)10.7;
		System.out.println("j:" + j);
		
	}
}
