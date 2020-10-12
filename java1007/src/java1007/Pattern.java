package java1007;

public class Pattern {

	public static void main(String[] args) {
		try { //문제생기면 해결
			int x = 0;
			while(true) {
				Thread.sleep(1000000);
				if(x % 7 == 0)System.out.println("월요일");
				else if(x % 7 == 1) System.out.println("화요일");
				else if(x % 7 == 2) System.out.println("수요일");
				else if(x % 7 == 3) System.out.println("목요일");
				else if(x % 7 == 4) System.out.println("금요일");
				else if(x % 7 == 5) System.out.println("토요일");
				else if(x % 7 == 6) System.out.println("일요일");
				x++;
			}
		}catch(Exception e) {}
	}
}
