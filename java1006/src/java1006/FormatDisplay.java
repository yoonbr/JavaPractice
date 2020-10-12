package java1006;

public class FormatDisplay {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		System.out.printf("%02d\n",a);
		System.out.printf("%02d\n",b);
		
		String name1 = "YOONBR";
		int age1 = 20;
		
		String name2 = "BONNIE";
		int age2 = 20;
		
		System.out.printf("%-5s%3d\n", name1, age1);
		System.out.printf("%-5s%3d\n", name2, age2);
		
	}
}
