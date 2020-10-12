package java1007;

public class Pattern2 {
	
	public static void main(String[] args) {
		try { //문제생기면 해결
			int x = 0;
			while(true) {
				Thread.sleep(1000);
				if(x % 4 == 0)System.out.println("가");
				else if(x % 4 == 1) System.out.println("나");
				else if(x % 4 == 2) System.out.println("다");
				else if(x % 4 == 3) System.out.println("라");
				x++;
			}
		
		}catch(Exception e) {}

	}

}
