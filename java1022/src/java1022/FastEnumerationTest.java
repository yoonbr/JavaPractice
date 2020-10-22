package java1022;

public class FastEnumerationTest {

	public static void main(String[] args) {
		
		String [] coffee = 
			{"americano", "latte", "coldblew", "frapucchino", "tea"};
		// 위의 내용을 순서대로 줄 단위로 출력 
		
		// 인덱스를 활용하는 방법 
		int len = coffee.length;
		for(int i=0; i<len; i=i+1) {
			System.out.printf("%s\n", coffee[i]);
		}
		
		// 빠른 열거를 활용하는 방법 
		for (String j : coffee) {
			System.out.printf("%s\n", j);
		}
		// 결과가 같아야 이 방법을 사용함 
	}
}
