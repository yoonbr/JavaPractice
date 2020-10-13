package java1012;

public class Star {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i=i+1) {
			for(int j=1; j<=5; j=j+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		System.out.printf("================\n");
		/*
		 	1*		1-1
		 	2**		1-2
		 	3***	1-3
		 	4****	1-4
		 	5*****	1-5
		 	*이 하나씩 증가하는 구조
		 	변하는 숫자의 증감치를 구해서 바깥쪽 반복문의 변수에
		 	곱한 후 더하기 빼기를 이용해서 결과를 맞추는 작업 수행
		 	1씩 증가하므로 1*i
		*/
		
		for(int i=1; i<=5; i=i+1) {
			for(int j=1; j<=i; j=j+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		System.out.printf("================\n");
		/*
		 	1*****	1-5
		 	2****	1-4
		 	3***	1-3
		 	4**		1-2
		 	5*		1-1
		 	*이 하나씩 감소하는 구조
		 	변하는 숫자의 증감치를 구해서 바깥쪽 반복문의 변수에
		 	곱한 후 더하기 빼기를 이용해서 결과를 맞추는 작업 수행
		 	1씩 증가하므로 -1 * i + 6 => 6-i
		 */
		
		for(int i=1; i<=5; i=i+1) {
			for(int j=1; j<=6-i; j=j+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		System.out.printf("================\n");
		/*
		 	1*		1-1
		 	2**		1-2
		 	3***	1-3
		 	4**		1-2
		 	5*		1-1
		 	3번째 줄 까지는 1개씩 늘어나고 
		 	4번째 줄 부터는 1개씩 줄어드는 구조
		 	하나의 패턴이 아닌 경우에는 동일한 패턴이 적용되는
		 	지점까지 분할을 해서 해결 
		*/
		
		for(int i=1; i<=5; i=i+1) {
			//증가하는 부분
			if(i<=3) {
				for(int j=1; j<=i; j=j+1) {
					System.out.printf("*");
				}
			}
			//감소하는 부분
			else {
				for(int j=1; j<=6-i; j=j+1) {
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}
	}
}
