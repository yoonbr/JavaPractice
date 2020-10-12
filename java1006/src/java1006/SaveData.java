package java1006;

public class SaveData {
	
	public static void main(String[] args) {
		
		//데이터 저장 (회원정보 등등)
		// 주식명 (문자열)
		// 번호 (정수)
		// 대표홈페이지 (문자열)
		// 금일 종가 (정수)
		// 등락률 (실수)
		
		String name = "두산퓨얼셀";
		String homepage = "www.doosanfuelcell.com";
		int number = 336260;
		int 금일종가 = 37550;
		double 등락률 = -13.18;
				
		System.out.printf("%-10s%-20s%"
				+ "10d%10d%50.2f", name, homepage, number, 금일종가, 등락률);
		
	}
}
