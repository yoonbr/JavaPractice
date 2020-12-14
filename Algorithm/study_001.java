package study;

public class study_001 {

	public static void main(String[] args) {
		Double a, b = 1.0;
		double hab = 0;
		for(a=1.0; a<=9; a=a+1) {
			b = b + 1;
			hab = hab + a/b;
			System.out.print(a + "/" + b + " ");
			}
			System.out.println(" 의 합 : " + hab);
	}

}