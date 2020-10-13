package java1013;

public class Matrix {

	public static void main(String[] args) {
		
		// 문자열 2차원 배열 생성
		// 2차원 배열은 행번호, 열번호를 정하여 생성해야함.
		
		String [][] names = {
				{"가가", "나나", "다다"},
				{"라라", "마마", "바바"}
		};
		
		// 행의 순회
		for(int i = 0; i < names.length; i = i + 1) {
			// 열의 순회
			for(int j = 0; j < names[i].length; j = j + 1) {
				System.out.printf("%10s", names[i][j]);
			}
			System.out.printf("\n");
		}
		
		// 빠른 열거 이용
		// 배열의 배열이므로 처음엔 배열에 저장하고
		/* for(String [ ] ab : names) {
			// 그 배열을 다시 순서대로 순회
			for(String ims : ab) {
				System.out.printf("%15s", ims);		
			}
			System.out.printf("\n");
		} */
		
		// 일차원 배열을 이차원 배열 처럼 이용
		// 이 구조는 실무에서도 많이 이용
		
		String [ ] al = {
				"a", "b", "c",
				"d", "e", "f"
		};
		
		for(int i = 0; i<al.length; i = i + 1) {
			System.out.printf("%15s", al[i]); // 여기까지 진행하면 한줄로 정렬됨
			if (i % 3 == 2) { // 나머지가 2일때 줄바꿈을 하기 위해 c = [2], 3으로 나누면 나머지 2
				System.out.printf("\n");
		
			}
		}
	}	
}