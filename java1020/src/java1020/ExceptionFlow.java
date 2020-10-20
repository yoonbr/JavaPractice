package java1020;

public class ExceptionFlow {

	public static void main(String[] args) {
		
		try {
			int [] ar = {20, 30, 10, 50};
			System.out.printf("[0]:%d\n", ar[0]);
			System.out.printf("[1]:%d\n", ar[4]);
		/* } catch (Exception e ) {
			System.out.printf("기타 예외\n"); */ // 클래스 위치 오류 
		 } catch (Exception e ) {
			 // 예외 내용 출력 
			System.out.printf("예외 내용 : %s\n", e.getMessage());
			// 예외 발생 시점을 역추적
			e.printStackTrace();
			System.out.printf("배열 첨자 예외\n");
		} finally {
			System.out.printf("무조건 수행\n");
		}
		// ar을 사용하려면 try 밖으로 빼줘야함 
		
	}
}
