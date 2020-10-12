package java1007;

public class Logical {
	
	public static void main(String[] args) {
		int su = 10;
		// 위의 수가 3의 배수인지 확인
		// 3의 배수는 3으로 나눈 나머지가 0인 수 
		if(su % 3 == 0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수 아님");
		}
		
		// 3의 배수이고 4의 배수인지 확인
		// && 대신 ll을 설정하면 또는 
		if(su % 3 == 0 && su % 4 == 0) {
			System.out.println("3의 배수이고 4의 배수임");
		}else {
			System.out.println("3과 4의 공통 배수는 아님");
		}
		
		int su2 = 12;
		// 위의 수가 3의 배수인지 확인
		// 3의 배수는 3으로 나눈 나머지가 0인 수 
		if(su2 % 3 == 0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수 아님");
		}
		
		if(su2 % 3 == 0 && su2 % 4 == 0) {
			System.out.println("3의 배수이고 4의 배수임");
		}else {
			System.out.println("3과 4의 공통 배수는 아님");
		}
	 
		// 1~100까지의 3의 배수이고 4의 배수인 데이터를 확인하고자 하는 경우
		if(su % 3 == 0 && su % 4 == 0); //3의 배수가 33, 4의 배수가 25
		if(su % 4 == 0 && su % 3 == 0); //4의 배수가 25, 3의 배수가 33 > 이게 더 데이터를 빨리 찾아냄
		
		// 다음 년도가 윤년이면 윤년이라고 출력하고, 윤년이 아니면 아니라고 출력
		int year = 2020;
		// 윤년이 되는 2가지 조건 - 둘 중 하나만 만족
		// 4의 배수이며 100의 배수는 아닌 경우
		// 400의 배수인 경우
		
	    // 2020년은 4의 배수이며, 100의 배수가 아닌 조건에 부합.
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("year는 윤년");
		}else {
			System.out.println("year는 윤년 아님");
		}
		
		int year2 = 2018;
		// 2018년은 400의 배수가 아니며, 4의 배수도 아니므로 조건에 부합하지 않음 (100의 배수 확인 안해도 됨)
		if (year2 % 400 == 0 || year2 % 4 == 0 && year2 % 100 != 0) {
			System.out.println("year는 윤년");
		}else {
			System.out.println("year는 윤년 아님");
		}
		
		int year3 = 2400;
		// 2400년은 4의 배수이므로 조건에 부합 
		if (year3 % 400 == 0 || year3 % 4 == 0 && year3 % 100 != 0) {
			System.out.println("year는 윤년");
		}else {
			System.out.println("year는 윤년 아님");
				
		}
		
		int year4 = 2024;
		// 2024년은 400의 배수가 아니지만, 4의 배수이며 100의 배수가 아니므로 조건에 적합
		if (year4 % 400 == 0 || year4 % 4 == 0 && year4 % 100 != 0) {
			System.out.println("year는 윤년");
		}else {
			System.out.println("year는 윤년 아님");
		}
		
	}

}
