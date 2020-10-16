package java1016;

public class UserPracticeMain {

	public static void main(String[] args) {
	
		// 인스턴스 생성
		UserPractice foodtable = new UserPractice();
		foodtable.setData("10월 16일");
		foodtable.setRice("후리가케밥");
		foodtable.setSide("김치, 꼬치어묵, 돈까스, 콩나물무침");
		foodtable.setSoup("미역국");
		foodtable.setCal(523.9);
		
		UserPractice ft = new UserPractice("10월 17일", "잡곡밥", "김치, 버섯볶음, 애호박전",
				"콩나물국", 623.2);
	
		System.out.printf("%s\n", foodtable.getData());
		
		System.out.println(foodtable);
		
		System.out.println(ft);
		
	}
}
