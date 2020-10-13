package java1013;

public class PerfectNumber {

	public static void main(String[] args) {
		
		//2부터 1000까지 완전수의 개수 구하기
		//완전수: 자기 자신을 제외한 약수의 합이 자기 자신과 동일한 수
		
		//완전수 개수를 저장할 변수
		int cnt = 0;
		//2부터 1000까지
		for (int su = 2; su <= 1000; su = su + 1) {
			//약수의 합을 저장하기 위한 변수
			int sum = 1; //1은 모든 수의 약수이므로 미리 합을 구함
			//약수를 구하기 위해서 2부터 자신의 절반까지 나누기
			for (int i = 2; i<=su/2; i=i+1) {
				//나누어서 나머지가 없으면
				if (su % i == 0) {
					//약수이므로 sum에 추가
					sum = sum + i;
				}
			}
			//약수의 합 구하기 종료
			//약수의 합과 자신이 같으면 개수 1 추가
			if (su == sum) {
				cnt = cnt + 1;
				//확인해보기 위해서 su 출력
				System.out.printf("완전수 : %d\n", su);
			}
		}
		System.out.printf("완전수 개수 : %d\n", cnt);
		
	}
}