package java1020;

public class Temp {

	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i = i + 1) { 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("%d\n", i);
		}

	} 
}
