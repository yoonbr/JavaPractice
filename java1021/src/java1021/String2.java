package java1021;

public class String2 {

	public static void main(String[] args) {
		
		String str = "web/update/123";
		// 마지막 / 다음에 123을 추출 (스플릿, 서브스트링-위치 기준)해서 정수로 변환해서 출력 
		// String의 메소드와 문자열을 숫자로 변환하는 메소드를 이용
		
		// split 이용
		String [] ar = str.split("/");
		int num = Integer.parseInt(ar[ar.length-1]);
		System.out.printf("%d\n", num);
			
		// substring 이용 
		// 마지막 /의 위치 찾기
		int idx = str.lastIndexOf("/");
		String articleNum = str.substring(idx + 1);
		System.out.printf("num:%s\n", articleNum);
		
		String password = "Dokki1000Dki!";
		// password에서 대문자의 개수 세기 
		// 글자 단위로 가져와서 'A'보다 크거나 같고 'Z보다 작거나 같은
		// 데이터의 개수를 세면 됨
		int upperCnt = 0; 
		for(int i=0; i < password.length(); i = i+1) {
			char ch = password.charAt(i);
			if(ch >= 'A' && ch <= 'Z') { 
			upperCnt = upperCnt + 1; 
			}
		}
		System.out.printf("대문자 개수:%d\n", upperCnt);
		
		// password에서 대문자도 아니고 소문자도 아니고 숫자도 아닌 
		// 데이터의 개수 세기 
		int etcCnt = 0; 
		for(int i=0; i < password.length(); i = i+1) {
			char ch = password.charAt(i);
			if(!(ch >= 'A' && ch <= 'Z' ||
				ch >= 'a' && ch <= 'z' ||
				ch >= '0' && ch <= '9')){ // 앞에 느낌표로 묶어버리면 아닌것으로 바뀜 
				etcCnt = etcCnt + 1; 
			}
		}
		System.out.printf("특수문자 개:%d\n", etcCnt);
		
	}
}	